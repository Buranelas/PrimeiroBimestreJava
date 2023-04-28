
package javaweek;

import javax.swing.JOptionPane;


public class JavaWeek4 {

    
    public static void main(String[] args) {
        double numero = -1 ;
        
        
        
        while(numero != 0){
            numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: ")) ;
            if(numero % 2 == 0 && numero > 0){
                JOptionPane.showMessageDialog(null, "O número é par") ;
            }else if(numero % 2 != 0){
                JOptionPane.showMessageDialog(null, "O número é ímpar");
            }else if(numero == 0){
                JOptionPane.showMessageDialog(null, "Programa Encerrado");
            }
        }
    }
}
    

