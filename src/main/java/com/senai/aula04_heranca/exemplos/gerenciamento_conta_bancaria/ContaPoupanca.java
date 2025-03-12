package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        setSaldo(getSaldo()+((getSaldo()*taxaRendimento))/100);
        System.out.printf("Taxa de Rendimento aplicada! \nTitular: %s, Saldo atual: R$%.2f\n", getTitular(), getSaldo());
    }
}
