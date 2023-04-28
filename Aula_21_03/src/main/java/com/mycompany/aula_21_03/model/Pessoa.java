
package com.mycompany.aula_21_03.model;


public class Pessoa {
    
    private String cpf;
    private String nmPessoa;
    private Endereco endereco;

    //Getter e Setter Cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Getter e Setter nmPessoa
    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

    //Getter e Setter Endereco
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + 
                ", nmPessoa=" + nmPessoa + 
                ", endereco=" + endereco + '}';
    }
    
    
    
}
