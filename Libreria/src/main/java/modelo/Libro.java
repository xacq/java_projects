/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Libro {
    private int codigoLibro;
    private String titulo;
    private String fechaPublicacion;
    private double precio;
    private int codigoGenero;

    public Libro() {}

    public Libro(int codigoLibro, String titulo, String fechaPublicacion, double precio, int codigoGenero) {
        this.codigoLibro = codigoLibro;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.codigoGenero = codigoGenero;
    }

    // Getters y setters
    public int getCodigoLibro() { return codigoLibro; }
    public void setCodigoLibro(int codigoLibro) { this.codigoLibro = codigoLibro; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(String fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getCodigoGenero() { return codigoGenero; }
    public void setCodigoGenero(int codigoGenero) { this.codigoGenero = codigoGenero; }
}