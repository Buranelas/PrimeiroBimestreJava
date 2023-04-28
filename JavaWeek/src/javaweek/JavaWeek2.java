
package javaweek;

import javax.swing.JOptionPane;

public class JavaWeek2 {

   
    public static void main(String[] args) {
       
       double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nota final: "));
       
       if(nota <= 60.0 && nota >=40.0){
           JOptionPane.showMessageDialog(null, "Precisa fazer prova substitutiva") ;
       }else if(nota > 60.0){
           JOptionPane.showMessageDialog(null, "Parábens você foi aprovado!") ;
       }else{
           JOptionPane.showMessageDialog(null, "Você foi Reprovado =(") ;
       }
    }
    
}
