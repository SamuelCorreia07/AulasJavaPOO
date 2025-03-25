package com.senai.aula05_polimorfismo.exercicios.sistema_relatorios;

public class JSON extends Relatorio{
    public JSON(int tamanhoArquivo) {
        super(tamanhoArquivo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.printf(
                """
                Relatório gerado!
                Tamanho do arquivo JSON: %dMB
                
                """,
                getTamanhoArquivo()
        );
    }
}
