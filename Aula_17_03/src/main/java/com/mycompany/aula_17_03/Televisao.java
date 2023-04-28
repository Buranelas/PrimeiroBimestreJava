
package com.mycompany.aula_17_03;


public class Televisao {

   
    public static void main(String[] args) {
       
        TelevisaoF tv = new TelevisaoF(false, 1, 5, 10, 10);
        tv.imprimir();
        tv.ligar();
        tv.aumentarVolume();
        tv.alterarCanalParaCima();
        tv.imprimir();
        tv.desligar();
        tv.imprimir();
        
    }
    
}
