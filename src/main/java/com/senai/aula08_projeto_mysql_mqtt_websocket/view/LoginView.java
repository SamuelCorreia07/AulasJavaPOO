package com.senai.aula08_projeto_mysql_mqtt_websocket.view;


import com.senai.aula08_projeto_mysql_mqtt_websocket.controller.LoginController;
import com.senai.aula08_projeto_mysql_mqtt_websocket.model.Usuario;
import com.senai.aula08_projeto_mysql_mqtt_websocket.util.CriptografiaUtil;

import java.util.Optional;
import java.util.Scanner;

public class LoginView {
    private final Scanner scanner = new Scanner(System.in);
    private final LoginController controller = new LoginController();

    public Optional<Usuario> exibirLogin() {
        System.out.println("\n===== LOGIN DO SISTEMA =====");
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Optional<Usuario> usuario = controller.autenticar(login, CriptografiaUtil.hash(senha));
        if (usuario.isEmpty()) {
            System.out.println("\nCredenciais inválidas. Tente novamente.\n");
        }
        return usuario;
    }
}
