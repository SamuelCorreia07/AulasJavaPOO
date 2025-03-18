package com.senai.aula04_heranca.exercicios.sistema_funcionarios;

import java.util.ArrayList;

public class Coordenador extends Funcionario{
    private ArrayList<Professor> equipeProfessores;

    public Coordenador(String nome, double salario, ArrayList<Professor> equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    public ArrayList<Professor> getEquipeProfessores() {
        return equipeProfessores;
    }

    public void setEquipeProfessores(ArrayList<Professor> equipeProfessores) {
        this.equipeProfessores = equipeProfessores;
    }
}
