package com.senai.aula08_projeto_mysql_mqtt_websocket.model;

public class Administrador extends Usuario {
    public Administrador(int id, String nome, String login, String senha) {
        super(id, nome, login, senha);
    }

    @Override
    public String getTipo() {
        return "Administrador";
    }
}
