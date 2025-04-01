package com.senai.aula06_abstracao.exemplos.exemplo_interface.aparelho_eletronico;

public class Main {
    public static void main(String[] args) {
        testeAparelho(new Televisao());
        testeAparelho(new Computador());

        Televisao tv = new Televisao();
        tv.ligar();
        tv.mudarCanal();

        Computador pc = new Computador();
        pc.ligar();

        AparelhoEletronico ap = tv;
        ap.ligar();

        Televisao tv2 = (Televisao) ap;

        tv2.mudarCanal();
    }
    private static void testeAparelho (AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
