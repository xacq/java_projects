/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.modelos;

public class Cliente extends Persona{
    private String usuario;
    private String contrasena;

    public Cliente(String nombre, String apellido, String telefono, String correo, String clave, String usuario, String contrasena) {
        super(nombre, apellido, telefono, correo);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    // Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
