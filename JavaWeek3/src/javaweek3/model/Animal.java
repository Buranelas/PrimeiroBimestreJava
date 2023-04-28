
package javaweek3.model;

public class Animal {
    private String nome;
    private double forca;
    private double defesa;
    private double velocidade;

    public Animal(String nome, double forca, double defesa, double velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }
    
    public double getForca(){
        return forca;
    }
    
    public void setForca(double forca){
        this.forca = forca;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    @Override
    public String toString() {
        return "\n Animal:  [Nome: " + nome +" | Força: " + forca + " | Defesa: " + defesa + " | Velocidade: " + velocidade + "] \n" ;
    }
    
    
    
    
}
