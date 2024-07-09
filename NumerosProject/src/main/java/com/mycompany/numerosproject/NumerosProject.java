/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosproject;

import java.util.Scanner;

public class NumerosProject {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Arreglo para almacenar los números enteros
        int[] numeros = new int[10];

        // Leer los diez números enteros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite en el teclado el dato " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.println("\nOrden inverso de los numeros ingresados: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i]+" - ");
        }

    }
}
