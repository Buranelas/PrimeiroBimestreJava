
package model;

public class Animal {
    
    private String nome;
    private String tpAnimal;
    private String somAnimal;
    
    public Animal(){
        this.somAnimal = "ROAWW";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTpAnimal() {
        return tpAnimal;
    }

    public void setTpAnimal(String tpAnimal) {
        this.tpAnimal = tpAnimal;
    }

    public String getSomAnimal() {
        return somAnimal;
    }

    public void setSomAnimal(String somAnimal) {
        this.somAnimal = somAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + 
                "\n, tpAnimal=" + tpAnimal + 
                "\n, somAnimal=" + somAnimal + '}';
    }
    
    
    
}
