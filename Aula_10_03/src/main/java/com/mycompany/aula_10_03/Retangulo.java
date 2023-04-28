
package com.mycompany.aula_10_03;


public class Retangulo {
    
    private double comprimento;
    private double largura;
    private double area;
    private double perimetro;
    
    //Setter
    public void setComprimento(double comprimento){
        this.comprimento = comprimento ;
        this.calcular();
        
    }
    
    public void setLargura(double largura){
        this.largura = largura ;
        this.calcular();
        
    }
    
    //Getter
    public double getComprimento(){
        return this.comprimento ; 
    }
    
    public double getLargura(){
        return this.largura ;
    }
    
    public double getArea(){
        return this.area ;
    }
    
    public double getPerimetro(){
        return this.perimetro ;
    }
    
    private void calcularArea(){
        area = comprimento * largura ;
    }
    
    private void calcularPerimetro(){
        perimetro = (comprimento * 2) + (largura * 2) ;
    }
    
    private void calcular(){
        this.calcularPerimetro();
        this.calcularArea();
    }
    
}
