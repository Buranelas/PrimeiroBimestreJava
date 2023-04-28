package com.mycompany.aula_21_03.model;

public class Marca {
    
    private String cnpj;
    private String nome;
    private String ie;
    private String logo;
    private Endereco endereco;

    //Getter e Setter Cnpj
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //Getter e Setter Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter e Setter Ie
    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    //Getter e Setter Logo
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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
        return "Marca{" + "cnpj=" + cnpj + 
                ", nome=" + nome +
                ", ie=" + ie + 
                ", logo=" + logo + 
                ", endereco=" + endereco + '}';
    }
    
    
    
}
