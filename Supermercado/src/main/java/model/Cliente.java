package model;

public class Cliente {
    
    private String CPF;
    private String nome;
    private String dsendereco;
    
    public Cliente(){
    }

    public Cliente(String CPF, String nome, String dsendereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.dsendereco = dsendereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDsendereco() {
        return dsendereco;
    }

    public void setDsendereco(String dsendereco) {
        this.dsendereco = dsendereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "CPF=" + CPF + ", nome=" + nome + ", dsendereco=" + dsendereco + '}';
    }
    
    
    
    
}
