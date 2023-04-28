
package com.mycompany.lista1;

import javax.swing.JOptionPane;

public class Exercicio2 {


    public static void main(String[] args) {
       String nome = "";
       String sexo = "";
       String idade = "";
       
       nome = JOptionPane.showInputDialog("Qual seu nome?: ") ;
       sexo = JOptionPane.showInputDialog("Qual seu sexo?: ") ;
       idade = JOptionPane.showInputDialog("Qual sua idade ?: ") ;
       
       JOptionPane.showMessageDialog(null, 
               "Seu nome: " + nome +
                       "\nSeu sexo: " + sexo +
                               "\nSua Idade: " + idade);
       
       
    }
    
}
