package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_simples;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido!" +
                    "\nO valor atribuido a saldo será R$0.0");
        }
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

    public boolean depositar (double valor) {
        if (valor >= 0) {
            saldo += valor;
            mensagemDeSucesso("Depositar", this);
            return true;
        } else {
            System.out.println("Valor inválido!");
            return false;
        }
    }

    public boolean sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            mensagemDeSucesso("Sacar", this);
            return true;
        } else if (valor <= 0) {
            System.out.println("Valor para saque inválido!");
            return false;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public static void mensagemDeSucesso (String operacao, ContaBancaria minhaConta){
        System.out.println(operacao + " para " + minhaConta.titular + " realizado com sucesso!" +
                "\nSaldo atual = R$" + minhaConta.saldo);
    }

    public void transferir (double valorTransferencia, ContaBancaria contaDestino) {
        if (sacar(valorTransferencia)) {
            contaDestino.depositar(valorTransferencia);
        }
    }

    @Override
    public String toString() {
        return "\nConta Bancaria: " +
                "\nTitular: " + titular +
                "\nSaldo = " + saldo;
    }
}
