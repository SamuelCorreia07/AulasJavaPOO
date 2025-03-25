package com.senai.aula05_polimorfismo.exercicios.sistema_relatorios;

public class CSV extends Relatorio{
    public CSV(int tamanhoArquivo) {
        super(tamanhoArquivo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.printf(
                """
                Relatório gerado!
                Tamanho do arquivo CSV: %dMB
                
                """,
                getTamanhoArquivo()
                );
    }
}
