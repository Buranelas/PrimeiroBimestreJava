
package com.mycompany.meuprimeiroprojeto;

import javax.swing.JOptionPane;


public class Exercicio6 {

public static void main(String[] args) {
    String dolar = "" ;
    
    dolar = JOptionPane.showInputDialog("Quanto está o dolar?: ") ;
     
    double dolar1 = (Double.parseDouble(dolar) * 0.01 + (Double.parseDouble(dolar)));
    double dolar2 = Double.parseDouble(dolar) * 0.02 + (Double.parseDouble(dolar)) ;
    double dolar5 = Double.parseDouble(dolar) * 0.05 + (Double.parseDouble(dolar)) ;
    double dolar10 = Double.parseDouble(dolar) * 0.10 + (Double.parseDouble(dolar)) ;
     
    
    JOptionPane.showMessageDialog(null, 
            "Se esse valor subir 1%, custará: " + (dolar1) +
    "\nSe esse valor subir 5%, custará: " + (dolar2) +
                  "\nSe esse valor subir 10%, custará: " + (dolar5) +
                    "\nSe esse valor subir 15%, custará: " + (dolar10));
    
    
            
    
    }
    
}
