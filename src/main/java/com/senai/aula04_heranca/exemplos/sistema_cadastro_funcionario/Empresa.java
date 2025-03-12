package com.senai.aula04_heranca.exemplos.sistema_cadastro_funcionario;

public class Empresa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 3000);
        Gerente g1 = new Gerente("Carlos", 5000, 1500);

        f1.exibirDados();
        g1.exibirDados();
    }
}
