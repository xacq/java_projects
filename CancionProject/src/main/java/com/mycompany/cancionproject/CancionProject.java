/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cancionproject;

public class CancionProject {

    public static void main(String[] args) {
        // Crear una canción utilizando el constructor con parámetros
        Cancion cancion1 = new Cancion("Imagine", "John Lennon");
        cancion1.mostrarInfo();

        // Crear una canción utilizando el constructor predeterminado
        Cancion cancion2 = new Cancion();
        cancion2.setTitulo("Bohemian Rhapsody");
        cancion2.setAutor("Queen");
        cancion2.mostrarInfo();

        // Modificar el título y el autor de la canción 2
        cancion2.setTitulo("Don't Stop Me Now");
        cancion2.setAutor("Freddie Mercury");
        cancion2.mostrarInfo();
    }
}
