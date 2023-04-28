
package exercicio_1;

import javax.swing.JOptionPane;



public class Ex1 {

  
    public static void main(String[] args) {
        int[] vetor = new int[10];
        String numeros = "";
        
        for(int i = 0; i < vetor.length ; i++){
            String input = "";
            input = JOptionPane.showInputDialog("Digite o " + (i+1) + " valor: ");
            int v = Integer.parseInt(input);
            vetor[i] = v;
        }
        
       for(int i = 0; i < vetor.length ; i++){
           numeros = numeros + vetor[i] + "\n";
       }
       
       JOptionPane.showMessageDialog(null, numeros);
    }
}
