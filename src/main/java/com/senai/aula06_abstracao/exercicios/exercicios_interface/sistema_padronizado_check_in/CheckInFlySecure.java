package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_padronizado_check_in;

public interface CheckInFlySecure {
    double PESO_MAX_BAGAGEM_NACIONAL = 23;
    double PESO_MAX_BAGAGEM_INTERNACIONAL = 32;
    double QTD_MAXIMA_BAGAGENS = 5;

    void validarDocumento(String cpf);
    void emitirCartaoEmbarque(String nome);
    void realizarCheckIn(Passageiro passageiro);

    static void mensagemBoasVindas() {
        System.out.println("Seja bem-vindo ao FlySecure!");
    }

    static void mensagemCheckIn(){
        System.out.println("Check-in seguro realizado pela FlySecure");
    }

    default void validarPesoBagagemNacional(int pesoBagagemNacional){
        if (pesoBagagemNacional > PESO_MAX_BAGAGEM_NACIONAL) {
            System.out.println("Bagagem não autorizada (acima do peso máximo para viagens nacionais)!");
        } else {
            System.out.println("Bagagem autorizada!");
        }
    }

    default void validarPesoBagagemInternacional(int pesoBagagemInternacional){
        if (pesoBagagemInternacional > PESO_MAX_BAGAGEM_INTERNACIONAL) {
            System.out.println("Bagagem não autorizada (acima do peso máximo para viagens internacionais)!");
        } else {
            System.out.println("Bagagem autorizada!");
        }
    }

    default void mensagemDadosValidados (String nome) {
        if (validarDados(nome)) {
            System.out.println("Dados validados!");
        } else System.out.println("Dados não validados!");
    }

    private boolean validarDados(String nome){
        return !nome.isEmpty();
    }
}
