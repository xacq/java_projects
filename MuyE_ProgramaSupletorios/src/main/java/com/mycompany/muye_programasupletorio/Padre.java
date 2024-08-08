/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muye_programasupletorio;


public class Padre {
        private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private int cantidadHijos;

    // Constructor
    public Padre(int id, String nombre, String apellido, String cedula, int cantidadHijos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cantidadHijos = cantidadHijos;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getcantidadHijos() {
        return cantidadHijos;
    }

    public void setcantidadHijos(int numeroHijos) {
        this.cantidadHijos = numeroHijos;
    }
    
        @Override
        public String toString() {
        return "Papa{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", numeroHijos=" + cantidadHijos +
                '}';
    }
}
