package com.senai.aula06_abstracao.exemplos.exemplo_interface.smartwatch;

public class AppFitLife {
    public static void main(String[] args) {
        SmartWatchAvancado smartWatch = new SmartWatchAvancado();

        smartWatch.exibirInfoDispositivo();
        smartWatch.medirFrequenciaCardiaca();
        smartWatch.contarPassos();
        smartWatch.medirQualidadeSono();
    }
}
