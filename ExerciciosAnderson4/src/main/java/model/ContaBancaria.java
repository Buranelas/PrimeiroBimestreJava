package model;


public class ContaBancaria {
    
    String nomeCliente;
    int numeroConta;
    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numeroConta, double Saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = Saldo;
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

    public void setSaldo(double Saldo) {
        this.saldo = Saldo;
    }
    
    public void sacar (double valor){
        if (valor > saldo){
            System.out.println("Saldo Insuficiente");
        }else{
            saldo -= valor;
        }
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
     public void mostrarDados() {
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
     
     
    
    
    
}
