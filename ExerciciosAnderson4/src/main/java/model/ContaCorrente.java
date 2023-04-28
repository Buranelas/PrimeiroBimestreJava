package model;

public class ContaCorrente extends ContaBancaria {
    
    double limite;
    
    @Override
    public void sacar(double valor){
        if(valor > saldo + limite){
            System.out.println("Limite de crédito excedido !" + "\nSaque não realizado");
        }else{
            saldo -= valor;
        }
    }

    public ContaCorrente() {
    }

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(double limite, String nomeCliente, int numeroConta, double Saldo) {
        super(nomeCliente, numeroConta, Saldo);
        this.limite = limite;
    }
    
    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
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
        System.out.println("Limite: " + limite);
    }
    
    
    
}
