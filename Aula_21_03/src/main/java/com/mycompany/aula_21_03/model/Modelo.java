
package com.mycompany.aula_21_03.model;


public class Modelo {
    
    private int id;
    private String nmModelo;
    private Marca marca;
    private int anoLancamento;

    //Getter e Setter Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter e Setter nmModelo
    public String getNmModelo() {
        return nmModelo;
    }

    public void setNmModelo(String nmModelo) {
        this.nmModelo = nmModelo;
    }

    //Getter e Setter Marca
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    //Getter e Setter anoLancamento
    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + 
                ", nmModelo=" + nmModelo + 
                ", marca=" + marca + 
                ", anoLancamento=" + anoLancamento + '}';
    }
    
    
    
}
