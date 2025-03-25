package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class Main {
    public static void main(String[] args) {
        Sensor umidade = new SensorUmidade(83);
        umidade.valorSensor();
    }
}
