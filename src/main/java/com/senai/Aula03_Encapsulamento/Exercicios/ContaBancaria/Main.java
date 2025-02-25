package com.senai.Aula03_Encapsulamento.Exercicios.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setTitular("Samuel");
        contaBancaria.setSaldo(10000);
        System.out.println(contaBancaria);

        contaBancaria.depositar(1500);
        System.out.println(contaBancaria);

        contaBancaria.sacar(2650);
        System.out.println(contaBancaria);

        contaBancaria.depositar(-1000);
        System.out.println(contaBancaria);
    }
}
