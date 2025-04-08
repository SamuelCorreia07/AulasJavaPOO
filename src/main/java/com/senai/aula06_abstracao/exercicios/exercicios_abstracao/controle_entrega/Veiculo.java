package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

abstract public class Veiculo {
    private int velocidade;
    private double capacMaxCarga;
    private int distanciaDestino;

    public Veiculo() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getDistanciaDestino() {
        return distanciaDestino;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("Acelerando para " + velocidade + " km/h.");
    }

    abstract public void calcularTempoEstimadoEntrega();
}
