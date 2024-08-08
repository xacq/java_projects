/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muye_programasupletorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class padreDAO {
    
    public boolean insertarPadre(String nombre, String apellido, String cedula, int numero_hijos) {
    String sql = "INSERT INTO empleados (nombre, apellido, cedula, numero_hijos) VALUES (?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nombre);
        pstmt.setString(2, apellido);
        pstmt.setString(3, cedula);
        pstmt.setInt(4, numero_hijos);
        int affectedRows = pstmt.executeUpdate();
        return affectedRows > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
    
    public int contarHijos(String cedula) {
    String sql = "SELECT numero_hijos FROM empleados WHERE cedula = ?";
    try (Connection conn = Conexion.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, cedula);
        ResultSet rs = pstmt.executeQuery();
       
        if (rs.next()) {
            return rs.getInt("numero_hijos");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0; 
}
}
