
package javaweek3.model;

import java.util.ArrayList;

public class Jogador {

    public Jogador(String nickName) {
        this.nickName = nickName;
    }
    
    private String nickName ;
    private ArrayList<Animal> ListaCartas = new ArrayList() ;
    
    public String getNickName(){
        return nickName ;
    }
    
    public void setNickName(String nickName){
        this.nickName = nickName ;
    }
    
    public ArrayList getListaCartas(){
        return ListaCartas ;
    }
    
    public void addAnimal(Animal animal){
        ListaCartas.add(animal) ;
    }

    @Override
    public String toString() {
        return "Jogador {" + "Nick Name: " + nickName + " , Lista Cartas: " + ListaCartas.toString() + "}"; 
    }
    
    
    
}
