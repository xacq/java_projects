/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.conecctiondb;

import com.mycompany.sistemapedidos.modelos.Plato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class PlatoDAO {
 
    public List<Plato> obtenerPlatos() {
        List<Plato> platos = new ArrayList<>();
        String sql = "SELECT * FROM plato WHERE nombre LIKE '%Almuerzo%';";

        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String descripcion = rs.getString("descripcion");
                Double precio = rs.getDouble("precio");
                Plato plato = new Plato(null , descripcion, precio, null); // Pasamos 'null' ya que no queremos incluir cliente
                platos.add(plato);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return platos;
    }
 
    public boolean insertarPlato(int id, String nombre, String descripcion, Double precio) {
        String sql = "INSERT INTO plato (nombre, descripcion, precio, administrador_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, descripcion);
            pstmt.setDouble(3, precio);
            pstmt.setInt(4, id);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error: No se pudo insertar el plato debido a una violación de clave foránea.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error de SQL: No se pudo insertar el plato.");
            e.printStackTrace();
        }

        return false;
    }

    
}
