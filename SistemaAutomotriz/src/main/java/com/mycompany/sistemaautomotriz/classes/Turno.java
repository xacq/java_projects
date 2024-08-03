/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautomotriz.classes;

public class Turno {
    private int idUser;
    private String chasis;
    private String fecha;
    private String hora;
    private String estado;

    public Turno(int idUser, String chasis, String fecha, String hora, String estado) {
        this.idUser = idUser;
        this.chasis = chasis;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getidUser() {
        return idUser;
    }

    public void setidUser(int idUser) {
        this.idUser = idUser;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void confirmarTurno() {
        this.estado = "Confirmado";
    }

    public void cancelarTurno() {
        this.estado = "Cancelado";
    }
    //SE SOBRE ESCRIBE LA FUNCION toString
    @Override
    public String toString() {
        return "Turno: " +
                "Fecha= " + fecha + ", " +
                "Hora= " + hora + ", " +
                "Estado= " + estado + 
                '.';
    }
}
