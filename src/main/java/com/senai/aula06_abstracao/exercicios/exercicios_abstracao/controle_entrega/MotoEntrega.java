package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

import java.time.Duration;

public class MotoEntrega extends Veiculo{

    public MotoEntrega(int capacMaxCarga, int distanciaDestino) {
        super(capacMaxCarga, distanciaDestino);
    }

    @Override
    public void calcularTempoEstimadoEntrega() {
        int tempoAdicionalSegundos = 120;
        double tempoHoras = (double) getDistanciaDestino() / getVelocidadeAtual();
        long tempoSegundos = (long) (tempoHoras * 3600) + tempoAdicionalSegundos;
        Duration duracao = Duration.ofSeconds(tempoSegundos);

        System.out.println("Iniciando entrega com moto...");
        iniciarContagemRegressiva(duracao);
    }
}
