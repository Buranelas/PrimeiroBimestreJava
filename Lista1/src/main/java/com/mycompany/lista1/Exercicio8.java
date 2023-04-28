
package com.mycompany.lista1;

import javax.swing.JOptionPane;

 class Exercicio8 {


    public static void main(String[] args) {
        String input = "";
        String input2 = "";
        String input3 = "";
        double salario1;
        double salario2;
        double salario3;
        
        input = JOptionPane.showInputDialog("Informe o seu salário atual: ");
        salario1 = Double.parseDouble(input );
        input2 = JOptionPane.showInputDialog("Informe o seu salário atual: ");
        salario2 = Double.parseDouble(input2) ;
        input3 = JOptionPane.showInputDialog("Informe o seu salário atual: ");
        salario3 = Double.parseDouble(input3) ;
        
        double media = (salario1 + salario2 + salario3) / 3 ;
        
        JOptionPane.showMessageDialog(null, "A média de salários é: " + Math.round(media));
        
        
        
    }
    
}
