package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class Reserva {
    private String nomeCliente;
    private int numDiarias;
    private double tarifaDiaria;

    public Reserva(String nomeCliente, int numDiarias, double tarifaDiaria) {
        this.nomeCliente = nomeCliente;
        this.numDiarias = numDiarias;
        this.tarifaDiaria = tarifaDiaria;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumDiarias() {
        return numDiarias;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void calcularCustoTotal(){
        System.out.println("Calculadora genérica");
    }
}
