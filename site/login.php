<html>
    <!DOCTYPE html>
<head>
    <meta charset="UTF-8"/>
    <title><USANDO POST></title>
    <body>
        <?php

            $servername = "localhost";
            $username = "root";
            $password = "";

            $link = mysqli_connect($servername, $username, $password);
            
            if (!$link) {
                die('Conexão Falhou: ' . mysql_error());
            }
            
            $db_selected = mysqli_select_db($link, 'bd_site');
            
            if (!$db_selected) {
                die ('Can\'t use  : ' . mysql_error());
            }

            echo "Conectado com Sucesso <br>";

            $usuario = $_POST["usuario"];
            $senha = $_POST["senha"];

            $sql = ("SELECT usuario, senha FROM senhauser 
                    WHERE usuario='".$usuario."' AND senha='".$senha."'");

            $result = mysqli_query($link, $sql);

            if (!$result) {
                $message  = 'Invalid query: ' . mysql_error() . "\n";
                $message .= 'Whole query: ' . $sql;
                die($message);
            }

            $usuarioBanco = "";
            $senhaBanco = "";

            if (mysqli_num_rows($result) > 0) {
                // output data of each row
                while($row = mysqli_fetch_assoc($result)) {
                    $usuarioBanco = "".$row["usuario"];
                    $senhaBanco = "".$row["senha"];
                }
            } else {
                echo "0 Resultados <br>";
            }

            if($usuario != $usuarioBanco) {
                echo "O Usuário <b>" . $usuario . "</b> não está cadastrado!";
            }
        
             else {
                echo "Login realizado com sucesso. <br>Seja bem vindo <b>" . $usuario . "</b>!";
            }
            mysqli_close($link);
        ?>
    </body>
</html>