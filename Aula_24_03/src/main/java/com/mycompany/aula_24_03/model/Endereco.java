
package com.mycompany.aula_24_03.model;


public class Endereco {
    
    private String nmRua;
    private int nmCasa;
    private String nmCidade;
    private String dsComplemeno;
    private String cep;
    private String nmBairro;
    
    public Endereco(){
        this.nmRua = "Rua tal";
        this.nmCidade = "Ciade tal";
        this.nmCasa = 999;
        this.nmBairro = "Bairro tal";
        this.dsComplemeno = "Complemento tal";
        this.cep = "85902250";
        
    }
    
    public Endereco(String nmRua, int nmCasa, String nmCidade,
            String dsComplemento, String cep, String nmBairro){
        this.cep = cep;
        this.nmRua = nmRua;
        this.nmCasa = nmCasa;
        this.nmCidade = nmCidade;
        this.nmBairro = nmBairro;
        this.dsComplemeno = dsComplemento;
        
        
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public int getNmCasa() {
        return nmCasa;
    }

    public void setNmCasa(int nmCasa) {
        this.nmCasa = nmCasa;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getDsComplemeno() {
        return dsComplemeno;
    }

    public void setDsComplemeno(String dsComplemeno) {
        this.dsComplemeno = dsComplemeno;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }
    
    
    
}
