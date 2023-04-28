package com.mycompany.exerciciosanderson4;

import javax.swing.JOptionPane;
import model.ContaBancaria;
import model.ContaCorrente;
import model.ContaInvestimento;

public class ExerciciosAnderson4 {

    public static void main(String[] args) {
        
        
        /* --------------------------------Classe conta bancária-------------------------------------
        ContaBancaria contaBanco = new ContaBancaria();
        
        contaBanco.setNomeCliente("João");
        contaBanco.setNumeroConta(1556688);
        contaBanco.setSaldo(1000);
        
        JOptionPane.showMessageDialog(null, "Saldo Atual: " + contaBanco.getSaldo());
        contaBanco.sacar(500);
        JOptionPane.showMessageDialog(null, "Saque Realizado" +
                "\nSaldo Atual: " + contaBanco.getSaldo());
        contaBanco.sacar(2000);
        JOptionPane.showMessageDialog(null, "Saldo Inválido para saque: "+
                "\nSaldo Atual: " + contaBanco.getSaldo());
        contaBanco.depositar(100);
        JOptionPane.showMessageDialog(null, "Deposito Realizado" +
                "\nSaldo Atual: " + contaBanco.getSaldo());
        
        //-------------------------------------------------------------------------------------------------*/
        /* --------------------------------Classe conta corrente--------------------------------------
        ContaCorrente cc = new ContaCorrente();
        cc.setNomeCliente("João");
        cc.setNumeroConta(1556688);
        cc.setSaldo(1000);
        cc.setLimite(5000);
        
        cc.sacar(1500);
        JOptionPane.showMessageDialog(null, "Saldo após saque: " + cc.getSaldo());
        //-------------------------------------------------------------------------------------------------*/
        /* --------------------------------Classe conta investimento---------------------------------
        ContaInvestimento ci = new ContaInvestimento();
        ci.setDiaRendimento(15);
        ci.setNomeCliente("João");
        ci.setNumeroConta(1556688);
        ci.setSaldo(1000);
        
        ci.calcularNovoSaldo(5.5);
        JOptionPane.showMessageDialog(null, "Saldo após rendimento: " + ci.getSaldo());
        //-------------------------------------------------------------------------------------------------*/
        ContaCorrente cc = new ContaCorrente(1000, "João", 1556688, 1500);
        ContaInvestimento ci = new ContaInvestimento(15, "João", 1556688, 1500);
        
        cc.sacar(500);//Saque Conta Corrente
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        
        ci.sacar(600);//Saque Conta Investimento
        System.out.println("Saldo Conta Investimento: " + ci.getSaldo());
        
        cc.depositar(1450);//Desposito Conta Corrente
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        
        ci.depositar(1200);//Deposito Conta Investimento
        System.out.println("Saldo Conta Investimento: " + ci.getSaldo());
        
        ci.calcularNovoSaldo(2.5);//Investimento aplicado
        System.out.println("Saldo após Investimento: " + ci.getSaldo());
        
        //Dados Conta Corrente
        System.out.println("\nDados da Conta Corrente:");
        cc.mostrarDados();
        //Dados Conta Investimento
        System.out.println("\nDados da Conta Investimento:");
        ci.mostrarDados();
    }
}
