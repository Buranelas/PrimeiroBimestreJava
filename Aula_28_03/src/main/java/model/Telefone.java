
package model;


public class Telefone {

    public Telefone(String numero, String ddd) {
        this.numero = numero;
        this.ddd = ddd;
    }
    
    private String numero;
    private String ddd;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "Telefone = " + " Numero=" + numero 
                + "\nDDD=" + ddd + '}';
    }
    
    
    
}
