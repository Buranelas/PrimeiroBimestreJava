package model;

public class Tipoproduto {
    
    private String cdTpProduto;
    private String dsTipoProduto;

    public Tipoproduto(String cdTpProduto, String dsTipoProduto) {
        this.cdTpProduto = cdTpProduto;
        this.dsTipoProduto = dsTipoProduto;
    }

    public String getCdTpProduto() {
        return cdTpProduto;
    }

    public void setCdTpProduto(String cdTpProduto) {
        this.cdTpProduto = cdTpProduto;
    }

    public String getDsTipoProduto() {
        return dsTipoProduto;
    }

    public void setDsTipoProduto(String dsTipoProduto) {
        this.dsTipoProduto = dsTipoProduto;
    }

    @Override
    public String toString() {
        return "Tipoproduto{" + "cdTpProduto=" + cdTpProduto + ", dsTipoProduto=" + dsTipoProduto + '}';
    }
    
    
    
    
}
