
package javaweek;

import javax.swing.JOptionPane;

public class JavaWeek3 {

   
    public static void main(String[] args) {
        double numero1, numero2 ;
        
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: ")) ;
        
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número: ")) ;
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "O Primeiro número é maior que o segundo") ;  
        }else if(numero2 > numero1){
            JOptionPane.showMessageDialog(null, "O Segundo número é maior que o primeiro") ;
        }else{
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }
    
}
