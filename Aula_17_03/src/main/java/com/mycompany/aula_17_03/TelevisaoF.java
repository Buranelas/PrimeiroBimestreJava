
package com.mycompany.aula_17_03;

import javax.swing.JOptionPane;


public class TelevisaoF {
    
    private boolean ligado;
    private int canal;
    private int volume;
    private int numeroCanais;
    private int volumeMaximo;
    
  public TelevisaoF(boolean ligado, int canal, int volume, int numeroCanais, int volumeMaximo) {
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
        this.numeroCanais = numeroCanais;
        this.volumeMaximo = volumeMaximo;
    }
    
    public boolean stLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public int getCanal() {
        return canal;
    }
    
    public void setCanal(int canal) {
        if (canal > 0 && canal <= numeroCanais && ligado) {
            this.canal = canal;
        }
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= volumeMaximo && ligado) {
            this.volume = volume;
        }
    }
    
    public int getNumeroCanais() {
        return numeroCanais;
    }
    
    public void setNumeroCanais(int numeroCanais) {
        this.numeroCanais = numeroCanais;
    }
    
    public int getVolumeMaximo() {
        return volumeMaximo;
    }
    
    public void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }
    
    public void ligar() {
        this.ligado = true;
    }
    
    public void desligar() {
        this.ligado = false;
    }
    
    public void aumentarVolume() {
        if (volume < volumeMaximo && ligado) {
            volume++;
        }
    }
    
    public void abaixarVolume() {
        if (volume > 0 && ligado) {
            volume--;
        }
    }
    
    public void alterarCanalParaCima() {
        if (canal < numeroCanais && ligado) {
            canal++;
        }
    }
    
    public void alterarCanalParaBaixo() {
        if (canal > 1 && ligado) {
            canal--;
        }
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Televisão " + 
                "Ligado:  " + ligado +
                "\nCanal:  " + canal +
                "\nVolume:  " + volume +
                "\nNúmero de canais:  " + numeroCanais +
                "\nVolume máximo:  " + volumeMaximo);
    }
    
}
