package com.senai.aula05_polimorfismo.exemplos.sistema_pagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Pedro", 1500));
        listaPagamentos.add(new PJ("Victor", 350, 45));
        listaPagamentos.add(new Freelancer("Samuel", 150000));

        listaPagamentos.forEach(pagamentos -> System.out.printf(
                "%s recebe R$%,.02f\n", pagamentos.getNome(), pagamentos.calcularPagamento()
        ));

    }
}
