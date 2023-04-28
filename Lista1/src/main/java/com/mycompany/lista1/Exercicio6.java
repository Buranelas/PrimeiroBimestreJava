
package com.mycompany.lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {
    String input = "";
    int numero;
    
    input = JOptionPane.showInputDialog("Me diga um número: ") ;
    numero = Integer.parseInt(input) ;
    
    JOptionPane.showMessageDialog(null, "Este número : " + numero + 
            "\nTem como Antecessor: " + (numero-1) + 
            "\n Tem como Sucessor: " + (numero+1));
    
    }
    
}
