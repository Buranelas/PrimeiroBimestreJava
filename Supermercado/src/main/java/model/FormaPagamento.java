package model;


public class FormaPagamento {
 
    private int cdFormaPagamento;
    private String dsFormaPagamento;
    
    public FormaPagamento(){
    }

    public FormaPagamento(int cdFormaPagamento, String dsFormaPagamento) {
        this.cdFormaPagamento = cdFormaPagamento;
        this.dsFormaPagamento = dsFormaPagamento;
    }

    public int getCdFormaPagamento() {
        return cdFormaPagamento;
    }

    public void setCdFormaPagamento(int cdFormaPagamento) {
        this.cdFormaPagamento = cdFormaPagamento;
    }

    public String getDsFormaPagamento() {
        return dsFormaPagamento;
    }

    public void setDsFormaPagamento(String dsFormaPagamento) {
        this.dsFormaPagamento = dsFormaPagamento;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "cdFormaPagamento=" + cdFormaPagamento + ", dsFormaPagamento=" + dsFormaPagamento + '}';
    }
    
    
    
}
