/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos.modelos;

public class DetalleFactura {
    private int cantidad;
    private double precio;
    private Plato plato;
    private Factura factura;

    public DetalleFactura(int cantidad, double precio, Plato plato, Factura factura) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.plato = plato;
        this.factura = factura;
    }

    // Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Plato getPlato() {
        return plato;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }


}
