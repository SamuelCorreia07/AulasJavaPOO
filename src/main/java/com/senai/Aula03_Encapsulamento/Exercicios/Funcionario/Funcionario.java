package com.senai.Aula03_Encapsulamento.Exercicios.Funcionario;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
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
