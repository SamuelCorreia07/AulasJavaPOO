package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
        System.out.printf("%s para %s realizado com sucesso! \nSaldo atual: R$%.2f\n", operacao, minhaConta.titular, minhaConta.saldo);
    }

    public void transferir (double valorTransferencia, ContaBancaria contaDestino) {
        if (sacar(valorTransferencia)) {
            contaDestino.depositar(valorTransferencia);
        }
    }

    public void exibirSaldo(){
        System.out.printf("Titular: %s, Saldo: R$%.2f\n", titular, saldo);
    }
}
