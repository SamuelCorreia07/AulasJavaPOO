package com.senai.aula04_heranca.exercicios.sistema_funcionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Samuel", 2, "Java");
        Professor professor2 = new Professor("Pedro", 1.5, "TikTok");
        Professor professor3 = new Professor("Nayara", 2, "Frontend");

        ArrayList<Professor> equipeProfessores = new ArrayList<>();
        equipeProfessores.add(professor1);
        equipeProfessores.add(professor2);
        equipeProfessores.add(professor3);

        Coordenador coordenador = new Coordenador("Victor", 3, equipeProfessores);
    }
}
