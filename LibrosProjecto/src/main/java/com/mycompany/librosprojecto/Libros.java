/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librosprojecto;

import java.util.ArrayList;

public class Libros {
    private ArrayList<Libro> libros;

    // Constructor
    public Libros() {
        this.libros = new ArrayList<>();
    }

    // número de libros en la lista
    public int numeroLibros() {
        return libros.size();
    }

    // Método para insertar libro
    public void insertarLibro(Libro libro) {
        int i = 0;
        while (i < libros.size() && libro.getTitulo().compareToIgnoreCase(libros.get(i).getTitulo()) > 0) {
            i++;
        }
        libros.add(i, libro);
    }

    // eliminar el libro de una determinada posición
    public void eliminarLibro(int posicion) {
        libros.remove(posicion);
    }

    public Libro obtenerLibro(int posicion) {
        return libros.get(posicion);
    }

    public int buscarLibro(String parteTitulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().toLowerCase().contains(parteTitulo.toLowerCase())) {
                return i;
            }
        }
        return -1; // No se encontró el libro
    }

    public void mostrarLibros() {
        System.out.println("Lista de Libros:");
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("--------------------");
        }
    }
}
