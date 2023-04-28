
package model;

import javax.swing.JOptionPane;


public class ContaBanco {
    
    private String conta;
    private double saldo;
    private double limite;
    
 public ContaBanco (String numeroConta, double saldoInicial, double limite) {
        this.conta = numeroConta;
        this.saldo = saldoInicial;
        this.limite = limite;
    }
 
 
 //Getters & Setter (NumeroConta)
 public String getNumeroConta() {
        return conta;
    }

    public void setNumeroConta(String numeroConta) {
        this.conta = numeroConta;
    }

    
    //Getters & Setter (Saldo)
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    //Getter & Setter (Limite)
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //Metodo Depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            JOptionPane.showMessageDialog(null, "\nDepósito realizado. Saldo atual: R$ " + this.saldo);
        } else {
            JOptionPane.showMessageDialog(null, "\nValor de depósito inválido.");
        }
    }
    
    //Metodo Sacar
    public void sacar(double valor){
        if(valor <= 0){
            JOptionPane.showMessageDialog(null, "\nValor de saque inválido !");
            return;
        }
        if(valor > this.saldo + this.limite ){
            JOptionPane.showMessageDialog(null, "\nSaldo ou Limite Insuficinte para saque ");
            return;
        }
        
        this.saldo -= valor;
        JOptionPane.showMessageDialog(null, "\nSaque realizado. Saldo atual: R$ " + this.saldo);
    }
    
    public void imprimirExtrato() {
        JOptionPane.showMessageDialog(null,
                "Número da conta: " + this.conta +
                "\nSaldo atual: R$ " + this.saldo +
                "\nLimite: R$ " + this.limite);
        }
    
}
