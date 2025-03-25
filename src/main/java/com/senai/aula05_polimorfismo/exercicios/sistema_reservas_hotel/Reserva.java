package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class Reserva {
    private double custo;

    public Reserva(double custo) {
        this.custo = custo;
    }

    public double getCusto() {
        return custo;
    }

    public double calcularCusto(){
        return 0.0;
    }
}
