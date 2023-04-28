
package com.mycompany.meuprimeiroprojeto;

import javax.swing.JOptionPane;


public class Exercicio3 {


    public static void main(String[] args) {
        String input = "" ;
        String input2 = "" ;
        
        input = JOptionPane.showInputDialog(null, "Qual disciplina você mais gosta ?: ");
        
        
        input2 = JOptionPane.showInputDialog(null, "Qual disciplina você menos gosta?: ");
        
        JOptionPane.showMessageDialog(null, 
                "Disciplina que você mais precisa estudar: " + input + 
                        "\n Disciplina que você pode levar com tranquilidade: " + input2 );
               
       
    }
    
}
