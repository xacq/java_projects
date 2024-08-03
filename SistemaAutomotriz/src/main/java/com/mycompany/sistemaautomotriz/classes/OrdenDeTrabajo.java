/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaautomotriz.classes;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeTrabajo {
    private String idOrden;
    private String descripcionProblema;
    private String estado;
    private Vehiculo vehiculo;
    private Ingeniero ingeniero;
    private double total;
    private List<Pieza> piezas;

    public OrdenDeTrabajo(String idOrden, String descripcionProblema, String estado, Vehiculo vehiculo, Ingeniero ingeniero, double total) {
        this.idOrden = idOrden;
        this.descripcionProblema = descripcionProblema;
        this.estado = estado;
        this.vehiculo = vehiculo;
        this.ingeniero = ingeniero;
        this.total = total;
        this.piezas = new ArrayList<>();
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Ingeniero getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(Ingeniero ingeniero) {
        this.ingeniero = ingeniero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Pieza> getPiezas() {
        return piezas;
    }

    public void agregarPieza(Pieza pieza) {
        this.piezas.add(pieza);
        calcularTotal();
    }

    private void calcularTotal() {
        this.total = piezas.stream().mapToDouble(p -> p.getPrecioUnitario() * p.getCantidadDisponible()).sum();
    }
}

