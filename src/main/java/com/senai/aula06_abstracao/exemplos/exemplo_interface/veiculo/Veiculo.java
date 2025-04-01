package com.senai.aula06_abstracao.exemplos.exemplo_interface.veiculo;

public interface Veiculo {
    void acelerar();

    // Método default (padrão)
    default void buzinar() {
        System.out.println("Buzinando: Beep beep!");
    }
}
