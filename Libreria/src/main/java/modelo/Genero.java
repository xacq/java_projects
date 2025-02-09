/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Genero {
    private int codigoGenero;
    private String descripcion;

    public Genero() {}

    public Genero(int codigoGenero, String descripcion) {
        this.codigoGenero = codigoGenero;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public int getCodigoGenero() { return codigoGenero; }
    public void setCodigoGenero(int codigoGenero) { this.codigoGenero = codigoGenero; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() { return descripcion; } // Para el JComboBox
}