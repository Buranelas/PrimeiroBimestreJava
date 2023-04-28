
package com.mycompany.aula_15_03;

import javax.swing.JOptionPane;

public class Aula_15_03 {

    public static void main(String[] args) {
        
        String[]vetorNomes = new String[8];
        
        vetorNomes[0]  = "João";
        vetorNomes[1]  = "Gabriel";
        vetorNomes[2]  = "Guilherme";
        vetorNomes[3]  = "Jose";
        vetorNomes[4]  = "Arthur";
        vetorNomes[5]  = "Henrique";
        vetorNomes[6]  = "Murilo";
        vetorNomes[7]  = "Robert";
        vetorNomes[8]  = "Cesar";
        
        for(int i = 0; i < 8; i++){
            
           String nome = JOptionPane.showInputDialog("Informe um nome: ");
           vetorNomes[i] = nome; 
            
        }
        String mensagem = "Os nomes informados são: \n";
        for(int i = 0; i < 8; i++){
            
            mensagem = mensagem + vetorNomes[i] + "\n";
            
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
