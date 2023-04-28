
package com.mycompany.aula_10_03;

import javax.swing.JOptionPane;


public class ExercicioCarro {


    public static void main(String[] args) {
       
        Carro celta = new Carro();
        
        celta.chassi = "11111111111";
        celta.marca = "GM";
        celta.modelo = "celta";
        celta.nomedoDono = "João";
      /*  
        celta.stDesligar();
        celta.stLigar();
        celta.stImprimir();
        System.out.println("-------------");
        celta.stAcelerar();
        celta.stAcelerar();
        celta.stImprimir();
        System.out.println("-------------");
        celta.stFrear();
        celta.stFrear();
        celta.stImprimir();
        */
        
      do{
                String input = JOptionPane.showInputDialog("Deseja Frear(F) " + "ou Acelerar(A) ?");
        
        if(input.toUpperCase().equals("F")){
            celta.stFrear();
        }else if(input.toUpperCase().equals("A")){
            celta.stAcelerar();
        }else{
            System.out.println("Opção Inválida");
        }
        
        celta.stImprimir();
        
        } while(celta.velocimetro < 60)   ;
    }
    
}
