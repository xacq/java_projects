/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lineaproject;

import java.util.Scanner;

public class LineaProject {

    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);

        Linea linea = new Linea(new Punto(0, 0), new Punto(1, 1));
        System.out.println("Línea inicial: " + linea); 

        System.out.print("Ingrese las unidades para mover a la derecha: ");
        double derecha = leer.nextDouble();
        linea.mueveDerecha(derecha);
        System.out.println("Después de mover a la derecha " + derecha + " unidades: " + linea); 

        System.out.print("Ingrese las unidades para mover hacia arriba: ");
        double arriba = leer.nextDouble();
        linea.mueveArriba(arriba);
        System.out.println("Después de mover hacia arriba " + arriba + " unidades: " + linea); 

        System.out.print("Ingrese las unidades para mover a la izquierda: ");
        double izquierda = leer.nextDouble();
        linea.mueveIzquierda(izquierda);
        System.out.println("Después de mover a la izquierda " + izquierda + " unidades: " + linea); 

        System.out.print("Ingrese las unidades para mover hacia abajo: ");
        double abajo = leer.nextDouble();
        linea.mueveAbajo(abajo);
        System.out.println("Después de mover hacia abajo " + abajo + " unidades: " + linea); 
    }
}
