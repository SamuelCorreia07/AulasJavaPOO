package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_padronizado_check_in;

public interface ContratoPadrao {
    double PESO_MAXIMO_BAGAGEM_MAO = 10;
    double PESO_MAXIMO_BAGAGEM_DESPACHADA = 32;

    void validarDocumento();
    void emitirCartaoEmbarque();
    void realizarCheckIn();

    static void mensagemBoasVindas() {
        System.out.println("Seja bem-vindo ao FlySecure!");
    }

    default void mensagemCheckIn(){
        System.out.println("Check-in seguro realizado pela FlySecure");
    }

    default void validarDados(){
        System.out.println("Dados validados com sucesso!");
    }

    default void validarBagagemMao(int pesoBagagemMao){
        if (pesoBagagemMao > PESO_MAXIMO_BAGAGEM_MAO) {
            System.out.println("Bagagem de mão não autorizada (acima do peso máximo)!");
        } else {
            System.out.println("Bagagem de mão autorizada!");
        }
    }

    default void validarBagagemDespachada(int pesoBagagemDespachada) {
        if (pesoBagagemDespachada > PESO_MAXIMO_BAGAGEM_DESPACHADA) {
            System.out.println("Bagagem despachada não autorizada (acima do peso máximo)!");
        } else {
            System.out.println("Bagagem despachada autorizada!");
        }
    }
}
