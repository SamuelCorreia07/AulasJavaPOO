package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo()+limite)) {
            setSaldo(getSaldo()-valor);
            mensagemDeSucesso("Sacar", this);
            return true;
        } else if (valor <= 0) {
            System.out.println("Valor para saque inválido!");
            return false;
        } else {
            System.out.println("Saldo e limite insuficientes!");
            return false;
        }
    }
}
