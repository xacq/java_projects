/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libroproject;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor predeterminado
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    // Constructor parametrizado
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        validar();
    }

    // Método para leer la fecha desde la entrada estándar
    public void leer() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el día (1 a 31): ");
        this.dia = leer.nextInt();
        System.out.print("Ingrese el mes (1 a 12): ");
        this.mes = leer.nextInt();
        System.out.print("Ingrese el año (1900 a 2050): ");
        this.año = leer.nextInt();
        validar();
    }

    // Método para validar la fecha
    private void validar() {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (año < 1900 || año > 2050) {
            año = 1900;
        }
    }

    // Método para mostrar la fecha en formato largo
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}
