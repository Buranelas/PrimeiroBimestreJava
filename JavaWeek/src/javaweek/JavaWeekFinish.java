
package javaweek;

import javax.swing.JOptionPane;

public class JavaWeekFinish {

    public static void main(String[] args) {
        double numero1, numero2;
        String operador;
        String resultado = null ;
        
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
        
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número: "));
        
        operador = JOptionPane.showInputDialog("Informe um operador: ");
        
        if (operador.equals("+")) {
            resultado = String.valueOf(numero1 + numero2) ;
        }else if(operador.equals("-")){
               resultado = String.valueOf(numero1 - numero2) ; 
            }else if(operador.equals("*")){
                    resultado = String.valueOf(numero1 * numero2) ;
                }else if(operador.equals("/")){
                        resultado = String.valueOf(numero1 / numero2) ;
                    }else{
                        JOptionPane.showMessageDialog(null, "Você informou um operador inválido");
                    }
                    
                    JOptionPane.showMessageDialog(null, "O resultado de " + numero1 + operador + numero2
                    + " é igual a = " + resultado) ;
                    
                }
        }
    
