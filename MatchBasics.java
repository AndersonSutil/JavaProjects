package javaapplication2;

import java.io.InputStream;
import java.util.Scanner;

public class MatchBasics {

    
  
    private void Func(){
        
    }
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int soma,mult,subi,divi,rest,resut = 0,i=0;
        
        soma= num + num;
        mult= num * num;
        subi= num - num;
        divi= num / num;
        rest= num % num;
        
        
        
      
        System.out.println("\nToma no Cu do Java\n"+"\nNumero:\n"+num+"\nSoma:\n"+soma+"\nMultiplicação:\n"+mult+"\nsubitração:\n"+subi+"\nDivisão:\n"+divi+"\nResto da divisção:\n"+rest);
        System.out.println("Tabuada:\n"+num);
        for (  i = 0 ; i <= 10; i++) {
             resut = i * num;  
             System.out.println("\n "+ i +" x "+num+" = " + (resut =  num * i));
        }
       
        
    
    }

   
    
        } 

    

