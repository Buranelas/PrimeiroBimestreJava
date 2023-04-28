
package com.mycompany.aula_10_03;

import javax.swing.JOptionPane;


public class Geladeira {
    
    int porta;
    String marca;
    String cor;
    double quiloWhora;
    boolean frostfree;
    double litro;
    boolean stLigado;
    
    public void ligarGeladeira(){
        this.stLigado = true;
    }
    
    public void desligarGeladeira(){
        this.stLigado = false;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, 
                "Marca: " + marca +
                "\nNúmero de Portas: " + porta +
                "\nCor da Geladeira: " + cor +
                        "\nLigada?: " + stLigado);
    }
    
    public String retornarCor(){
        return this.cor;
    }
}
