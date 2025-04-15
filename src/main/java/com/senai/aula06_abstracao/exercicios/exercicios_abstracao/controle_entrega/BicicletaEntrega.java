package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

import java.time.Duration;

public class BicicletaEntrega extends Veiculo{
    private final int VELOCIDADE_MAXIMA = 20;

    public BicicletaEntrega(int capacMaxCarga, int distanciaDestino) {
        super(capacMaxCarga, distanciaDestino);
    }

    @Override
    public void calcularTempoEstimadoEntrega() {
        if (getVelocidadeAtual() > VELOCIDADE_MAXIMA) {
            System.out.println("Velocidade máxima ultrapassada. Alterada para " + VELOCIDADE_MAXIMA + "km/h.");
        }
        double velocidade = Math.min(getVelocidadeAtual(), VELOCIDADE_MAXIMA);
        double tempoHoras = (double) getDistanciaDestino() / velocidade;
        long tempoSegundos = (long) (tempoHoras * 3600);
        Duration duracao = Duration.ofSeconds(tempoSegundos);

        System.out.println("Iniciando entrega com bicicleta...");
        iniciarContagemRegressiva(duracao);
    }
}
