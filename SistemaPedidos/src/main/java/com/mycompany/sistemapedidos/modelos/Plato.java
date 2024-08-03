/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.modelos;

public class Plato {
    private String nombre;
    private String descripcion;
    private double precio;
    private Administrador administrador;

    public Plato(String nombre, String descripcion, double precio, Administrador administrador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.administrador = administrador;
    }

    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Platos: " +
                "Plato= " + descripcion + ", " +
                "Valor= " + precio + ", " + 
                '.';
    }
}
