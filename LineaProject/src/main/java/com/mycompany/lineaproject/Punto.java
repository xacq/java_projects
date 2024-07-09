/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lineaproject;

public class Punto {
    private double x;
    private double y;

    public Punto() {
        this(0, 0);
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
//SE SOBREESCRIBE EL METODO toString para mostrar los valores actuales de los atributos del objeto
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
