package com.senai.aula03_encapsulamento.exercicios.gerenciamento_funcionarios;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, int opcaoCargo) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
        } else this.nome = nome;
        if (salario >= 1320) {
            this.salario = salario;
        } else System.out.println("Paga mais, sem vergonha!");
        switch (opcaoCargo) {
            case 1:
                this.cargo = "Gerente";
                break;
            case 2:
                this.cargo = "Analista";
                break;
            case 3:
                this.cargo = "Programador";
                break;
            default:
                System.out.println("Opção Inválida!" +
                        "\nCargo alterado para: 'Pendente'");
                this.cargo = "Pendente";
                break;
        }

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

    public void setCargo(int opcaoCargo) {
        switch (opcaoCargo) {
            case 1:
                this.cargo = "Gerente";
                break;
            case 2:
                this.cargo = "Analista";
                break;
            case 3:
                this.cargo = "Programador";
                break;
            default:
                System.out.println("Opção Inválida!" +
                        "\nCargo alterado para: 'Pendente'");
                this.cargo = "Pendente";
                break;
        }
    }

    public double aumentoPercentualSalario (double salarioAnterior, double salarioAtual) {
        return ((salarioAtual-salarioAnterior)/salarioAnterior)*100;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "\nNome: " + nome +
                "\nSalário = R$" + salario +
                "\nCargo: " + cargo;
    }
}
