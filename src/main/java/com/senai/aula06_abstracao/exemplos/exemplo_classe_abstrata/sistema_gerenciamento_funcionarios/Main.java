package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.sistema_gerenciamento_funcionarios;

public class Main {
    public static void main(String[] args) {
        pagarFuncionarios(new FuncionarioEfetivo("PedrinhoGameplays", 4000, 200));
        pagarFuncionarios(new FuncionarioTemporario("Victor", 5000, 15, 40));

    }
    public static void pagarFuncionarios (Funcionario funcionario) {
        funcionario.exibirDados();
        funcionario.aumentarSalario(20);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
