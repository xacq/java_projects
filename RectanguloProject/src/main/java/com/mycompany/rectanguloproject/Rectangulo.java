/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectanguloproject;

public class Rectangulo {
    //Cada uno delos vertices
    private Punto v1si; // Vértice superior izquierdo
    private Punto v2sd; // Vértice superior derecho
    private Punto v3ii; // Vértice inferior derecho
    private Punto v4id; // Vértice inferior izquierdo

    // Constructor a partir de los cuatro vértices
    public Rectangulo(Punto v1, Punto v2, Punto v3, Punto v4) {
        this.v1si = v1;
        this.v2sd = v2;
        this.v3ii = v3;
        this.v4id = v4;
    }

    // Constructor a partir de la base y la altura
    public Rectangulo(double base, double altura) {
        this.v1si = new Punto(0, altura);
        this.v2sd = new Punto(base, altura);
        this.v3ii = new Punto(base, 0);
        this.v4id = new Punto(0, 0);
    }

    // Método para calcular la superficie
    public double calcularSuperficie() {
        double base = v2sd.getX() - v1si.getX();
        double altura = v1si.getY() - v4id.getY();
        return base * altura;
    }

    // Método para desplazar el rectángulo
    public void desplazar(double dx, double dy) {
        v1si.desplazar(dx, dy);
        v2sd.desplazar(dx, dy);
        v3ii.desplazar(dx, dy);
        v4id.desplazar(dx, dy);
    }

    // Método para imprimir los vértices del rectángulo
    public void imprimirVertices() {
        System.out.println("Vértices del rectángulo:");
        System.out.println("V1: (" + v1si.getX() + ", " + v1si.getY() + ")");
        System.out.println("V2: (" + v2sd.getX() + ", " + v2sd.getY() + ")");
        System.out.println("V3: (" + v3ii.getX() + ", " + v3ii.getY() + ")");
        System.out.println("V4: (" + v4id.getX() + ", " + v4id.getY() + ")");
    }
}


