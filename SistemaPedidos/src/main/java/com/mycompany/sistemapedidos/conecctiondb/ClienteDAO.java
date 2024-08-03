/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.conecctiondb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    
    public int getClienteId(String nombre, String apellido, String correo) {
        String sql = "SELECT id FROM persona WHERE nombre = ? AND apellido = ? AND correo = ?";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement conectar = conn.prepareStatement(sql)) {
            conectar.setString(1, nombre);
            conectar.setString(2, apellido);
            conectar.setString(3, correo);
            ResultSet rs = conectar.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            System.err.println("Error al conseguir el ID cliente: " + e.getMessage());
        }
        return 0;
    }

    
    public boolean insertCli(int id, String usuario, String contrasena) {
        String sql = "INSERT INTO cliente (persona_id, usuario, contrasena) VALUES (?, ?, ?)";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            if (id <= 0) {
                System.err.println("Error: La persona_id no es válida.");
                return false;
            }
            pstmt.setInt(1, id);
            pstmt.setString(2, usuario);
            pstmt.setString(3, contrasena);
            System.out.println("Consulta SQL: " + pstmt);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar cliente: " + e.getMessage());
            return false;
        }
    }
    
    public boolean ingresarCli(String usuario, String contrasena) {
        boolean valid = false;
        try (Connection connection = DbConnection.getConnection()) {
            String query = "SELECT * FROM cliente WHERE usuario = ? AND contrasena = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                valid = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valid;
    }    
    
    public int getUserId(String usuario, String contrasena) {
        String sql = "SELECT persona_id FROM cliente WHERE usuario = ? AND contrasena = ?";
        try(Connection conn = DbConnection.getConnection();
            PreparedStatement conectar = conn.prepareStatement(sql)) {
            conectar.setString(1, usuario);
            conectar.setString(2, contrasena);
            ResultSet rs = conectar.executeQuery();
            if (rs.next()) {
                return rs.getInt("persona_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
