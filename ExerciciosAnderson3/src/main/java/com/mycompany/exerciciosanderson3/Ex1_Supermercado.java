
package com.mycompany.exerciciosanderson3;

import javax.swing.JOptionPane;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Ex1_Supermercado {

    public static void main(String[] args) {
        
        Produto prod1 = new Produto("Arroz", 12.99, 50);
        Produto prod2 = new Produto("Feijão", 15.98, 10);
        
        
        String prod = JOptionPane.showInputDialog("Qual Produto deseja Comprar?: " 
        + "\n 1- Arroz" + "\n 2- Feijão");
        String input = JOptionPane.showInputDialog("Qual a quantidade de produtos que deseja?: ");
        
        
        ItemPedido item1 = new ItemPedido(prod1,Integer.parseInt(input));
        ItemPedido item2 = new ItemPedido(prod2, Integer.parseInt(input));
        
        String pagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? " 
        + "\n1- Dinheiro " + "\n2- Cartão" + "\n3- Cheque");
        
        Pedido pedido = new Pedido();
        if(prod.toUpperCase().equals("1")){
            pedido.adicionarItem(item1);
        }else if(prod.toUpperCase().equals("2")){
            pedido.adicionarItem(item2);
        }
        
        String metodo = "";
        if(pagamento.toUpperCase().equals("1")){
          pedido.setFormaPagamento(Pedido.FormaPagamento.Dinheiro);  
          metodo = "Dinheiro";
        }else if(pagamento.toUpperCase().equals("2")){
            pedido.setFormaPagamento(Pedido.FormaPagamento.Cartao);
             metodo = "Cartão";
        }else{
            pedido.setFormaPagamento(Pedido.FormaPagamento.Cheque);
             metodo = "Cheque";
        }
        
        if(prod.toUpperCase().equals("1")){
            JOptionPane.showMessageDialog(null, "O total a pagar é = " + (12.99*Integer.parseInt(input))
                + "\nMetodo selecionado = " + metodo);
        }else if(prod.toUpperCase().equals("2")){
            JOptionPane.showMessageDialog(null, "O total a pagar é = " + (15.98*Integer.parseInt(input))
                + "\nMetodo selecionado = " + metodo);
        }
        
       
    }
}
