
package javaweek2.model;

import java.util.ArrayList;

/**
 *
 * @author joaov
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private ArrayList<Telefone> listaTelefones = new ArrayList() ;
    
    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome ;
        this.idade = idade ;
        this.cpf = cpf ;
    }
    
   
    public String getNome() {
        return nome ;
        
    }
    
    public void setNome(String nome) {
        this.nome = nome ;
    }
    
    public int getIdade(){
        return idade ;
    }
    
    public void setIdade(int idade){
        this.idade = idade ;
    }
    
    public String getCpf(){
        return cpf ;
    }
    
    public void setCpf(String cpf){
       this.cpf = cpf ; 
    }
    
    public ArrayList getListaTelefone(){
        return listaTelefones ;
    }
    
    public void addTelefone(Telefone telefone){
        this.listaTelefones.add(telefone) ;
    }
    
    public void removeTelfone(int posicao){
        this.listaTelefones.remove(posicao) ;
    }
    
    public Telefone getTelefoneDaLista(int posicao){
        return this.listaTelefones.get(posicao) ;
    }
    
    @Override
    public String toString(){
        return "Pessoa{ Nome " + nome + " Cpf: " + cpf + " Idade: " + idade + " Telefone: " + listaTelefones.toString() ;
    }
    
    
}
