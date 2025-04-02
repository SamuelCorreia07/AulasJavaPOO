package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.sistema_gerenciamento_funcionarios;

abstract public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        salario += salario * porcentagem / 100;
    }

    abstract double calcularBonus();

    public void exibirDados(){
        System.out.printf("""
                Nome: %s
                Salário: R$%.2f
                """,
                nome, salario);
    }
}
