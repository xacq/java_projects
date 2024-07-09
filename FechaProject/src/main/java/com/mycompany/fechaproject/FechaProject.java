/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fechaproject;

public class FechaProject {

    public static void main(String[] args) {
        // Crear fecha predeterminada
        Fecha fecha1 = new Fecha();
        System.out.println("Fecha predeterminada: " + fecha1.larga());

        // Crear fecha con parámetros
        Fecha fecha2 = new Fecha(15, 8, 2023);
        System.out.println("Fecha con parámetros: " + fecha2.larga());

        // Leer fecha desde el teclado
        Fecha fecha3 = new Fecha();
        fecha3.leer();
        System.out.println("Fecha ingresada: " + fecha3.larga());

        // Mostrar fecha en formato corto
        System.out.println("Formato corto: " + fecha3.corta());

        // Calcular días transcurridos desde el 1-1-1900
        System.out.println("Días transcurridos desde el 1-1-1900: " + fecha3.diasTranscurridos());

        // Mostrar el día de la semana
        System.out.println("Día de la semana: " + fecha3.diaSemana());

        // Calcular fecha tras ciertos días desde el 1-1-1900
        fecha3.fechaTras(45000);
        System.out.println("Fecha tras 45000 días desde el 1-1-1900: " + fecha3.larga());

        // Clonar fecha
        Fecha copiaFecha = fecha3.copia();
        System.out.println("Copia de la fecha: " + copiaFecha.larga());

        // fechas son iguales
        System.out.println("Las fechas son iguales: " + fecha3.igualQue(fecha2));

        // Avanzar al día siguiente
        fecha3.siguiente();
        System.out.println("Día siguiente: " + fecha3.larga());

        // Retroceder al día anterior
        fecha3.anterior();
        System.out.println("Día anterior: " + fecha3.larga());
    }
}
