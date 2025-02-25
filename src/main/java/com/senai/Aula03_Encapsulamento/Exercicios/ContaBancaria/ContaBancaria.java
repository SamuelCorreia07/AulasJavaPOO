package com.senai.Aula03_Encapsulamento.Exercicios.ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria() {
        titular = null;
        saldo = 0;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor) {
        if (valor >= 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "\nConta Bancaria: " +
                "\nTitular: " + titular +
                "\nSaldo = " + saldo;
    }
}
