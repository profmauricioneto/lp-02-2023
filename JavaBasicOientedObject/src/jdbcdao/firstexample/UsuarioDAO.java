/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcdao.firstexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author maumneto
 */
public class UsuarioDAO {
    private Connection connection = null;
    
    public UsuarioDAO() {
        try {
            this.connection = ConnectionDB.getConnectionJDBC();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    // create - adicionar usuario ao banco!
    public void addUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, altura, endereco, data) VALUES (?,?,?,?)";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);

            state.setString(1, usuario.getNome());
            state.setDouble(2, usuario.getAltura());
            state.setString(3, usuario.getEndereco());
            state.setDate(4, new Date(usuario.getData().getTimeInMillis()));

            state.execute();
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    // projecao de todos os dados da tabela!
    public void mostrarUsuario() {
        String sql = "SELECT * FROM usuario";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            ResultSet result;
            result = state.executeQuery();
            while (result.next()) {
                System.out.println(" ");
                System.out.println("ID: " + result.getLong("id"));
                System.out.println("Nome: " + result.getString("nome"));
                System.out.println("Altura: " + result.getDouble("altura"));
                System.out.println("Endereco: " + result.getString("endereco"));
                System.out.println("Data: " + result.getString("data"));
                System.out.println(" -------- ");
            }
            result.close();
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void delete(long id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setLong(1, id);
            state.execute();
            state.close();
            System.out.println("tupla deletada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void update(Usuario usuario, long id) {
        String sql = "UPDATE usuario SET nome = ?, altura = ?, endereco = ?, data = ? WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setString(1, usuario.getNome());
            state.setDouble(2, usuario.getAltura());
            state.setString(3, usuario.getEndereco());
            state.setDate(4, new Date(usuario.getData().getTimeInMillis()));
            state.setLong(5, id);
            state.execute();
            state.close();
            System.out.println("tupla atualizada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void mostrarTodosDadosDAO() {
        String procedure = "{call SelectAllData()}";
        try {
            CallableStatement callable;
            callable = connection.prepareCall(procedure);
            ResultSet result = callable.executeQuery();
            while (result.next()) {
                System.out.println(" ");
                System.out.println("ID: " + result.getLong("id"));
                System.out.println("Nome: " + result.getString("nome"));
                System.out.println("Altura: " + result.getDouble("altura"));
                System.out.println("Endereco: " + result.getString("endereco"));
                System.out.println("Data: " + result.getString("data"));
                System.out.println(" -------- ");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void mostrarPorId(long id) {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setLong(1, id);
            ResultSet result;
            result = state.executeQuery();
            while (result.next()) {
                System.out.println(" ");
                System.out.println("ID: " + result.getLong("id"));
                System.out.println("Nome: " + result.getString("nome"));
                System.out.println("Altura: " + result.getDouble("altura"));
                System.out.println("Endereco: " + result.getString("endereco"));
                System.out.println("Data: " + result.getString("data"));
                System.out.println(" -------- ");
            }
            result.close();
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }    
    
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
