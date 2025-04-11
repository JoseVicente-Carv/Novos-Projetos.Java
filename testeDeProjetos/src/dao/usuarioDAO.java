package dao;

import java.util.ArrayList;

import modelo.usuario;

public class usuarioDAO {
    private ArrayList<usuario> usuarios = new ArrayList<>();

    // Construtor: adicona usuarios "pre-cadastrados"
    public usuarioDAO() {
        usuarios.add(new usuario("admin", "admin123"));
        usuarios.add(new usuario("usuario", "1234"));
    }

    // verifique se o login e senha existem na lista.
    public boolean autenticar(String login, String senha) {
        for (usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return true; // usuario encontrado
                
            }
        }
        return false; // não encontrado
    }
}