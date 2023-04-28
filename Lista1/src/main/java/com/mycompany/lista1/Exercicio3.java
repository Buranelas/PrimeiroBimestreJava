
package com.mycompany.lista1;

import javax.swing.JOptionPane;


public class Exercicio3 {

  
    public static void main(String[] args) {
     String input = "" ;
     int numero ;
     
     input = JOptionPane.showInputDialog("Me diga um número: ") ;
             numero = Integer.parseInt(input) ;
             
             if(numero%2 == 0){
                 JOptionPane.showMessageDialog(null, "Este número é par !");
             } else{
                 JOptionPane.showMessageDialog(null, "Este número é ímpar !");
             }
    }
    
}
