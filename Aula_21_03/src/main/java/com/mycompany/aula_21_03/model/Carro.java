package com.mycompany.aula_21_03.model;

public class Carro {
    
private String chassi;
private String placa;
private Modelo modelo;    
private Pessoa propietario;


    //Getter e Setter Chassi
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    //Getter e Setter Placa
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //Getter e Setter Modelo
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    //Getter e Setter Propietario
    public Pessoa getPropietario() {
        return propietario;
    }

    public void setPropietario(Pessoa propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Carro{" + "chassi=" + chassi + 
                ", placa=" + placa + 
                ", modelo=" + modelo + 
                ", propietario=" + propietario + '}';
    }
    
    

    
}
