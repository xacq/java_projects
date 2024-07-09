/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectanguloproject;

import java.util.Scanner;

public class RectanguloProject {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar los vértices del rectángulo 1");
        System.out.println("Ingrese las coordenadas del Vértice superior izquierdo V1 (x, y):");
        System.out.println("X:");
        double x1 = leer.nextDouble();
        System.out.println("Y:");
        double y1 = leer.nextDouble();
        Punto v1 = new Punto(x1, y1);

        System.out.println("Ingrese las coordenadas del Vértice superior derecho V2 (x, y):");
        System.out.println("X:");
        double x2 = leer.nextDouble();
        System.out.println("Y:");
        double y2 = leer.nextDouble();
        Punto v2 = new Punto(x2, y2);

        System.out.println("Ingrese las coordenadas del Vértice inferior derecho V3 (x, y):");
        System.out.println("X:");
        double x3 = leer.nextDouble();
        System.out.println("Y:");
        double y3 = leer.nextDouble();
        Punto v3 = new Punto(x3, y3);

        System.out.println("Ingrese las coordenadas del Vértice inferior izquierdo V4 (x, y):");
        System.out.println("X:");
        double x4 = leer.nextDouble();
        System.out.println("Y:");
        double y4 = leer.nextDouble();
        Punto v4 = new Punto(x4, y4);

        // Crear el rectángulo 1
        Rectangulo rectangulo1 = new Rectangulo(v1, v2, v3, v4);

        // Crear el rectángulo 2 a partir de la base y la altura
        System.out.println("Ingrese la base del rectángulo 2:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo 2:");
        double altura = leer.nextDouble();
        Rectangulo rectangulo2 = new Rectangulo(base, altura);

        // Imprimir los vértices de los rectángulos
        System.out.println("Rectángulo 1:");
        rectangulo1.imprimirVertices();
        System.out.println("Rectángulo 2:");
        rectangulo2.imprimirVertices();

        // Calcular y mostrar la superficie del rectángulo 1
        System.out.println("Superficie del rectángulo 1: " + rectangulo1.calcularSuperficie());

        // Desplazar el rectángulo 1 y volver a imprimir sus vértices
        System.out.println("Ingrese el desplazamiento en el eje X (dx):");
        double dx = leer.nextDouble();
        System.out.println("Ingrese el desplazamiento en el eje Y (dy):");
        double dy = leer.nextDouble();
        rectangulo1.desplazar(dx, dy);
        System.out.println("Rectángulo 1 después del desplazamiento:");
        rectangulo1.imprimirVertices();

    }
}