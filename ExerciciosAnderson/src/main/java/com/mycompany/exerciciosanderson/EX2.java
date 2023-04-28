
package com.mycompany.exerciciosanderson;

import javax.swing.JOptionPane;
import model.ContaBanco;


public class EX2 {

    public static void main(String[] args) {
       
        ContaBanco cb = new ContaBanco(JOptionPane.showInputDialog("Qual a sua conta?: "), 
           Double.parseDouble(JOptionPane.showInputDialog("Qual seu saldo atual?: ")), 
           Double.parseDouble(JOptionPane.showInputDialog("Qual seu Limite?: ")));
   
   
     String input = " " ;
   
   do{
        input = JOptionPane.showInputDialog("Este é o saldo atual da sua conta: " + cb.getSaldo() +
                "\n O que deseja fazer a seguir?: " + 
                "\n DEPOSITAR (D)" +
                "\n SACAR(S)" + 
                "\n CONSULTAR EXTRATO(E)" +
                "\n SAIR(X)");
        
        if(input.toUpperCase().equals("D")){
           input = JOptionPane.showInputDialog("Quanto deseja depositar?: ") ;
           cb.depositar(Double.parseDouble(input));
            
        }else if(input.toUpperCase().equals("S")){
            input = JOptionPane.showInputDialog("Quanto deseja sacar?: ") ;
            cb.sacar(Double.parseDouble(input));
        }else if(input.toUpperCase().equals("E")){
           cb.imprimirExtrato();
        }else if(input.toUpperCase().equals("X")){
            JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
        }else{
            JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
       
   }while(!input.toUpperCase().equals("X"));
        
    }
    
}
