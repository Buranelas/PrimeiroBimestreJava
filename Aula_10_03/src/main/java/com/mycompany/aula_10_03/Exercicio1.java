

package com.mycompany.aula_10_03;

import javax.swing.JOptionPane;


public class Exercicio1 {

    public static void main(String[] args) {
        String input = "";
       
        Retangulo ret = new Retangulo();
        ret.largura = Double.parseDouble(JOptionPane.showInputDialog
        ("Qual a largura do seu Retangulo ?: ")) ;
        
        ret.comprimento = Double.parseDouble(JOptionPane.showInputDialog
        ("Qual o comprimento do seu Retangulo?: "));
        
        ret.area = ret.largura * ret.comprimento ;
        ret.perimetro = (ret.largura*2) + (ret.comprimento*2) ;
        
        JOptionPane.showMessageDialog(null, "A Área do seu Retângulo é: " + ret.area + 
                "\nO Perímetro do seu Retângulo é: " + ret.perimetro);
       
        
    }
}
