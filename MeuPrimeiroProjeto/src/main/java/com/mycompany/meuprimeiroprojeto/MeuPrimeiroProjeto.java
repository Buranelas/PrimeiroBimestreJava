
package com.mycompany.meuprimeiroprojeto;

import javax.swing.JOptionPane;

public class MeuPrimeiroProjeto {

    public static void main(String[] args) {
        String input = "" ;
        
        input = JOptionPane.showInputDialog("Digite seu nome: ") ;
        
        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo " + input) ;
        
        int numero1 ;
        int numero2 ; 
        
        input = JOptionPane.showInputDialog("Informe um número: ") ;
        numero1 = Integer.parseInt( input ) ;
        
        input = JOptionPane.showInputDialog("Informe um segundo número: ") ;
        numero2 = Integer.parseInt( input ) ;
        
        int total = numero1 + numero2 ;
        
        if ( total > 6 ){
            JOptionPane.showMessageDialog(null, "Total maior que seis ");
        } else {
            JOptionPane.showMessageDialog(null, "Total somado = " + total ) ;
        }       
        
    }
}
