package designpatterns.singleton.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maumneto
 */
public class ConnectionDB {

    private static ConnectionDB instance;
    private String username = "root";
    private String password = "mauricio123";
    private String url = "jdbc:mysql://localhost:3306/examplesingleton";
    private Connection conn;

    private ConnectionDB() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getCause());
        }
    }

    public static synchronized ConnectionDB getInstance() throws
            SQLException {
        if (instance == null) {
            instance = new ConnectionDB();
            System.out.println("Conexão realizada com sucesso!");
}
    return instance;
    }
}
