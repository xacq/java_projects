/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cdproject;

public class Cd {
    private Cancion[] canciones; // Array de objetos Cancion
    private int contador; // Siguiente posición libre en el array

    // Constructor predeterminado
    public Cd() {
        canciones = new Cancion[10]; // Crea el array con capacidad inicial de 10 canciones
        contador = 0; // Inicializa el contador a 0
    }

    // número de canciones
    public int numeroCanciones() {
        return contador;
    }

    // Devuelve la canción en la posición indicada
    public Cancion dameCancion(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            return canciones[posicion];
        } else {
            return null; // O lanza una excepción si prefieres
        }
    }

    // Graba una canción en la posición indicada
    public void grabaCancion(int posicion, Cancion cancion) {
        if (posicion >= 0 && posicion < contador) {
            canciones[posicion] = cancion;
        } else {
            // No hace nada o lanza una excepción si prefieres
        }
    }

    // Agrega una canción al final del array
    public void agrega(Cancion cancion) {
        if (contador < canciones.length) {
            canciones[contador] = cancion;
            contador++;
        } else {
            // Amplifica el array si se llena
            Cancion[] nuevoArray = new Cancion[canciones.length * 2];
            for (int i = 0; i < contador; i++) {
                nuevoArray[i] = canciones[i];
            }
            nuevoArray[contador] = cancion;
            canciones = nuevoArray;
            contador++;
        }
    }

    // Elimina la canción en la posición indicada
    public void elimina(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            for (int i = posicion; i < contador - 1; i++) {
                canciones[i] = canciones[i + 1];
            }
            canciones[contador - 1] = null; // Elimina la última canción
            contador--;
        } else {
            // No hace nada o lanza una excepción si prefieres
        }
    }
}

