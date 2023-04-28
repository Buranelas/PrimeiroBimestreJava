package model;

import java.util.Date;

public class ContaInvestimento extends ContaBancaria {
    
    int diaRendimento;
    
    public void calcularNovoSaldo(double calculo){
        Date d = new Date();
        int diaAtual = d.getDate();
        if(diaAtual == diaRendimento){
            double rendimento = saldo * calculo / 100;
            saldo += rendimento;
            System.out.println("Novo saldo após rendimento: " + saldo);
        }
    }

    public ContaInvestimento() {
    }

    public ContaInvestimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaInvestimento(int diaRendimento, String nomeCliente, int numeroConta, double Saldo) {
        super(nomeCliente, numeroConta, Saldo);
        this.diaRendimento = diaRendimento;
    }

    
    
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados(); 
        System.out.println("Dia do rendimento: " + diaRendimento);
    }
    
    
}
