
package com.mycompany.lista1;

import javax.swing.JOptionPane;


public class Exercicio10 {

    public static void main(String[] args) {
       String input = "";
       String nome = "";
       double nota1;
       double nota2;
       double nota3;
       double nota4;
       
       nome = JOptionPane.showInputDialog("Qual seu nome?: ");
       
       input = JOptionPane.showInputDialog(nome + " Qual foi a nota do seu Primeiro Bimestre?: ") ;
       nota1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(nome + " Qual foi a nota do seu Segundo Bimestre?: ") ;
       nota2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(nome + " Qual foi a nota do seu Terceiro Bimestre?: ") ;
       nota3 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(nome + " Qual foi a nota do seu Quarto Bimestre?: ") ;
       nota4 = Double.parseDouble(input);
       
       double media = (nota1 + nota2 + nota3 + nota4) / 4;
               
       if(media>60){
           JOptionPane.showMessageDialog(null, 
                   "Sua média anual foi: " + media + 
                           "\nVocê está Aprovado");
       }else{
           JOptionPane.showMessageDialog(null, 
                   "Sua média anual foi: " + media +
                           "\nVocê está Reprovado");
       }
       
    }
    
}
