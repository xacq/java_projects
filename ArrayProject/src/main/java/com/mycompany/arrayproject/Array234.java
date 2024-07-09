/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayproject;

public class Array234 {
    private double[][][] array;

    // Constructor
    public Array234() {
        array = new double[2][3][4];        // Inicializa el array de 2x3x4
        // Inicializa array
        for (double[][] array1 : array) {
            for (double[] array11 : array1) {
                for (int k = 0; k < array11.length; k++) {
                    array11[k] = Math.random(); // Genera un número aleatorio entre 0 y 1
                }
            }
        }
    }

    // Método para encontrar el máximo y mínimo
    public void max_min() {
        double max = array[0][0][0]; // Inicializa con el primer elemento
        double min = array[0][0][0]; // Inicializa con el primer elemento
        int[] maxIndices = {0, 0, 0}; // Indices del máximo
        int[] minIndices = {0, 0, 0}; // Indices del mínimo

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                        maxIndices[0] = i;
                        maxIndices[1] = j;
                        maxIndices[2] = k;
                    }
                    if (array[i][j][k] < min) {
                        min = array[i][j][k];
                        minIndices[0] = i;
                        minIndices[1] = j;
                        minIndices[2] = k;
                    }
                }
            }
        }

        System.out.println("Valor máximo: " + max + " en el índice [" + maxIndices[0] + "," + maxIndices[1] + "," + maxIndices[2] + "]");
        System.out.println("Valor mínimo: " + min + " en el índice [" + minIndices[0] + "," + minIndices[1] + "," + minIndices[2] + "]");
    }
    
        // Método para mostrar el array
    public void mostrarArray() {
        for (double[][] array1 : array) {
            for (double[] array11 : array1) {
                for (int k = 0; k < array11.length; k++) {
                    System.out.print(array11[k] + " ");
                }
                System.out.println(); // Salto de línea después de cada fila interna
            }
            System.out.println(); // Salto de línea después de cada fila exterior
        }
    }
}