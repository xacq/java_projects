/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librosprojecto;

public class Libro {
    private String titulo;
    private String autor;

    // Constructor con parámetros
    public Libro(String titulo, String autor) {
        this.titulo = titulo != null ? titulo : "";  // Evitar título null, asignar cadena vacía en su lugar
        this.autor = autor != null ? autor : "";    // Evitar autor null, asignar cadena vacía en su lugar
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo != null ? titulo : "";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor != null ? autor : "";
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        // Otros detalles del libro
    }
}


