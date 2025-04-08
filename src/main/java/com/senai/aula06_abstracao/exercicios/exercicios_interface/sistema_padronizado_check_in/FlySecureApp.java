package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_padronizado_check_in;

public class FlySecureApp implements ContratoPadrao {



    @Override
    public void validarDocumento() {

        validarDados();
    }

    @Override
    public void emitirCartaoEmbarque() {

    }

    @Override
    public void realizarCheckIn() {
        mensagemCheckIn();
    }
}
