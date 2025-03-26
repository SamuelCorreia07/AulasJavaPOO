package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class Main {
    public static void main(String[] args) {
        valorSensor(new SensorUmidade(83.5));
        valorSensor(new SensorTemperatura(23));
    }
    public static void valorSensor(Sensor sensor){
        sensor.valorSensor();
    }
}
