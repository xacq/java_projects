/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautomotriz.conexion.DatabaseConnection;

import com.mycompany.sistemaautomotriz.classes.Cliente;
import com.mycompany.sistemaautomotriz.classes.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VehiculoDAO {
    public boolean existeChasis(String chasis) {
        String sql = "SELECT COUNT(*) FROM vehiculo WHERE chasis = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, chasis);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

public boolean insertarVehiculo(String chasis, String marca, String modelo, int ano, int clienteId) {
    String sql = "INSERT INTO Vehiculo (chasis, marca, modelo, año, cliente_identificacion) VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, chasis);
        pstmt.setString(2, marca);
        pstmt.setString(3, modelo);
        pstmt.setInt(4, ano);
        pstmt.setInt(5, clienteId);
        int affectedRows = pstmt.executeUpdate();
        return affectedRows > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

public String getChasisByUserId(int userId) {
        String sql = "SELECT chasis FROM vehiculo WHERE cliente_identificacion = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("chasis");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // or throw an exception, or return an optional, based on your error handling strategy
    }

    public List<Vehiculo> obtenerVehiculos(int userId) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        String sql = "SELECT chasis, marca, modelo, año FROM vehiculo WHERE cliente_identificacion = ?";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String chasis = rs.getString("chasis");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int año = rs.getInt("año");
                Vehiculo vehiculo = new Vehiculo(chasis, marca, modelo, año, userId); // Pasamos 'null' ya que no queremos incluir cliente
                vehiculos.add(vehiculo);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehiculos;
    }

}