/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafeteraproject;

public class Cafetera {
    private int capacidadMaxima; // La cantidad máxima de café que puede contener la cafetera
    private int cantidadActual; // La cantidad actual de café en la cafetera

    // Constructor predeterminado
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Constructor 
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    // Constructor que inicializa la cafetera con los atributos
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        // Si la cantidad actual es mayor que la capacidad máxima, se ajusta al máximo
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    // Método para llenar la cafetera al tope
    public void llenarCafe() {
        this.cantidadActual = capacidadMaxima;
        System.out.println("La cafetera se ha llenado.");
    }

    // Método para servir una taza de café
    public void servirTaza(int cantidad) {
        // Si no hay suficiente café para llenar la taza, se sirve lo que queda
        if (cantidad > cantidadActual) {
            System.out.println("No hay suficiente café. Se sirvieron " + cantidadActual + " c.c. de café.");
            cantidadActual = 0;
        } else {
            cantidadActual -= cantidad;
            System.out.println("Se sirvieron " + cantidad + " c.c. de café.");
        }
    }

    // Método para vaciar la cafetera
    public void vaciarCafe() {
        this.cantidadActual = 0;
        System.out.println("La cafetera se ha vaciado.");
    }

    // Método para agregar café a la cafetera
    public void agregarCafe(int cantidad) {
        // Si se agrega más café del que la cafetera puede contener, se llena al máximo
        if (cantidadActual + cantidad > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            System.out.println("Se agregó café. La cafetera está llena.");
        } else {
            cantidadActual += cantidad;
            System.out.println("Se agregaron " + cantidad + " c.c. de café a la cafetera.");
        }
    }

    // Método para mostrar el estado
    public void mostrarEstado() {
        System.out.println("Capacidad máxima: " + capacidadMaxima + " c.c.");
        System.out.println("Cantidad actual: " + cantidadActual + " c.c.");
    }

    // Getters y setters 
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }
}

