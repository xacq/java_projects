/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaproject;

public class MediaProject {

    public static void main(String[] args) {
        double[] numeros = new double[30];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random(); // Genera un número aleatorio entre 0 y 1
        }
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        double media = suma / numeros.length; //media aritMETica

        double sumaCuadrados = 0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumaCuadrados / numeros.length); //desviacion eStandar

        System.out.println("\nNúmeros aleatorios:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nMedia: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }
}
