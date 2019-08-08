/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transsim;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author senai
 */
public class Moto extends Auto{
    
    protected int conS = 1;
    protected int io = 0;
    protected int kmRoda = 1;
    
    public Moto(String modelo, String cor, String rodas, int vMax, int nMar, int capT,int kmR,int cusT,boolean sTatus) {
        super(modelo, cor, rodas, vMax, nMar, capT,kmR,cusT);
    }

    
    public void Ligar() {
        if (sTatus == true) {
            System.out.println("Ligado!!");
        } else {
        sTatus = false ;
            System.out.println("Desligado!!");
        sTatus = true;
            System.out.println("Ligando!!");
        }
             
    }

    @Override
    public void Desligar() {
        if (sTatus == false){
            System.out.println("Desligado!!");
        }else{
            sTatus = true;
            System.out.println("Ligado!!");
        }
        
    }

    @Override
    public void Abastecer() {  
        Scanner ler = new Scanner(System.in);
        if(capT == 0){
            System.out.println("Tanque Vasio!!\n Precisa Abastecer:\nQuantidade:");
        conS = ler.nextInt();
        
        this.capT = conS+this.capT;
        this.capT++;
        
    
        }else if (sTatus==true) {
            capT = 15;
            System.out.println("Combustivel Acabando!!\n Precisa Abastecer Logo:\nQuantidade:");
        conS = ler.nextInt();
        this.capT = conS+this.capT;
        this.capT++;
        
        }else if(sTatus==true) {
            capT = 10;
            System.out.println("Pouco Combustivel!!\n Precisa Abastecer Logo:\nQuantidade:");
        conS = ler.nextInt();
        
        this.capT = conS+this.capT;
        this.capT++;
    
           }
        System.out.println("Abastecido =D");
    }

    @Override
    public void TrocaPneu() {
    }

    @Override
    public void Acelerar() {
        //consumo
        for(int i=1;i<4;i++)
        this.capT = this.capT - i;
        
        if(sTatus==true){
            this.Ligar();
            System.out.println("Acelerando");
            do{ 
                conS = this.capT - conS;
                this.capT--;
                System.out.println("Consumindo =D");
                
                
                
            }while (capT != 5);
            
            this.Abastecer();
            
        }else{
            sTatus = false;
            System.out.println("Moto Desligada");
            
        }
    }

    @Override
    public void Status() {
        System.out.println("\nCor:  "+cor+"\nModelo:  "+modelo+"\nStatus  :"+sTatus+"\nTanque:"+capT);
    }   

    @Override
    public void KmRodados() {
       
       
       kmRoda = this.conS + this.kmRoda;
       this.kmRoda ++;
       
        System.out.println("\nKM:"+kmRoda);
    }

    @Override
    public void CustAbast() {
        this.cusT = cusT * conS;
        //this.cusT++;
        System.out.println("Custo de Abastecer:"+this.cusT+"R$");
    }
    
}
