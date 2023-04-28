
package exercicio_1;

import javax.swing.JOptionPane;


public class EX1_2 {


    public static void main(String[] args) {
      
        int[]vetorNumeros = new int[20];
        
        for(int i = 0; i < vetorNumeros.length; i++){
            String numero = JOptionPane.showInputDialog("Informe um número: ");
            
            vetorNumeros[i] = Integer.parseInt(numero);
            
            JOptionPane.showMessageDialog(null, vetorNumeros[i] + " Adicionado na posição " + (i+1));
        }
        
        String mensagem = "Valores Adicionados: \n";
        for(int i = 0; i < vetorNumeros.length; i++){
            mensagem += vetorNumeros[i] + "\n";
        }
        
    }
    
}
