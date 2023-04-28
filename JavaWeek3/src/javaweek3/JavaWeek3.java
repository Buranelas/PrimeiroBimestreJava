
package javaweek3;

import java.util.ArrayList;
import java.util.Random;
import javaweek3.model.Animal;
import javaweek3.model.Jogador;
import javax.swing.JOptionPane;


public class JavaWeek3 {
    private static ArrayList<Animal> baralho = new ArrayList() ;
    private static ArrayList<Animal> baralhoAux = new ArrayList() ;
    private static ArrayList<Jogador> jogadores = new ArrayList() ;
    public static void main(String[] args) {
        
        telaPrincipal();
    }
    
    public static void telaPrincipal(){
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog( "MENU PRINCIPAL \n"
                                                                + "1 - Jogar\n" 
                                                                + "2 - Adicionar Animal \n"
                                                                + "3 - Exibir Lista de Animais\n"
                                                                + "0 - Sair"));
            switch(opcao){
                case 0:
                    JOptionPane.showMessageDialog(null,"Programa encerrado");
                    break;
                case 1:
                    iniciarJogo() ;
                    break;
                case 2:
                    criarAnimal() ;
                    break;
                case 3:
                    exibirAnimais() ;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcao invalida");
                    break;
            }
        }while(opcao != 0);
    }
    
    public static void criarAnimal(){
        Random random = new Random() ;
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas Cartas você vai querer adicionar?: ")) ;
        
        for (int i = 0; i < quantidade; i++){
        String mensagemTela = "Criando Animal";
        mensagemTela += "\n Adicionando Carta " + String.valueOf(i + 1) + "\n" ;
        
        String nome = JOptionPane.showInputDialog("Digite o nome do Animal: ") ;
        double forca = random.nextInt(10) ;
        double defesa = random.nextInt(10) ;
        double velocidade = random.nextInt(10) ;
       /* double forca = Double.parseDouble(JOptionPane.showInputDialog(mensagemTela + "\n Informe um valor para força: ")) ;
        double defesa = Double.parseDouble(JOptionPane.showInputDialog(mensagemTela + "\n Informe um valor para defesa")) ;
        double velocidade = Double.parseDouble(JOptionPane.showInputDialog(mensagemTela + "\n Informe um valor apra velocidade")) ; */
        
        baralho.add(new Animal(nome, forca, defesa, velocidade)) ;
        
        JOptionPane.showMessageDialog(null, "As seguintes cartas foram adicionas: \n" + baralho.get(i).toString()) ;
    }
    }
    
    public static void iniciarJogo(){
        iniciarJogador(JOptionPane.showInputDialog("Informe um nick para o Jogador 1: "));
        selecaoDeCartas(jogadores.get(0)) ;
        
        iniciarJogador(JOptionPane.showInputDialog("Informe um nick para o Jogador 2: "));
        selecaoDeCartas(jogadores.get(1)) ;
        
        iniciarBatalha();
        
       jogadores.removeAll(jogadores) ;
        
    }
    
    public static void iniciarBatalha(){
        
        String ganhadorRodada = "" ;
        
        int atributoRodada = Integer.parseInt(JOptionPane.showInputDialog("Seleção de Atributos \n" + 
                                                                                                                        "0 - Força \n" +    
                                                                                                                        "1 - Defesa \n" +   
                                                                                                                        "2 - Velocidade \n"));
        switch(atributoRodada){
            case 0:
                   ganhadorRodada =  comparaForca() ;
                break;
            case 1:
                ganhadorRodada = comparaDefesa() ;
                break;
            case 2:
               ganhadorRodada =  comparaVelocidade() ;
                break ;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break ;
        }
        if(ganhadorRodada.equals("Empate")){
            JOptionPane.showMessageDialog(null, "Houve um Empate") ;
        }else{
        JOptionPane.showMessageDialog(null, "O Ganhador da rodada foi : " + ganhadorRodada);
        }
    }
    
       public static String comparaVelocidade(){
            ArrayList<Animal> listaCartasJogadorUm = jogadores.get(0).getListaCartas() ;
            ArrayList<Animal> listaCartasJogadorDois = jogadores.get(1).getListaCartas() ;
            
            if(listaCartasJogadorUm.get(0).getVelocidade() > listaCartasJogadorDois.get(1).getVelocidade()){
                removerAnimal(jogadores.get(1).getListaCartas(), 0);
                return jogadores.get(0).getNickName() ;
                
            }else if(listaCartasJogadorDois.get(0).getVelocidade() > listaCartasJogadorUm.get(0).getVelocidade()){
                removerAnimal(jogadores.get(1).getListaCartas(), 0);
                return jogadores.get(1).getNickName() ;  
    }else{
                
                return "Empate" ;
            }
    }
    
    public static String comparaDefesa(){ 
            ArrayList<Animal> listaCartasJogadorUm = jogadores.get(0).getListaCartas() ;
            ArrayList<Animal> listaCartasJogadorDois = jogadores.get(1).getListaCartas() ;
            
            if(listaCartasJogadorUm.get(0).getDefesa() > listaCartasJogadorDois.get(1).getDefesa()){
                removerAnimal(jogadores.get(1).getListaCartas(), 0);
                return jogadores.get(0).getNickName() ;
                
            }else if(listaCartasJogadorDois.get(0).getDefesa() > listaCartasJogadorUm.get(0).getDefesa()){
                removerAnimal(jogadores.get(1).getListaCartas(), 0);
                return jogadores.get(1).getNickName() ;  
    }else{
                
                return "Empate" ;
            }
            
            
    }
    
    public static String comparaForca(){
            ArrayList<Animal> listaCartasJogadorUm = jogadores.get(0).getListaCartas() ;
            ArrayList<Animal> listaCartasJogadorDois = jogadores.get(1).getListaCartas() ;
            
            if(listaCartasJogadorUm.get(0).getForca() > listaCartasJogadorDois.get(1).getForca()){
                removerAnimal(jogadores.get(1).getListaCartas(), 0);
                return jogadores.get(0).getNickName() ;
                
            }else if(listaCartasJogadorDois.get(0).getForca() > listaCartasJogadorUm.get(0).getForca()){
                removerAnimal(jogadores.get(1).getListaCartas(), 0);
                return jogadores.get(1).getNickName() ;  
    }else{
                
                return "Empate" ;
            }
    }
    
    public static void selecaoDeCartas(Jogador jogador){

        ArrayList<Animal> baralhoAux = new ArrayList() ;
        
        for(int i = 0; i < baralho.size(); i++){
            baralhoAux.add(baralho.get(i)) ;
        }
        
        for(int i = 0; i < baralho.size()/2; i++){
              String lista = "" ;
                 for(int j = 0; j < baralhoAux.size() ; j++){    
            lista += j +  " - " + baralhoAux.get(i).getNome()  + "\n";
        }
        
        int posicaoDaCarta  = Integer.parseInt(JOptionPane.showInputDialog("Seleção de Cartas do Jogador:  "  + jogador.getNickName() + "\n" + lista)) ;
        
         jogador.addAnimal(baralhoAux.get(posicaoDaCarta)) ;
         baralhoAux.remove(posicaoDaCarta) ;   
        }
    }
    
    
    public static void iniciarJogador(String nome){
       jogadores.add(new Jogador(nome)) ; 
    }
    
    public static void exibirAnimais(){
            JOptionPane.showMessageDialog(null, "Baralho Animais: \n" + baralho.toString());
        }
    public static void removerAnimal(ArrayList lista, int posicao){
        lista.remove(posicao);
    }
}
