/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transsim;

/**
 *
 * @author Anderson Sutil
 * 
 */
public class TransSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto mt1 = new Moto("CB150", "branca"," 2 ", 150, 5, 20, 10,4, true);
     
        mt1.Status();
        mt1.KmRodados();
        
        System.out.println("                    \n "+
"                                    +++++++++++\n" +
"+++  ++  +++++                     +++++++++++++\n" +
"++   ++    ++                     ++++       ++++\n" +
"++++++++++++++++++++++++++++++++++++          ++\n" +
"=================================++            +\n" +
"\"\"\"\"\"===    ++++++++++++++++++++++            ++\n" +
"		      		  +++        +++\n" +
"				  ++++      ++++\n" +
"				   +++++++++++++\n" +
" 	                            +++++++++++\n");
        
        mt1.Ligar();
        mt1.Desligar();
        mt1.Acelerar();
        mt1.Abastecer();
        System.out.println("Status Atual");
        
        mt1.KmRodados();
        mt1.CustAbast();
        
        mt1.Status();
        
    }
    
}
