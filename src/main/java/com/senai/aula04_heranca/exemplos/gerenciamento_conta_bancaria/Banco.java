package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente("Samuel", 50000, 2000);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Victor", 20000, 2);

        System.out.println("--------------------");
        contaCorrente1.exibirSaldo();
        contaPoupanca1.exibirSaldo();

        System.out.println("----------Teste sacar CC----------");
        contaCorrente1.sacar(53000);
        contaCorrente1.sacar(51000);

        System.out.println("----------Teste rendimento CP----------");
        contaPoupanca1.aplicarRendimento();

        System.out.println("--------------------");
        contaCorrente1.exibirSaldo();
        contaPoupanca1.exibirSaldo();
    }
}
