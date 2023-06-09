package model;

public class Item {
    
    private int cdItem;
    private String dsItem;
    private String ean;
    private double vlPreco;
    private int qtdEstoque;
    private Tipoproduto tipoProduto;
    
    public Item(){
    }

    public Item(int cdItem, String dsItem, String ean, double vlPreco, int qtdEstoque, Tipoproduto tipoProduto) {
        this.cdItem = cdItem;
        this.dsItem = dsItem;
        this.ean = ean;
        this.vlPreco = vlPreco;
        this.qtdEstoque = qtdEstoque;
        this.tipoProduto = tipoProduto;
    }

    public int getCdItem() {
        return cdItem;
    }

    public void setCdItem(int cdItem) {
        this.cdItem = cdItem;
    }

    public String getDsItem() {
        return dsItem;
    }

    public void setDsItem(String dsItem) {
        this.dsItem = dsItem;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public double getVlPreco() {
        return vlPreco;
    }

    public void setVlPreco(double vlPreco) {
        this.vlPreco = vlPreco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Tipoproduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Tipoproduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return "Item{" + "cdItem=" + cdItem + ", dsItem=" + dsItem + ", ean=" + ean + ", vlPreco=" + vlPreco + ", qtdEstoque=" + qtdEstoque + ", tipoProduto=" + tipoProduto + '}';
    }

    
    
    
    
}
