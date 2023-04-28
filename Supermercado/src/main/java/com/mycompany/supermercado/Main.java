package com.mycompany.supermercado;

import model.Cliente;
import model.FormaPagamento;
import model.Item;
import model.ItemPedido;
import model.Pedido;
import model.SuperMercado;
import model.Tipoproduto;


public class Main {

    public static void main(String[] args) {
       
        Tipoproduto alimenticio = new Tipoproduto("1", "Proutos Alimenticios");
        Tipoproduto higiene = new Tipoproduto("2", "Produto de Higiene");
        
        Item milho = new Item(1, "Milho Milho", "6587941668595", 2.30, 20, alimenticio);
        Item carne = new Item(2, "Carne de Boi", "59894946666", 50.00, 10, alimenticio);
        Item sabonete = new Item(3, "Sabonete Limpo", "9988899551066", 1.50, 5, higiene);
        
        FormaPagamento dinheiro = new FormaPagamento(1, "Dinheiro");        
        FormaPagamento pix = new FormaPagamento(2, "Pix");        
        FormaPagamento cartao = new FormaPagamento(3, "Cartão");        
        FormaPagamento cheque = new FormaPagamento(4, "Cheque");    
        
        Cliente cliente = new Cliente("12632383943", "João Buranello", "Rua do Rosário 842");
        
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setNrPedido(123);
        
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setItem(milho);
        itemPedido.setQtdVendida(12);
        itemPedido.setVlPrecoUnitario(milho.getVlPreco());
        
        pedido.getListaItens().add(itemPedido);
        
        ItemPedido itemSabonete = new ItemPedido();
        itemSabonete.setItem(sabonete);
        itemSabonete.setQtdVendida(2);
        itemSabonete.setVlPrecoUnitario(sabonete.getVlPreco());
        
        pedido.getListaItens().add(itemSabonete);
        
        SuperMercado mercado = new SuperMercado();
        mercado.setCnpj("7575754444");
        mercado.setNmFantasia("Tal tal");
        mercado.getListaPedidos().add(pedido);
    }
}
