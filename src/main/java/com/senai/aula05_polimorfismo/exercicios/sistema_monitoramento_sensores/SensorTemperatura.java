package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class SensorTemperatura extends Sensor{
    public SensorTemperatura(double valor) {
        super(valor);
    }

    @Override
    public void valorSensor() {
        System.out.printf(
            """
            Temperatura do Sensor:
            %.1f°C e %.1f°F
            
            """,
            getValor(), (getValor()*9/5)+32
        );
    }
}
