
package com.mycompany.aula_10_03;

import javax.swing.JOptionPane;


public class RetanguloEx {

 
    public static void main(String[] args) {
       Retangulo r = new Retangulo();
       r.setComprimento(4);
       r.setLargura(3);
       
       
        JOptionPane.showMessageDialog(null, "Área calculada: " + r.getArea() +
                "\n Perímetro calculado: " + r.getPerimetro());
    }
    
}
