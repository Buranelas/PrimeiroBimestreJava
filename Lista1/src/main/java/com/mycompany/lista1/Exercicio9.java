
package com.mycompany.lista1;

import javax.swing.JOptionPane;


public class Exercicio9 {


    public static void main(String[] args) {
        String input = "";
        double numero1;
        double numero2;
        
        
        input = JOptionPane.showInputDialog("Digite o 1º Número: ") ;
        numero1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Digite o 2º Número: ") ;
        numero2 = Double.parseDouble(input);
      
        double soma;
        soma = numero1 + numero2;
        double sub;
        if(numero1 > numero2){
            sub = numero1 - numero2;
        } else{
            sub = numero2 - numero1;
        }
        double div;
        if(numero1>numero2){
            div = numero1 / numero2;
        }else{
            div = numero2 / numero1 ;
        }
        
        
        
        JOptionPane.showMessageDialog(null, 
                "A soma dos números é: " + soma +
        "\nA subtração dos números é: " + sub +
                "\nA divisão dos números é: " + div) ;
        
    }
    
}
