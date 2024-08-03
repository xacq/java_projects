/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.conecctiondb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaDAO {
    public boolean insertPersona(String nombre, String apellido, String telefono, String correo) {
        String sql = "INSERT INTO persona (nombre, apellido, telefono, correo) VALUES (?, ?, ?, ?)";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, telefono);
            pstmt.setString(4, correo);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int getPersonaId(String nombre, String apellido, String correo) {
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
            e.printStackTrace();
        }
        return 0;
    }
}
