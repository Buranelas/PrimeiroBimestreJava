package com.mycompany.aula_21_03;

import com.mycompany.aula_21_03.model.Carro;
import com.mycompany.aula_21_03.model.Endereco;
import com.mycompany.aula_21_03.model.Marca;
import com.mycompany.aula_21_03.model.Modelo;
import com.mycompany.aula_21_03.model.Pessoa;
import javax.swing.JOptionPane;

public class Aula_21_03 {

    public static void main(String[] args) {
        
        //OBJETO ENDERECO FABRICA
        Endereco enderecoFabrica = new Endereco();
        enderecoFabrica.setCep("85902250");
        enderecoFabrica.setComplemento("Rua sem Saida");
        enderecoFabrica.setEstado("Sao Paulo");
        enderecoFabrica.setNmCasa(666);
        enderecoFabrica.setNmCidade("Sao Paulo");
        enderecoFabrica.setNmRua("Avenida sem entrada");
        enderecoFabrica.setPais("Brasil");
        
        //OBJETO MARCA
        Marca marca = new Marca();
        marca.setCnpj("75.977.845/0001-30");
        marca.setEndereco(enderecoFabrica);
        marca.setIe("859510555");
        marca.setLogo("http://esseeologodamkinhaempresa.com.br");
        marca.setNome("Chevrolet");
        
        //OBEJTO MODELO
        Modelo modelo = new Modelo();
        modelo.setAnoLancamento(2022);
        modelo.setId(1);
        modelo.setMarca(marca);
        modelo.setNmModelo("Monza");
        
        //OBJETO ENDERECO PROPIETARIO
        Endereco enderecoPropietario = new Endereco();
        enderecoPropietario.setCep("85608880");
        enderecoPropietario.setComplemento("Br 163");
        enderecoPropietario.setEstado("Paraná");
        enderecoPropietario.setNmCasa(163);
        enderecoPropietario.setNmCidade("Toledo");
        enderecoPropietario.setNmRua("Rua Senhor dos Passos");
        enderecoPropietario.setPais("Brasil");
        
        //OBJETO PROPIETARIO
        Pessoa propietario = new Pessoa();
        propietario.setCpf("71815279915");
        propietario.setEndereco(enderecoPropietario);
        propietario.setNmPessoa("Eliane");
        
        //OBJETO CARRO
        Carro carro = new Carro();
        carro.setChassi("7788556622");
        carro.setModelo(modelo);
        carro.setPlaca("JUKP-55687");
        carro.setPropietario(propietario);
        
        JOptionPane.showMessageDialog(null, carro.toString());
    }
}
