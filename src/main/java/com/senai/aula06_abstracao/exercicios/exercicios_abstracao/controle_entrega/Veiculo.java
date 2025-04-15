package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

import java.time.Duration;

abstract public class Veiculo {
    private int velocidadeAtual;
    private final int capacMaxCarga;
    private int distanciaDestino;

    public Veiculo(int capacMaxCarga, int distanciaDestino) {
        velocidadeAtual = 0;
        this.capacMaxCarga = capacMaxCarga;
        this.distanciaDestino = distanciaDestino;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getCapacMaxCarga() {
        return capacMaxCarga;
    }

    public int getDistanciaDestino() {
        return distanciaDestino;
    }

    public void setDistanciaDestino(int distanciaDestino) {
        this.distanciaDestino = distanciaDestino;
    }

    public void verificarVelocidadeAtual() {
        System.out.println("Velocidade atual: " + velocidadeAtual + "km/h.");
    }

    public void verificarDistanciaDestino() {
        if (distanciaDestino >= 1000) {
            double distanciaDestinoEmKm = (double) distanciaDestino / 1000;
            System.out.printf("Distância até o destino: %.2fkm", distanciaDestinoEmKm);
        } else {
            System.out.printf("Distância até o destino: %dm.", distanciaDestino);
        }

    }

    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
        System.out.println("Acelerando para " + velocidadeAtual + "km/h.");
    }

    protected void iniciarContagemRegressiva(Duration duracao) {
        try {
            while (!duracao.isZero() && !duracao.isNegative()) {
                long minutos = duracao.toMinutes();
                long segundos = duracao.minusMinutes(minutos).getSeconds();
                System.out.printf("\rTempo restante: %02d:%02d", minutos, segundos);
                Thread.sleep(1000);
                duracao = duracao.minusSeconds(1);
            }
            System.out.println("\nSeu pedido chegou ao seu destino!\n");
        } catch (InterruptedException e) {
            System.out.println("Contagem interrompida.");
        }
    }

    abstract public void calcularTempoEstimadoEntrega();
}
