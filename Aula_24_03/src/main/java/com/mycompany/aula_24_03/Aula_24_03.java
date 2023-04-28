
package com.mycompany.aula_24_03;

import com.mycompany.aula_24_03.model.Agencia;
import com.mycompany.aula_24_03.model.Banco;
import com.mycompany.aula_24_03.model.Conta;
import com.mycompany.aula_24_03.model.Endereco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Aula_24_03 {

    public static void main(String[] args) {

        boolean stContinua = true;
        List lista = new ArrayList();
        ArrayList<Banco> listBancos = new ArrayList<>();
                while (stContinua) {
                    String input = JOptionPane.showInputDialog("Deseja Adicionar um novo nome?: " + 
                            " (S) para SIM e (N) para NAO");
                    if(input.toUpperCase().equals("S")){
                        input = JOptionPane.showInputDialog("Digite o nome: ");
                        lista.add(input);
                    }else{
                        stContinua = false;
                    }
                    System.out.println("Tamanho da Lista: " + lista.size());
                }
        
        Endereco enderecoEntrega = new Endereco() ;
         
        String input = JOptionPane.showInputDialog("Informe o Nome da rua: ");
        enderecoEntrega.setNmRua(input);
        
        input = JOptionPane.showInputDialog("Informe o Numero da casa: ");
        enderecoEntrega.setNmCasa(Integer.parseInt(input));
        
        input = JOptionPane.showInputDialog("Informe o Complemento: ");
        enderecoEntrega.setDsComplemeno(input);
        
        input = JOptionPane.showInputDialog("Informe o Nome da cidade: ");
        enderecoEntrega.setNmCidade(input);
        
        input = JOptionPane.showInputDialog("Informe o CEP: ");
        enderecoEntrega.setCep(input);
        
        input = JOptionPane.showInputDialog("Informe o Nome do Bairro: ");
        enderecoEntrega.setNmBairro(input);   
        
        System.out.println(enderecoEntrega.toString());
        enderecoEntrega.setDsComplemeno(enderecoEntrega.getDsComplemeno() 
                + " -------------085 ");
        System.out.println(enderecoEntrega.toString());
        
        Conta contaCorrente = new Conta();
        
        contaCorrente.setEnderecoEntregaCartao(enderecoEntrega);
        
        input = JOptionPane.showInputDialog("Qual o seu CPF: ");
        contaCorrente.setCpfCorrentista(input);
        
        input = JOptionPane.showInputDialog("Qual o numero da sua conta: ");
        contaCorrente.setNrConta(input);
        
        input = JOptionPane.showInputDialog("Qual o tipo da conta: ");
        contaCorrente.setTpConta(input);
        
        input = JOptionPane.showInputDialog("Qual o valor do Crédito: ");
        contaCorrente.setVlCredito(Integer.parseInt(input));
        
        input = JOptionPane.showInputDialog("Qual o valor do Limite: ");
        contaCorrente.setVlLimite(Integer.parseInt(input));
        
        input = JOptionPane.showInputDialog("Qual o Saldo : ");
        contaCorrente.setVlSaldo(Integer.parseInt(input));
        
        Endereco enderecoAgencia = new Endereco("Avenida Parigot", 111, "Cascavel", "Rua tal", "85900230", "Centro");
        
        Agencia agenciaBancoBrasil = new Agencia();
        
        input = JOptionPane.showInputDialog("Qual o número da agencia: ");
        agenciaBancoBrasil.setNrAgencia(input);
        
        input = JOptionPane.showInputDialog("Qual o nome da agencia: ");
        agenciaBancoBrasil.setNmAgencia(input);
        
        agenciaBancoBrasil.setEnderecoAgencia(enderecoAgencia);
        
        Banco banco01 = new Banco();
        
        banco01.setAgencia(agenciaBancoBrasil);
        
        input = JOptionPane.showInputDialog("Qual o nome do Banco: ");
        banco01.setNmBanco(input);
        
        input = JOptionPane.showInputDialog("Qual o número do Banco: ");
        banco01.setNrBanco(input);
        
              
        
    }
}
