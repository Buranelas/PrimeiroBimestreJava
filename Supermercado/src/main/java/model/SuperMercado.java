package model;

import java.util.ArrayList;


public class SuperMercado {
    
    private String nmFantasia;
    private String cnpj;
    private ArrayList<Pedido> listaPedidos;

    public SuperMercado() {
    }

    public SuperMercado(String nmFantasia, String cnpj, ArrayList<Pedido> listaPedidos) {
        this.nmFantasia = nmFantasia;
        this.cnpj = cnpj;
        this.listaPedidos = listaPedidos;
    }

    public String getNmFantasia() {
        return nmFantasia;
    }

    public void setNmFantasia(String nmFantasia) {
        this.nmFantasia = nmFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public String toString() {
        return "SuperMercado{" + "nmFantasia=" + nmFantasia + ", cnpj=" + cnpj + ", listaPedidos=" + listaPedidos + '}';
    }
    
    
    
}
