package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class Main {
    public static void main(String[] args) {
        calcularCustoTotal(new ReservaSimples("Pedrinho", 5, 120));
        calcularCustoTotal(new ReservaVIP("Nayara", 7, 350, 80));

    }
    public static void calcularCustoTotal(Reserva reserva){
        reserva.calcularCustoTotal();
    }
}
