/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nifproject;

import java.util.Scanner;

public class NIF {
    private long numeroDNI;
    private char letra;

    // Constructor predeterminado
    public NIF() {
        this.numeroDNI = 0;
        this.letra = ' '; // Espacio en blanco indica NIF no válido
    }

    // Constructor que recibe el DNI y establece la letra correspondiente
    public NIF(long numeroDNI) {
        this.numeroDNI = numeroDNI;
        this.letra = calcularLetra(numeroDNI);
    }

    // Accedentes y mutador para el número de DNI
    public long getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
        this.letra = calcularLetra(numeroDNI);
    }

    public char getLetra() {
        return letra;
    }

    // leer el número DNI desde el teclado
    public void leer() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de DNI: ");
        this.numeroDNI = leer.nextLong();
        this.letra = calcularLetra(this.numeroDNI);
    }

    // Método para mostrar NIF
    public void mostrar() {
        System.out.printf("%08d-%c%n", numeroDNI, letra);
    }

    // Método auxiliar privado para calcular la letra del NIF
    private char calcularLetra(long dni) {
        // Array con las letras correspondientes a cada valor de resto
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = (int) (dni % 23); // Calcular el resto de la división entre 23
        return letras[resto]; // Devolver la letra correspondiente al resto
    }
}
