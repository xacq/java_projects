/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.modelos;

public class Repartidor extends Persona{
    private String vehiculo;
    private String usuario;
    private String contrasena;

    public Repartidor(String nombre, String apellido, String telefono, String correo, String vehiculo, String usuario, String contrasena) {
        super(nombre, apellido, telefono, correo);
        this.vehiculo = vehiculo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

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
