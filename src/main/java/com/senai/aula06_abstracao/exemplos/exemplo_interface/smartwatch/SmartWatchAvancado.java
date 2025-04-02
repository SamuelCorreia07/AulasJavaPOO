package com.senai.aula06_abstracao.exemplos.exemplo_interface.smartwatch;

public class SmartWatchAvancado implements SensorCardiaco, SensorPassos, SensorSono{
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardíaca: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 4500 passos");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade do sono: 7h30min sono profundo");
    }

    void exibirInfoDispositivo(){
        System.out.println("SmartWatch Avançado conectado com múltiplos sensores.");
    }
}
