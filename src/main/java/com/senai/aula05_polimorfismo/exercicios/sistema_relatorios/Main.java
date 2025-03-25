package com.senai.aula05_polimorfismo.exercicios.sistema_relatorios;

public class Main {
    public static void main(String[] args) {
        gerarRelatorio(new PDF(24, 40));
        gerarRelatorio(new CSV(5));
        gerarRelatorio(new JSON(30));
    }
    public static void gerarRelatorio(Relatorio relatorio){
        relatorio.gerarRelatorio();
    }
}
