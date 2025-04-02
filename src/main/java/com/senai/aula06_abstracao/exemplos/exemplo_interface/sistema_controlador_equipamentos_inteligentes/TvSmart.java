package com.senai.aula06_abstracao.exemplos.exemplo_interface.sistema_controlador_equipamentos_inteligentes;

public class TvSmart implements AparelhosInteligentes {
    private int volume;

    public TvSmart() {
        this.volume = 0;
    }

    @Override
    public void ligar() {
        System.out.println("TV ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada!");
    }

    public void aumentarVolume() {
        System.out.printf("Volume %d\n", volume = ajustarNivel(volume,1));
    }

    public void abaixarVolume() {
        System.out.printf("Volume %d\n", volume = ajustarNivel(volume,-1));
    }
}
