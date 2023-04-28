
package com.mycompany.meuprimeiroprojeto;

import javax.swing.JOptionPane;


public class Exercicio2 {

    public static void main(String[] args) {
         String input = "" ;
        
        input = JOptionPane.showInputDialog("Digite seu nome: ") ;
        
        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo " + input) ;
    }
    
}
