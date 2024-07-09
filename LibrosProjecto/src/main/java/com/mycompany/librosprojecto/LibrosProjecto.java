/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librosprojecto;

import java.util.Scanner;

public class LibrosProjecto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libros lista = new Libros();
        int opcion;
        do {
            System.out.println("\nMenú de Opciones Biblioteca:");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar por título");
            System.out.println("4. Mostrar los libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Título del libro: ");
                    String titulo = leer.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = leer.nextLine();
                    Libro nuevoLibro = new Libro(titulo, autor);
                    lista.insertarLibro(nuevoLibro);
                    System.out.println("Libro insertado.");
                }
                case 2 -> {
                    System.out.print("CUal es la posición del libro: ");
                    int posicionEliminar = leer.nextInt();
                    if (posicionEliminar >= 0 && posicionEliminar < lista.numeroLibros()) {
                        lista.eliminarLibro(posicionEliminar);
                        System.out.println("Libro eliminado.");
                    } else {
                        System.out.println("No se pudo eliminar.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese parte del título: ");
                    String parteTitulo = leer.nextLine();
                    int posicionEncontrado = lista.buscarLibro(parteTitulo);
                    if (posicionEncontrado != -1) {
                        System.out.println("Libro encontrado en: " + posicionEncontrado + ":");
                        lista.obtenerLibro(posicionEncontrado).mostrarInfo();
                    } else {
                        System.out.println("No se encontró.");
                    }
                }
                case 4 -> lista.mostrarLibros();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

    }
}
