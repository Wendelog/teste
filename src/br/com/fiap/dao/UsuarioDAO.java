/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.dao;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author logonpf
 */
public class UsuarioDAO {
    private Connection conexao;
    private String sql;
    private PreparedStatement p;
    private ResultSet rs;
    
    public UsuarioDAO() {
        conexao = Conexao.getConnection();
    }
    
    public boolean pesquisarUsuario(Usuario usuario) {
        boolean achou = false;
        try {
            sql = "select * from java_usuario where login = ? and senha = ?";
            p = conexao.prepareStatement(sql);
            p.setString(1, usuario.getLogin());
            p.setString(2, usuario.getSenha());
            rs = p.executeQuery();
            achou = rs.next();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar usuário\n"+ex);
        }
        return achou;
    }
}
