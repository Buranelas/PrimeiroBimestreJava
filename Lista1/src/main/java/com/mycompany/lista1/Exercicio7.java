
package com.mycompany.lista1;

import javax.swing.JOptionPane;


public class Exercicio7 {

    public static void main(String[] args) {
      String input = "" ;
      int mes ;
      
      
      input = JOptionPane.showInputDialog("Qual mês você nasceu(número)?: ") ;
      mes = Integer.parseInt(input) ;
      
      switch(mes){
          case 1:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Janeiro");
          break;
          case 2:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Fevereiro");
          break;
          case 3:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Março");
          break;
          case 4:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Abril");
          break;
          case 5:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Maio");
          break;
          case 6:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Junho");
          break;
          case 7:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Julho");
          break;
          case 8:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Agosto");
          break;
          case 9:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Setembro");
          break;
          case 10:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Outubro");
          break;
          case 11:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Novembro");
          break;
          case 12:
              JOptionPane.showMessageDialog(null, "Mês correspondente : Dezembro");
          break;
      }
      
      
    }
    
}
