/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muye_programasupletorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class HijoDAO {
    public void cargarHijosEnComboBox(JComboBox<String> comboBox) {
        String sql = "SELECT apellido FROM hijos";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                String apellidos = rs.getString("apellido");
                comboBox.addItem(apellidos); // Añadir cada hijo al JComboBox
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        public void cargarIDEnComboBox(JComboBox<String> comboBox) {
        String sql = "SELECT id, apellido FROM empleados";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                String id = rs.getString("id");
                comboBox.addItem(id); // Añadir cada id al JComboBox
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    public void cargarCEDULAEnComboBox(JComboBox<String> comboBox) {
        String sql = "SELECT cedula FROM hijos";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                String cedula = rs.getString("cedula");
                comboBox.addItem(cedula); // Añadir cada id al JComboBox
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean insertarHijo(String nombre, String apellido, int id_empleado) {
    String sql = "INSERT INTO hijos (nombre, apellido, cedula, id_empleado) VALUES (?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nombre);
        pstmt.setString(2, apellido);
        pstmt.setInt(4, id_empleado);
        int affectedRows = pstmt.executeUpdate();
        return affectedRows > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
    
public Hijo buscarHijo(String cedula) {
    String sql = "SELECT * FROM hijos WHERE cedula = ?";
    Hijo hijo = null;

    try (Connection conn = Conexion.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, cedula);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                // Crear un objeto Hijo y asignar los valores obtenidos de la consulta
                hijo = new Hijo(
                    rs.getString("cedula"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("id_empleado")
                );
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return hijo;
}


public boolean actualizarHijo(String cedula, String nombre, String apellido, int id_empleado) {
    String sql = "UPDATE hijos SET nombre = ?, apellido = ?, id_empleado = ? WHERE cedula = ?";

    try (Connection conn = Conexion.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Asignar los valores a los parámetros de la consulta
        pstmt.setString(1, nombre);
        pstmt.setString(2, apellido);
        pstmt.setInt(3, id_empleado);
        pstmt.setString(4, cedula);

        // Ejecutar la actualización
        int affectedRows = pstmt.executeUpdate();
        return affectedRows > 0; // Retorna true si se actualizó al menos un registro

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

}