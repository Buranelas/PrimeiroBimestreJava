package com.mycompany.aula_21_03.model;

public class Endereco {
    
    private String cep;
    private String nmRua;
    private int nmCasa;
    private String complemento;
    private String estado;
    private String nmCidade;
    private String pais;

    //Getter e Setter Cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    //Getter e Setter nmRua
    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    //Getter e Setter nmCasa
    public int getNmCasa() {
        return nmCasa;
    }

    public void setNmCasa(int nmCasa) {
        this.nmCasa = nmCasa;
    }

    //Getter e Setter Complemento
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //Getter e Setter Estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Getter e Setter nmCidade
    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    //Getter e Setter Pais
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ","
                + " nmRua=" + nmRua + 
                ", nmCasa=" + nmCasa +
                ", complemento=" + complemento + 
                ", estado=" + estado + 
                ", nmCidade=" + nmCidade + 
                ", pais=" + pais + '}';
    }
    
    
    
}
