package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Samuel", 100);
        ContaBancaria contaBancaria2 = new ContaBancaria("Pedro", 100000);


        System.out.println("--------------------Teste Sacar--------------------");
        contaBancaria1.sacar(-10);
        contaBancaria1.sacar(110);
        contaBancaria2.sacar(10);

        System.out.println("--------------------Teste Depositar--------------------");
        contaBancaria1.depositar(10);
        contaBancaria2.depositar(-10);
        contaBancaria1.depositar(110);
        contaBancaria2.depositar(10);

        System.out.println("--------------------Teste Transferir--------------------");
        contaBancaria2.transferir(1000, contaBancaria1);

    }
}
