
package com.mycompany.exerciciosanderson;

import javax.swing.JOptionPane;
import model.Pessoa;

public class EX1 {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        String input = "";
        
        input = JOptionPane.showInputDialog("Qual seu nome?: ");
        pessoa.setNome(input);
        
        input = JOptionPane.showInputDialog("Qual a sua idade?: ");
        pessoa.setIdade(Integer.parseInt(input));
        
        JOptionPane.showMessageDialog(null, pessoa.getNome() + " , você tem " + pessoa.getIdade() + " anos.");
        
    }
}
