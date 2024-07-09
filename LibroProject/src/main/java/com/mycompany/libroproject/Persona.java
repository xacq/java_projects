/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libroproject;

public class Persona {
    private String nombre;
    private String apellido;

    // Constructor que recibe nombre y apellido
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor predeterminado
    public Persona() {
        this.nombre = "";
        this.apellido = "";
    }

    // Métodos accedentes
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

    // Método para mostrar la información de la persona
    public String toString() {
        return nombre + " " + apellido;
    }
}
