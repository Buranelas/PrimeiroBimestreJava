
package com.mycompany.aula_28_03;

import java.util.ArrayList;
import model.Usuario;


public class Aula_28_03 {

    public static void main(String[] args) {
        
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        
        Usuario joao = new Usuario("joao.buranello", "123", true);
        listaUsuarios.add(joao);
        listaUsuarios.add(new Usuario("jorge", "122", false));
        
        for(int i = 0; i < listaUsuarios.size(); i++){
            System.out.println("Usuário = " +
                    listaUsuarios.get(i).toString());
        }
        
//        ArrayList<String> listaNomes = new ArrayList<>();
//        
//        listaNomes.add("Anderson");
//        listaNomes.add("Henrique");
//        listaNomes.add("Antony");
//        
//        System.out.println("Quantidade de Elementos na lista =  " +
//                listaNomes.size());
//        
//        listaNomes.add("Lucas");
//        listaNomes.add("André");
//        
//        System.out.println("Quantidade de Elementos na lista = " +
//                listaNomes.size());
//        
//        listaNomes.remove(0);
//        
//        System.out.println("Quantidade de Elementos na lista = " +
//                listaNomes.size());
//   
//        for (int i = 0; i < listaNomes.size(); i++) {
//            System.out.println("Nome = " + listaNomes.get(i));
//        }
        
        
    }
}
