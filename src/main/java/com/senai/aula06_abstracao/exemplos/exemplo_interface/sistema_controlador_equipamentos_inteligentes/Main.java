package com.senai.aula06_abstracao.exemplos.exemplo_interface.sistema_controlador_equipamentos_inteligentes;

public class Main {
    public static void main(String[] args) {
        testarAparelho(new LampadaInteligente());
        testarAparelho(new TvSmart());
    }
    public static void testarAparelho(AparelhosInteligentes aparelhosInteligentes) {
        System.out.printf("--------------------- teste %s ---------------------\n", aparelhosInteligentes.getClass().getSimpleName());

        aparelhosInteligentes.ligar();

        if(aparelhosInteligentes instanceof LampadaInteligente) {
            ((LampadaInteligente) aparelhosInteligentes).aumentarBrilho();
            ((LampadaInteligente) aparelhosInteligentes).abaixarBrilho();
            ((LampadaInteligente) aparelhosInteligentes).abaixarBrilho();
            ((LampadaInteligente) aparelhosInteligentes).abaixarBrilho();
        } else if (aparelhosInteligentes instanceof TvSmart) {
            ((TvSmart) aparelhosInteligentes).aumentarVolume();
            ((TvSmart) aparelhosInteligentes).aumentarVolume();
            ((TvSmart) aparelhosInteligentes).aumentarVolume();
            ((TvSmart) aparelhosInteligentes).abaixarVolume();
        }

        aparelhosInteligentes.desligar();
    }
}
