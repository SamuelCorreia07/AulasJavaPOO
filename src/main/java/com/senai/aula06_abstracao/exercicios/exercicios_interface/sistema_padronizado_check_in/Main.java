package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_padronizado_check_in;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("Samuel", "000.000.000-00", 30, 2);
        GOL gol = new GOL();

        gol.realizarCheckIn(passageiro1);
    }
}
