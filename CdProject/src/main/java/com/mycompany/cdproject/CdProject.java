/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cdproject;

public class CdProject {

    public static void main(String[] args) {
        Cd miCD = new Cd();

        // Crea algunas canciones
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen", 357);
        Cancion cancion2 = new Cancion("Stairway to Heaven", "Led Zeppelin", 480);
        Cancion cancion3 = new Cancion("Hotel California", "Eagles", 342);
        
        miCD.agrega(cancion1);
        miCD.agrega(cancion2);
        miCD.agrega(cancion3);
 
        System.out.println("Número de canciones: " + miCD.numeroCanciones());

        System.out.println("Canción en la posición 1: " + miCD.dameCancion(1).getTitulo());

        Cancion cancion4 = new Cancion("Imagine", "John Lennon", 289);
        miCD.grabaCancion(0, cancion4);

        miCD.elimina(2);
    }
}
