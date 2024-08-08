/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muye_programasupletorio;

public class Hijo {
    private String cedula;
    private String nombre;
    private String apellido;
    private int papa;

    // Constructor
    public Hijo(String cedula, String nombre, String apellido, int papa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.papa = papa;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPapa(int papa) {
        this.papa = papa;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPapa() {
        return papa;
    }
    
    
}
