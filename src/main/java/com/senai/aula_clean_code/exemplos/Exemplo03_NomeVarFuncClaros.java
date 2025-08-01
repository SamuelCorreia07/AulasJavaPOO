package com.senai.aula_clean_code.exemplos;

public class Exemplo03_NomeVarFuncClaros {
    public void imprimirSoma(int[] numeros) {
        int somaTotal = calcularSoma(numeros);
        System.out.println("Soma total: " + somaTotal);
    }

    private int calcularSoma(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
