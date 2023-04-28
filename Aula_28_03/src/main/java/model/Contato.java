
package model;

public class Contato {
 
    private String nome;
    private String sobrenome;
    private Endereco endereco;
    private Telefone numero;

    public Contato(String nome, String sobrenome, Endereco endereco, Telefone numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.numero = numero;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getNumero() {
        return numero;
    }

    public void setNumero(Telefone numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato = " + "Nome=" + nome 
                + "\nSobrenome=" + sobrenome 
                + "\nEndereco=" + endereco 
                + "\nNumero=" + numero + '}';
    }
    
    
    
    
}
