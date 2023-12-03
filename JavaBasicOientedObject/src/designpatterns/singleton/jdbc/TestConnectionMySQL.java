/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton.jdbc;

import java.sql.SQLException;
/**
 *
 * @author maumneto
 */
public class TestConnectionMySQL {
    public static void main(String[] args) {
        try {
            ConnectionDB conn1 = ConnectionDB.getInstance();
            ConnectionDB conn2 = ConnectionDB.getInstance();
            if (conn1 == conn2) {
                System.out.println("Instancias iguais.");
            } else {
                System.out.println("Instancias diferentes.");
            }
            System.out.println(conn1);
            System.out.println(conn2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
