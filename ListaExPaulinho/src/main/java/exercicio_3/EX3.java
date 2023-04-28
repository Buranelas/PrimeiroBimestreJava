
package exercicio_3;

import javax.swing.JOptionPane;


public class EX3 {


    public static void main(String[] args) {
      
         int[] vetor = new int[10];
        String numeros = "";
        int total = 0;
        
        for(int i = 0; i < vetor.length ; i++){
            String input = "";
            input = JOptionPane.showInputDialog("Digite o " + (i+1) + " valor: ");
            int v = Integer.parseInt(input);
            vetor[i] = v;
            total = total + vetor[i] ;
        }
        
        JOptionPane.showMessageDialog(null, "Está é a soma de todos os números: " + total );
        
        
    }
    
}
