package model;

public class ItemPedido {

    private Item item;
    private int qtdVendida;
    private double vlPrecoUnitario;
    private double vlTotal;

    public ItemPedido() {
    }

    public ItemPedido(Item item, int qtdVendida, double vlPrecoUnitario, double vlTotal) {
        this.item = item;
        this.qtdVendida = qtdVendida;
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = vlTotal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
        this.vlTotal = this.qtdVendida * this.vlPrecoUnitario;
    }

    public double getVlPrecoUnitario() {
        return vlPrecoUnitario;
    }

    public void setVlPrecoUnitario(double vlPrecoUnitario) {
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = this.qtdVendida * this.vlPrecoUnitario;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "item=" + item + ", qtdVendida=" + qtdVendida + ", vlPrecoUnitario=" + vlPrecoUnitario + ", vlTotal=" + vlTotal + '}';
    }
    
    
    
}
