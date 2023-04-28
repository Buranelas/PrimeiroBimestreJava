package model;

import java.util.ArrayList;


public class Pedido {
    
    private ArrayList<ItemPedido> itens;
    private double valorTotal;
    private FormaPagamento formapagamento;
    
    public Pedido() {
        itens = new ArrayList<ItemPedido>();
        valorTotal = 0;
    }
    
    public void adicionarItem(ItemPedido item){
        itens.add(item);
        valorTotal += item.getProduto().getPreco() * item.getQuantidade();
    }
    
    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formapagamento = formaPagamento;
    }

    public FormaPagamento getFormaPagamento() {
        return formapagamento;
    }
    
    public enum FormaPagamento {
    Dinheiro, Cheque, Cartao
}
    
}
