/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libroproject;

import java.util.Scanner;

public class LibroProject {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Leer información del libro");
            System.out.println("2. Mostrar información del libro");
            System.out.println("3. Modificar título");
            System.out.println("4. Modificar autor");
            System.out.println("5. Modificar ISBN");
            System.out.println("6. Modificar número de páginas");
            System.out.println("7. Modificar edición");
            System.out.println("8. Modificar editorial");
            System.out.println("9. Modificar ciudad");
            System.out.println("10. Modificar país");
            System.out.println("11. Modificar fecha de edición");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> libro.leerLibro();
                case 2 -> libro.mostrarInfo();
                case 3 -> {
                    System.out.print("Ingrese el nuevo título: ");
                    libro.setTitulo(leer.nextLine());
                }
                case 4 -> {
                    System.out.print("Ingrese el nuevo nombre del autor: ");
                    String nombreAutor = leer.nextLine();
                    System.out.print("Ingrese el nuevo apellido del autor: ");
                    String apellidoAutor = leer.nextLine();
                    libro.setAutor(new Persona(nombreAutor, apellidoAutor));
                }
                case 5 -> {
                    System.out.print("Ingrese el nuevo ISBN: ");
                    libro.setIsbn(leer.nextLine());
                }
                case 6 -> {
                    System.out.print("Ingrese el nuevo número de páginas: ");
                    libro.setPaginas(leer.nextInt());
                    leer.nextLine(); // Consumir el salto de línea
                }
                case 7 -> {
                    System.out.print("Ingrese la nueva edición: ");
                    libro.setEdicion(leer.nextLine());
                }
                case 8 -> {
                    System.out.print("Ingrese la nueva editorial: ");
                    libro.setEditorial(leer.nextLine());
                }
                case 9 -> {
                    System.out.print("Ingrese la nueva ciudad: ");
                    libro.setCiudad(leer.nextLine());
                }
                case 10 -> {
                    System.out.print("Ingrese el nuevo país: ");
                    libro.setPais(leer.nextLine());
                }
                case 11 -> {
                    System.out.println("Ingrese la nueva fecha de edición:");
                    libro.getFechaEdicion().leer();
                }
                case 0 -> salir = true;
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }        
    }
}
