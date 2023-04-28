
package com.mycompany.meuprimeiroprojeto;

import javax.swing.JOptionPane;


public class Exercicio4 {

    
    public static void main(String[] args) {
        String input = "";
        int numero;
        
        input = JOptionPane.showInputDialog("Informe sua idade: ");
        numero = Integer.parseInt( input ) ;
        
        JOptionPane.showMessageDialog(null, "Idade Informada: " + numero);
    }
    
}
