/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.conecctiondb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorDAO {
    
        public boolean existeAdministrador(int id) {
        String sql = "SELECT * FROM administrador WHERE persona_id = ?";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
       
    public boolean ingresarAdministrador(String usuario, String contrasena) {
        String sql = "SELECT * FROM administrador WHERE usuario = ? AND contrasena = ?";
        try (Connection conn = DbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, usuario);
            pstmt.setString(2, contrasena);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int getUserId(String usuario, String contrasena) {
        String sql = "SELECT persona_id FROM administrador WHERE usuario = ? AND contrasena = ?";
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
