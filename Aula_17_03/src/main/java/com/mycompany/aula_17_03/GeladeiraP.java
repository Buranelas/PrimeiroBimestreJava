
package com.mycompany.aula_17_03;


public class GeladeiraP {


    public static void main(String[] args) {
      
         Geladeira geladeira = new Geladeira();
        geladeira.imprimir(); // Imprime: "Geladeira: Ligado = false, Porta fechada = true"
        
        geladeira.setLigado(true);
        geladeira.abrirPorta();
        geladeira.imprimir(); // Imprime: "Geladeira: Ligado = true, Porta fechada = false"
        
        geladeira.setPortaFechada(true);
        geladeira.setLigado(false);
        geladeira.imprimir(); // Imprime: "Geladeira: Ligado = false, Porta fechada = true"
        
    }
    
}
