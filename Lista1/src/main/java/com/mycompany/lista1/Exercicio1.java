
package com.mycompany.lista1;

import javax.swing.JOptionPane;


public class Exercicio1 {

    public static void main(String[] args) {
        String input = "" ;
        int numero1 ;
        int numero2 ; 
        
        input = JOptionPane.showInputDialog("Informe um número: ") ;
        numero1 = Integer.parseInt( input ) ;
        
        input = JOptionPane.showInputDialog("Informe um segundo número: ") ;
        numero2 = Integer.parseInt( input ) ;
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "O Primeiro número é maior que o segundo");
        } else {
            JOptionPane.showMessageDialog(null, "O Segundo número é maior que o primeiro");
        }
      
    }
}
