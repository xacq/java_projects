/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautomotriz.conexion.DatabaseConnection;

import com.mycompany.sistemaautomotriz.classes.Turno;
import com.mycompany.sistemaautomotriz.classes.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TurnoDAO {
    
    public boolean existeTurno(String fecha, String hora) {
        String sql = "SELECT * FROM turno WHERE fecha = ? AND hora = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fecha);
            pstmt.setString(2, hora);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertarTurno(int userId, String fecha, String hora, String chasis, String estado) {
        String sql = "INSERT INTO Turno (cliente_identificacion, vehiculo_chasis, fecha, hora, estado) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, chasis);
            pstmt.setString(3, fecha);
            pstmt.setString(4, hora);
            pstmt.setString(5, estado);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

public List<Turno> obtenerTurnos(int userId) {
        List<Turno> turnos = new ArrayList<>();
        String sql = "SELECT * FROM turno WHERE cliente_identificacion = ?";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String chasis = rs.getString("vehiculo_chasis");
                String fecha = rs.getString("fecha");
                String hora = rs.getString("hora");
                String estado = rs.getString("estado");
                Turno turno = new Turno(userId, chasis, fecha, hora, estado); // Pasamos 'null' ya que no queremos incluir cliente
                turnos.add(turno);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return turnos;
    }
}
