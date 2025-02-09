/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Genero;

public class GeneroDAO {
    private Connection con;

    public GeneroDAO() {
        con = Conexion.conectar(); 
    }

    public List<Genero> listarGeneros() {
        List<Genero> generos = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT codigoGenero, descripcion FROM Genero");

            while (rs.next()) {
                Genero genero = new Genero();
                genero.setCodigoGenero(rs.getInt("codigoGenero"));
                genero.setDescripcion(rs.getString("descripcion"));
                generos.add(genero);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores 
        }
        return generos;
    }
}
