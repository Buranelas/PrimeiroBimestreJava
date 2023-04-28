
package com.mycompany.aula_29_03;


public class Aula_29_03 {

    public static void main(String[] args) {
       
        int[]vetor = {30,29,19,49};
        int chave, j;
        
        for(int i = 1; i < vetor.length; i++){
            chave = vetor[i];
            for(j = i - 1; (j  >= 0 && vetor[j] > chave) ; j--){
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
            
        }
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Vetor ["+i+"] = " +vetor[i]);
        }
    }
}
