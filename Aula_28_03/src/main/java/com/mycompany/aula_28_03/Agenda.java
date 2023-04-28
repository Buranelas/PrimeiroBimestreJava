
package com.mycompany.aula_28_03;

import java.util.ArrayList;
import model.Contato;
import model.Endereco;
import model.Telefone;


public class Agenda {

 
    public static void main(String[] args) {
        
        ArrayList<Contato> agendaTelefonica = new ArrayList<>();
        
        Endereco loc = new Endereco("85902250", "Parana", "Toledo", "Pancera", "R. do Rosário", "842");
        Telefone tel = new Telefone("998629234", "45");
        Contato joao = new Contato("Joao", "Buranello", loc, tel);
        
        agendaTelefonica.add(joao);
        
        for(int i = 0; i < agendaTelefonica.size(); i++){
            System.out.println("Contato = " +
                    agendaTelefonica.get(i).toString());
        }
    }
    
}
