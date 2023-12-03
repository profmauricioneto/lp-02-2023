/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcdao.firstexample;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author maumneto
 */
public class ConnectionDB {
    private static ConnectionDB instance;
    private String urlConnection = "jdbc:mysql://localhost:3306/projeto_jdbc_dao";
    private String username = "root";
    private String password = "mauricio123";
    private Connection connection;
    
    private ConnectionDB() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(urlConnection, username, password);
            System.out.println("Connection database with success.");
        } catch(ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    public static synchronized Connection getConnectionJDBC() throws SQLException {
        if(instance == null) {
            instance = new ConnectionDB();
        } else {
            System.out.println("Instancia já foi criada.");
        }
        return instance.connection;
    }
}
