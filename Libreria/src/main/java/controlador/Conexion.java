/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/libreria";
    private static final String USUARIO = "root";
    private static final String CLAVE = ""; 

    public static Connection conectar() {
        try {
            if (con == null || !con.isValid(0)) {
                con = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("Conexión exitosa");
            } 
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores (debes mejorarlo)
        }
        return con;
    }
}