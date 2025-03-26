package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class SensorUmidade extends Sensor{
    public SensorUmidade(double valor) {
        super(valor);
    }

    @Override
    public void valorSensor() {
        System.out.printf(
            "Valor Umidade Sensor: %.1f%%\n", getValor()
        );
    }
}
