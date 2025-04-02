package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.sistema_gerenciamento_funcionarios;

public class FuncionarioEfetivo extends Funcionario{
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    public double getBonusMensal() {
        return bonusMensal;
    }

    public void setBonusMensal(double bonusMensal) {
        this.bonusMensal = bonusMensal;
    }

    @Override
    double calcularBonus() {
        return salario+=bonusMensal;
    }
}
