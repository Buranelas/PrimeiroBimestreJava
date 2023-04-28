
package com.mycompany.aula_10_03;

import javax.swing.JOptionPane;

public class Exercicio2 {

  
    public static void main(String[] args) {
        
        String input = "" ;
        
        Geladeira geladeira = new Geladeira() ;
        
        /* geladeira.porta = Integer.parseInt(JOptionPane.showInputDialog
        ("Quantas portas tem a sua geladeira?: ") );
        
        geladeira.quiloWhora = Double.parseDouble(JOptionPane.showInputDialog
        ("Quantos kW/hr gasta sua geladeira?: "));
        
        geladeira.litro = Double.parseDouble(JOptionPane.showInputDialog
        ("Quantos litros tem a sua geladeira?: ")); */
        
        geladeira.ligarGeladeira();
        geladeira.imprimir();
        geladeira.desligarGeladeira();
        geladeira.imprimir();
        
        String corGeladeira = geladeira.retornarCor();
        System.out.println(corGeladeira);
        
        /* input = JOptionPane.showInputDialog("Sua Geladeira é FrostFree?: ") ;
        
        if(input.toUpperCase().equals("SIM")){
            geladeira.frostfree = true;
            input = "Sim";
        }else{
            geladeira.frostfree = false;
            input = "Não";
        }
        
        JOptionPane.showMessageDialog(null, "Quantas portas: " + geladeira.porta +
                "\nQuantos kW/hr: " + geladeira.quiloWhora +
                "\nQuantos Litros: " + geladeira.litro +
                "\nÉ FrostFree?: " + input); */
        
    }
    
}
