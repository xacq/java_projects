/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautomotriz.classes;

public class Vehiculo {
    private String chasis;
    private String marca;
    private String modelo;
    private int año;
    private int userId;

    public Vehiculo(String chasis, String marca, String modelo, int año, int userId) {
        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.userId = userId;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int UserId) {
        this.userId = UserId;
    }
    
    @Override
    public String toString() {
        return "Vehiculo: " +
                "Chasis= " + chasis + ", " +
                "Marca= " + marca + ", " +
                "Modelo= " + modelo + ", " +
                "Año=" + año +".";
    }
}

