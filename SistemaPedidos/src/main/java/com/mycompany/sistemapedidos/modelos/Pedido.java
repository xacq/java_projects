/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.modelos;

import java.sql.Date;

public class Pedido {
    private String estado;
    private Date fecha;
    private Cliente cliente;
    private Repartidor repartidor;

    public Pedido(String estado, Date fecha, Cliente cliente, Repartidor repartidor) {
        this.estado = estado;
        this.fecha = fecha;
        this.cliente = cliente;
        this.repartidor = repartidor;
    }

    // Getters y Setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    
}

