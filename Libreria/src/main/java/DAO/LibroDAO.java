/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Libro;

public class LibroDAO {
    private Connection con;

    public LibroDAO() {
        con = Conexion.conectar();
    }

    public boolean agregarLibro(Libro libro) {
        try {
            PreparedStatement query = con.prepareStatement(
                "INSERT INTO Libro (codigoLibro, titulo, fechaPublicacion, precio, codigoGenero) VALUES (?, ?, ?, ?, ?)");
            query.setInt(1, libro.getCodigoLibro());
            query.setString(2, libro.getTitulo());
            query.setString(3, libro.getFechaPublicacion());
            query.setDouble(4, libro.getPrecio());
            query.setInt(5, libro.getCodigoGenero());
            query.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores (debes mejorarlo)
            return false;
        }
    }

    public Libro buscarLibro(int codigoLibro) {
        Libro libro = null;
        try {
            PreparedStatement query = con.prepareStatement(
                "SELECT codigoLibro, titulo, fechaPublicacion, precio, codigoGenero FROM Libro WHERE codigoLibro = ?");
            query.setInt(1, codigoLibro);
            ResultSet rs = query.executeQuery();

            if (rs.next()) {
                libro = new Libro();
                libro.setCodigoLibro(rs.getInt("codigoLibro"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setFechaPublicacion(rs.getString("fechaPublicacion"));
                libro.setPrecio(rs.getDouble("precio"));
                libro.setCodigoGenero(rs.getInt("codigoGenero"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores (debes mejorarlo)
        }
        return libro;
    }

    public boolean eliminarLibro(int codigoLibro) {
        try {
            PreparedStatement query = con.prepareStatement("DELETE FROM Libro WHERE codigoLibro = ?");
            query.setInt(1, codigoLibro);
            int filasAfectadas = query.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores (debes mejorarlo)
            return false;
        }
    }

    public boolean modificarLibro(Libro libro) {
        try {
            PreparedStatement query = con.prepareStatement(
                "UPDATE Libro SET titulo = ?, fechaPublicacion = ?, precio = ?, codigoGenero = ? WHERE codigoLibro = ?");
            query.setString(1, libro.getTitulo());
            query.setString(2, libro.getFechaPublicacion());
            query.setDouble(3, libro.getPrecio());
            query.setInt(4, libro.getCodigoGenero());
            query.setInt(5, libro.getCodigoLibro());
            query.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores (debes mejorarlo)
            return false;
        }
    }

    public ResultSet listarLibros() {
        try {
            Statement stmt = con.createStatement();
            ResultSet listado = stmt.executeQuery("SELECT * FROM Libro");
            return listado;
        } catch (SQLException ex) {
            ex.printStackTrace(); // Manejo de errores (debes mejorarlo)
            return null;
        }
    }
    
        public ResultSet listarLibrosConGenero() {
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT " +
                         "    Libro.codigoLibro, " +
                         "    Libro.titulo, " +
                         "    Libro.fechaPublicacion, " +
                         "    Libro.precio, " +
                         "    Genero.descripcion AS genero " +
                         "FROM " +
                         "    Libro " +
                         "INNER JOIN " +
                         "    Genero ON Libro.codigoGenero = Genero.codigoGenero " +
                         "ORDER BY " +
                         "    Genero.descripcion";
            ResultSet listado = stmt.executeQuery(sql);
            return listado;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean existeCodigoLibro(int codigoLibro) {
        try {
            PreparedStatement query = con.prepareStatement("SELECT codigoLibro FROM Libro WHERE codigoLibro = ?");
            query.setInt(1, codigoLibro);
            ResultSet rs = query.executeQuery();
            return rs.next(); // Devuelve true si se encontró un registro con ese código
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En caso de error, se asume que el código no existe (para ser precavido)
        }
    }
}