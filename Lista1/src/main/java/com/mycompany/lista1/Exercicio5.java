
package com.mycompany.lista1;

import javax.swing.JOptionPane;


public class Exercicio5 {

 
    public static void main(String[] args) {
      String input = "";
      int ano;
      int mes;
      int dia;
      
      input = JOptionPane.showInputDialog("Quantos Anos você tem?: ") ;
              ano = Integer.parseInt(input) ;
      input = JOptionPane.showInputDialog("Quantos Meses você tem?: ") ;
              mes = Integer.parseInt(input) ;
      input = JOptionPane.showInputDialog("Quantos Dias você tem?: ") ;
              dia = Integer.parseInt(input) ;
              
              int total = (ano * 365) + (mes * 30) + dia ;
              
              JOptionPane.showMessageDialog(null, "Levando isso em conta voce tem " + total + " dias de vida.");
              
              
              
              
    }
    
}
