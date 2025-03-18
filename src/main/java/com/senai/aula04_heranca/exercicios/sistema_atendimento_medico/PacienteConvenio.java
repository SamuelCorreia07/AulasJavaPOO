package com.senai.aula04_heranca.exercicios.sistema_atendimento_medico;

public class PacienteConvenio extends Paciente{
    private double descontoCustoConsulta;

    public PacienteConvenio(String nome, int idade, double custoConsulta, double descontoCustoConsulta) {
        super(nome, idade, custoConsulta);
        this.descontoCustoConsulta = descontoCustoConsulta;
    }

    public double getDescontoCustoConsulta() {
        return descontoCustoConsulta;
    }

    public void setDescontoCustoConsulta(double descontoCustoConsulta) {
        this.descontoCustoConsulta = descontoCustoConsulta;
    }
}
