
package com.mycompany.muye_programasupletorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/basededatosempleados";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos!");
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}