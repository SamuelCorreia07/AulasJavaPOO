package com.senai.aula06_abstracao.exemplos.exemplo_interface.sistema_controlador_equipamentos_inteligentes;

public interface AparelhosInteligentes {
    int NIVEL_MAXIMO = 100; // Constante

    void ligar();
    void desligar();

    default int ajustarNivel(int nivelAtual, int ajuste) {
        if (validarNivel(nivelAtual,ajuste)) {
            return nivelAtual + ajuste;
        } else {
            return nivelAtual;
        }
    }

    // método estático
    static void mensagemBemVindo() {
        System.out.println("Bem-vindo ao Controle Remoto Inteligente!");
    }

    // método privado auxiliar (Java 9+)
    private boolean validarNivel(int nivel, int ajuste) {
        return (nivel >= 0) && (nivel <= NIVEL_MAXIMO) && (nivel+ajuste != -1) && (nivel+ajuste != 101);
    }
}
