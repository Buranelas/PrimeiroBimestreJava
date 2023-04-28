/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author joaov
 */
public class Aluno extends Pessoa {
    
   
    private ArrayList<String> cursos;
    private ArrayList<Integer> notas;

    public Aluno() {
    }

    public Aluno(ArrayList<String> cursos, ArrayList<Integer> notas, 
            String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }

   
    
}
