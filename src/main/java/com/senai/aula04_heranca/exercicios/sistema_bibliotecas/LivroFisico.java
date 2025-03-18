package com.senai.aula04_heranca.exercicios.sistema_bibliotecas;

public class LivroFisico extends Livro{
    private int numPaginas;

    public LivroFisico(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
