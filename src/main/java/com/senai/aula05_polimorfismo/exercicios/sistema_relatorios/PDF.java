package com.senai.aula05_polimorfismo.exercicios.sistema_relatorios;

public class PDF extends Relatorio{
    private int qtdPaginas;

    public PDF(int tamanhoArquivo, int qtdPaginas) {
        super(tamanhoArquivo);
        this.qtdPaginas = qtdPaginas;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    @Override
    public void gerarRelatorio() {
        System.out.printf(
                """
                Relatório gerado!
                Tamanho do arquivo CSV: %dMB
                Número de páginas: %d
                
                """,
                getTamanhoArquivo(), qtdPaginas
        );
    }
}
