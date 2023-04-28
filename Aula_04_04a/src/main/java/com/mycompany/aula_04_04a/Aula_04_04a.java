package com.mycompany.aula_04_04a;

import model.Cachorro;
import model.Pato;
import model.Professor;

public class Aula_04_04a {

    public static void main(String[] args) {
       
        Professor professor = new Professor();
        
        professor.setCpf("99887732322");
        professor.setDepartamento("Engenharia");
        professor.setEndereco("Rua tal");
        professor.setNome("Joao");
        professor.setNomeCurso("ADS");
        professor.setSalario(2.0);
        professor.setTelefone("45999998888");
        
        
        
        Pato pato = new Pato();
        pato.fazerBarulho();
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
        
    }
}
