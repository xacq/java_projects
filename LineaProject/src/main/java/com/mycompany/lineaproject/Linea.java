/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lineaproject;

public class Linea {
    private Punto puntoA;
    private Punto puntoB;

    public Linea() {
        this(new Punto(), new Punto());
    }

    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    public void mueveDerecha(double distancia) {
        puntoA.setX(puntoA.getX() + distancia);
        puntoB.setX(puntoB.getX() + distancia);
    }

    public void mueveIzquierda(double distancia) {
        puntoA.setX(puntoA.getX() - distancia);
        puntoB.setX(puntoB.getX() - distancia);
    }

    public void mueveArriba(double distancia) {
        puntoA.setY(puntoA.getY() + distancia);
        puntoB.setY(puntoB.getY() + distancia);
    }

    public void mueveAbajo(double distancia) {
        puntoA.setY(puntoA.getY() - distancia);
        puntoB.setY(puntoB.getY() - distancia);
    }
//SE SOBREESCRIBE EL METODO toString para mostrar los valores actuales de los atributos del objeto
    @Override
    public String toString() {
        return "[" + puntoA + "," + puntoB + "]";
    }
}

