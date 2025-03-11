package com.senai.aula03_encapsulamento.exercicios.gerenciamento_funcionarios;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
        } else this.nome = nome;
        if (salario >= 1320) {
            this.salario = salario;
        } else System.out.println("Paga mais, sem vergonha!");
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
        } else this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario >= 1320) {
            this.salario = salario;
        } else System.out.println("Paga mais, sem vergonha!");
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "\nNome: " + nome +
                "\nSalário = R$" + salario +
                "\nCargo: " + cargo;
    }
}
