
package com.mycompany.aula_10_03;


public class Carro {
    
    boolean estadoVeiculo;
    String marca;
    String modelo;
    String placa;
    String nomedoDono;
    String chassi;
    double velocimetro;
    
    public void stLigar(){
        if(this.estadoVeiculo) {
            System.out.println("Carro já está ligado");
        }else{
             this.estadoVeiculo = true;
        }
    }
    
    public void stDesligar(){
        if(!this.estadoVeiculo){
            System.out.println("Carro já está desligado");
        }else{
            this.estadoVeiculo = false ;
        }
    }
    
    public void stAcelerar(){
        this.velocimetro = this.velocimetro + 10;
    }
    
    public void stFrear(){
        this.velocimetro = this.velocimetro - 10;
    }
    
    public void stImprimir(){
        System.out.println("Carro = Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nPlaca: " + this.placa +
                "\n Nome do Dono: " + this.nomedoDono +
                "\n Velocidade: " + this.velocimetro + 
                "\n Chassi: " + this.chassi +
                "\n Estado: " + this.estadoVeiculo);
    }
    
}
