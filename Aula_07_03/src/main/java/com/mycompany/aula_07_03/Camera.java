package com.mycompany.aula_07_03;

public class Camera {
   
    private double milimetrosLente;
    private boolean stFlash;
    private boolean stAlca;
    private int qtdBotoes;
    private double qtdMemoria;
    private double qtdMegapixels;
    private boolean focoAutomatico;
    private double tamanhoBateria;
    private double tamanhoTela;
    
    public void setQtBotoes(int qtdBotoes){
        this.qtdBotoes = qtdBotoes ;
    }
    public void setQtdMemoria(double qtdMemoria){
        this.qtdMemoria = qtdMemoria ;
    }
    public void setQtdMegapixels(double qtdMegapixels){
        this.qtdMegapixels = qtdMegapixels ;
    }
    
    public void imprimir(){
        System.out.println("Qtd Botões: " + this.qtdBotoes);
        System.out.println("Qtd Memória: " + this.qtdMemoria);
        System.out.println("Qtd MegaPixels: " + this.qtdMegapixels);
    }
    

    
    
}
