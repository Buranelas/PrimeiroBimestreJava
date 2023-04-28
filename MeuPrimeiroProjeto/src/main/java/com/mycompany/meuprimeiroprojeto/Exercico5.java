
package com.mycompany.meuprimeiroprojeto;

import javax.swing.JOptionPane;

public class Exercico5 {


    public static void main(String[] args) {
        String preco = "" ;
        String quilo = "" ;
        
        preco = JOptionPane.showInputDialog("Qual o preço da Batatinha?: ");
        
        quilo = JOptionPane.showInputDialog("Quantos quilos irá querer ?: ") ;
        
        double valor = Double.parseDouble(quilo) * Double.parseDouble(preco) ;
        
        JOptionPane.showMessageDialog(null, 
                quilo + "KG de batatinha custarão R$" + Math.round(valor) );
               
    }
    
}
