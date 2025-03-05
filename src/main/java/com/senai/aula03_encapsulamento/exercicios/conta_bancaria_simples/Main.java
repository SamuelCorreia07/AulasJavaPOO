package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Samuel", -10);

        System.out.println(contaBancaria);

        contaBancaria.depositar(1500);
        System.out.println(contaBancaria);

        contaBancaria.sacar(2650);
        System.out.println(contaBancaria);

        contaBancaria.depositar(-1000);
        System.out.println(contaBancaria);
    }
}
