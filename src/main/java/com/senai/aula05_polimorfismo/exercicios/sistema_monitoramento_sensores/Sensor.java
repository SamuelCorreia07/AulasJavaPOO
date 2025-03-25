package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class Sensor {
    private double valor;

    public Sensor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void valorSensor(){
        System.out.println("Valor sensor genérico");
    }
}
