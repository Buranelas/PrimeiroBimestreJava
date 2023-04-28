
package com.mycompany.lista1;

import javax.swing.JOptionPane;


public class Exercicio4 {


    public static void main(String[] args) {
         String input = "" ;
     int numero ;
     
     input = JOptionPane.showInputDialog("Me diga um número: ") ;
             numero = Integer.parseInt(input) ;
             
             if(numero%2 == 0){
                 double par = Double.parseDouble(input) * 0.20 + Double.parseDouble(input) ;
                 JOptionPane.showMessageDialog(null, "Valor total " + numero + "x 20% = " + par);
             } else{
                 double impar = Double.parseDouble(input) * 0.30 + Double.parseDouble(input) ;
                 JOptionPane.showMessageDialog(null, "Valor total " + numero + "x 30% = " + impar );
                 
             }
    }
    }
    

