
package exercicio_2;

import javax.swing.JOptionPane;


public class EX2 {


    public static void main(String[] args) {
       
        int[] vetor = new int[20];
        String numeros = "";
        
         for(int i = 0; i < vetor.length ; i++){
            String input = "";
            input = JOptionPane.showInputDialog("Digite o " + (i+1) + " valor: ");
            int v = Integer.parseInt(input);
            vetor[i] = v;
        }
        
       for(int i = 0; i < vetor.length ; i++){
           numeros = numeros + (i+1) + "º Posição  - " + vetor[i] + "\n";
       }
       
       JOptionPane.showMessageDialog(null, numeros);
        
    }
    
}
