
package javaweek2;

import javaweek2.model.Pessoa;
import javaweek2.model.Telefone;
import javax.swing.JOptionPane;

public class Runner {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 20, "12632383943") ;
        Pessoa p2 = new Pessoa("Maria", 25, "71815279915");
        
        Telefone t1 = new Telefone("45999890909") ;
        Telefone t2 = new Telefone("45999897909") ;
        Telefone t3 = new Telefone("45999898909") ;
        Telefone t4 = new Telefone("45999894909") ;
        
        p1.addTelefone(t1);
        p1.addTelefone(t2);\
        p1.addTelefone(t3);
        p1.addTelefone(t4);
        
     
        
       JOptionPane.showMessageDialog(null, p1.toString()) ;
       JOptionPane.showMessageDialog(null, p2.toString()) ;
        
        
        
    }
    
}
