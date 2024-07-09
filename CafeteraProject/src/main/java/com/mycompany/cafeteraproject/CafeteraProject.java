/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafeteraproject;

import java.util.Scanner;

/**
 *
 * @author mdjqp
 */
public class CafeteraProject {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // uso constructor predeterminado
        Cafetera cafetera = new Cafetera();

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir una taza");
            System.out.println("3. Vaciar la cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Mostrar estado de la cafetera");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Llenar la cafetera
                    cafetera.llenarCafe();
                    cafetera.mostrarEstado(); // Mostrar el estado después de la acción
                }
                case 2 -> {
                    // Servir una taza de café
                    System.out.print("Ingrese la cantidad de café a servir (c.c.): ");
                    int cantidadServir = leer.nextInt();
                    cafetera.servirTaza(cantidadServir);
                    cafetera.mostrarEstado(); // Mostrar el estado después de la acción
                }
                case 3 -> {
                    // Vaciar la cafetera
                    cafetera.vaciarCafe();
                    cafetera.mostrarEstado(); // Mostrar el estado después de la acción
                }
                case 4 -> {
                    // Agregar café a la cafetera
                    System.out.print("Ingrese la cantidad de café a agregar (c.c.): ");
                    int cantidadAgregar = leer.nextInt();
                    cafetera.agregarCafe(cantidadAgregar);
                    cafetera.mostrarEstado(); // Mostrar el estado después de la acción
                }
                case 5 -> // Mostrar el estado actual de la cafetera
                    cafetera.mostrarEstado();
                case 6 -> // Salir del programa
                    System.out.println("Saliendo del programa...");
                default -> // Opción no válida
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 6); // Repetir hasta que se seleccione la opción de salir

    }
}
