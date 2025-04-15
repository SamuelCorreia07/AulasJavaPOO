package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

public class Main {
    public static void main(String[] args) {
        Veiculo bicicleta = new BicicletaEntrega(15, 2);
        bicicleta.acelerar(25);
        bicicleta.calcularTempoEstimadoEntrega();

        Veiculo moto = new MotoEntrega(30, 3);
        moto.acelerar(60);
        moto.calcularTempoEstimadoEntrega();

    }
}
