package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_simples;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0){
            this.saldo = saldo;
        } else System.out.println("Saldo inválido!" +
                "\nO valor atribuido a saldo será R$0.0");
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.println();
        } else System.out.println("Valor inválido!");
    }

    public void sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!" +
                    "\nValor atual: R$" + saldo);
        } else if (valor <= 0) {
            System.out.println("Valor para saque inválido!");
        } else System.out.println("Saldo insuficiente!");
    }

    @Override
    public String toString() {
        return "\nConta Bancaria: " +
                "\nTitular: " + titular +
                "\nSaldo = " + saldo;
    }
}
