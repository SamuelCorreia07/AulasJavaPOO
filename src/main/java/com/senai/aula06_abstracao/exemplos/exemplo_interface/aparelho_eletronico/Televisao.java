package com.senai.aula06_abstracao.exemplos.exemplo_interface.aparelho_eletronico;

public class Televisao implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada");
    }

    public void mudarCanal(){
        System.out.println("Mudei de canal");
    }
}
