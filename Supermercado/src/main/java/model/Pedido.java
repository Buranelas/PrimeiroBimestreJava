package model;

import java.util.ArrayList;

public class Pedido {
    
    private int nrPedido;
    private Cliente cliente;
    private ArrayList<ItemPedido> listaItens;
    private ArrayList<FormaPagamento> formaPagamento;

    public Pedido() {
    }

    public Pedido(int nrPedido, Cliente cliente, ArrayList<Item> listaItens, ArrayList<FormaPagamento> formaPagamento) {
        this.nrPedido = nrPedido;
        this.cliente = cliente;
        this.listaItens = listaItens;
        this.formaPagamento = formaPagamento;
    }

    public int getNrPedido() {
        return nrPedido;
    }

    public void setNrPedido(int nrPedido) {
        this.nrPedido = nrPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    public ArrayList<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ArrayList<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nrPedido=" + nrPedido + ", cliente=" + cliente + ", listaItens=" + listaItens + ", formaPagamento=" + formaPagamento + '}';
    }
    
    
    
}
