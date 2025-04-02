package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.sistema_gerenciamento_funcionarios;

public class FuncionarioTemporario extends Funcionario{
    private int horasExtras;
    private double valorHoraExtra;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valorHoraExtra) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    double calcularBonus() {
        return salario+= horasExtras*valorHoraExtra;
    }
}
