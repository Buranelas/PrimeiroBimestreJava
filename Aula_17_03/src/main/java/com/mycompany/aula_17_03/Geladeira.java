
package com.mycompany.aula_17_03;

import javax.swing.JOptionPane;


public class Geladeira {
    
    private boolean ligado;
    private boolean portaFechada;
    
    
    //Funcao Ligar
    public void ligarGeladeira() {
        this.ligado = true;
    }
    
    
    //Funcao Desligar
    public void desligarGeladeira() {
        this.ligado = false;
    }
    
    
    //Funcao Abrir Porta
    public void abrirPorta() {
        this.portaFechada = false;
    }
    
    
    //Funcao Fechar Porta
    public void fecharPorta() {
        this.portaFechada = true;
    }
    
    
    public boolean isLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean isPortaFechada() {
        return portaFechada;
    }
    
    public void setPortaFechada(boolean portaFechada) {
        this.portaFechada = portaFechada;
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Geladeira: Ligado = " + this.ligado +
                "\n Porta fechada = " + this.portaFechada);
    }  
    
}
