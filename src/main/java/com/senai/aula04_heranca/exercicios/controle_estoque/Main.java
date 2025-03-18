package com.senai.aula04_heranca.exercicios.controle_estoque;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento("Café", 33.99, 10, LocalDate.of(2025,6,16));
        Eletronico eletronico1 = new Eletronico("Lâmpada", 4.99, 25, 110);

        alimento1.exibirDetalhesAlimento();
        eletronico1.exibirDetalhesEletronico();
    }
}
