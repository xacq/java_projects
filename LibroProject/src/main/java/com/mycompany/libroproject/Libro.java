/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libroproject;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private Persona autor;
    private String isbn;
    private int paginas;
    private String edicion;
    private String editorial;
    private String ciudad;
    private String pais;
    private Fecha fechaEdicion;

    // Constructor predeterminado
    public Libro() {
        this.titulo = "";
        this.autor = new Persona();
        this.isbn = "";
        this.paginas = 0;
        this.edicion = "";
        this.editorial = "";
        this.ciudad = "";
        this.pais = "";
        this.fechaEdicion = new Fecha();
    }

    // Constructor parametrizado
    public Libro(String titulo, Persona autor, String isbn, int paginas, String edicion, String editorial, String ciudad, String pais, Fecha fechaEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaEdicion = fechaEdicion;
    }

    // Métodos accedentes y mutadores
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Fecha getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Fecha fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

// Método para ingresar libro
    public void leerLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el título: ");
        this.titulo = leer.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        String nombreAutor = leer.nextLine();
        System.out.print("Ingrese el apellido del autor: ");
        String apellidoAutor = leer.nextLine();
        this.autor = new Persona(nombreAutor, apellidoAutor);
        System.out.print("Ingrese el ISBN: ");
        this.isbn = leer.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        this.paginas = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese la edición: ");
        this.edicion = leer.nextLine();
        System.out.print("Ingrese la editorial: ");
        this.editorial = leer.nextLine();
        System.out.print("Ingrese la ciudad: ");
        this.ciudad = leer.nextLine();
        System.out.print("Ingrese el país: ");
        this.pais = leer.nextLine();
        System.out.println("Ingrese la fecha de edición:");
        this.fechaEdicion.leer();
    }

    // Método para mostrar info
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println(edicion + ". edición");
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println(editorial + ", " + ciudad + " (" + pais + "), " + fechaEdicion);
        System.out.println(paginas + " páginas");
    }
}
