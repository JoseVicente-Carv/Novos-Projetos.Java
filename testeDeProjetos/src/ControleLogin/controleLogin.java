package ControleLogin;

import dao.usuarioDAO;

public class controleLogin {
    private usuarioDAO usuarioDAO;

    // contrutor: criar o DAO
    public controleLogin(){
        usuarioDAO = new usuarioDAO();
    }

    public boolean autenticar(String login, String senha) {
        return usuarioDAO.autenticar(login, senha);
    }

}