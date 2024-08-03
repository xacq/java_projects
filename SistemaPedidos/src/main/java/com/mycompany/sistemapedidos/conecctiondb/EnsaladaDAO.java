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
import java.util.ArrayList;
import java.util.List;

public class EnsaladaDAO {
    
     public List<Plato> obtenerEnsalada() {
        List<Plato> platos = new ArrayList<>();
        String sql = "SELECT * FROM plato WHERE nombre LIKE '%Ensalada%';";

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
}
