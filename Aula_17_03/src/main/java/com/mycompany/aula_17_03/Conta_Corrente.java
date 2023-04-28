
package com.mycompany.aula_17_03;

import javax.swing.JOptionPane;

/*Criar uma classe que represente uma conta corrente e deve se verificar os atributos necessarios, 
alem dos seguintes obrigatorios, saldo e limite e os metodos de sacar, depositar e imprimir extrato.
Deve se adicionar as validações necessarias condizentes com o funcionameno de uma conta corrente*/


public class Conta_Corrente {

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
