/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fechaproject;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor por defecto
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
        valida();
    }

    // pedir al usuario el día, mes y año
    public void leer() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el día (1 a 31): ");
        this.dia = leer.nextInt();
        System.out.print("Ingrese el mes (1 a 12): ");
        this.mes = leer.nextInt();
        System.out.print("Ingrese el año (1900 a 2050): ");
        this.año = leer.nextInt();
        valida();
    }

    // verificar si el año es bisiesto
    public boolean bisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // días en un mes específico
    public int diasMes(int mes) {
        return switch (mes) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> bisiesto() ? 29 : 28;
            default -> 31;
        };
    }

    // validar la fecha
    private void valida() {
        if (año < 1900 || año > 2050) {
            año = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1 || dia > diasMes(mes)) {
            dia = 1;
        }
    }

    // getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    // setters
    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }

    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }

    public void setAño(int año) {
        this.año = año;
        valida();
    }

    // fecha en formato corto
    public String corta() {
        return String.format("%02d-%02d-%d", dia, mes, año);
    }

    // calcular los días transcurridos desde el 1-1-1900 hasta la fecha
    public int diasTranscurridos() {
        Fecha fechaBase = new Fecha(1, 1, 1900);
        return diasEntre(fechaBase);
    }

    // día de la semana
    public int diaSemana() {
        int diasTranscurridos = diasTranscurridos();
        return diasTranscurridos % 7;
    }

    // mostrar la fecha en formato largo
    public String larga() {
        String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return String.format("%s %d de %s de %d", diasSemana[diaSemana()], dia, meses[mes - 1], año);
    }

    // fecha tras ciertos días desde el 1-1-1900
    public void fechaTras(long dias) {
        Fecha fechaBase = new Fecha(1, 1, 1900);
        while (dias > 0) {
            fechaBase.siguiente();
            dias--;
        }
        this.dia = fechaBase.dia;
        this.mes = fechaBase.mes;
        this.año = fechaBase.año;
    }

    // días entre dos fechas
    public int diasEntre(Fecha otra) {
        int contador = 0;
        Fecha aux = new Fecha(otra.dia, otra.mes, otra.año);
        while (aux.menorQue(this)) {
            aux.siguiente();
            contador++;
        }
        return contador;
    }

    // avanzar al día siguiente
    public void siguiente() {
        dia++;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        valida();
    }

    // retroceder al día anterior
    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                año--;
            }
            dia = diasMes(mes);
        }
        valida();
    }

    // clonar la fecha
    public Fecha copia() {
        return new Fecha(dia, mes, año);
    }

    //fechas son iguales
    public boolean igualQue(Fecha otra) {
        return dia == otra.dia && mes == otra.mes && año == otra.año;
    }

    // fecha es anterior a otra
    public boolean menorQue(Fecha otra) {
        if (año != otra.año) {
            return año < otra.año;
        }
        if (mes != otra.mes) {
            return mes < otra.mes;
        }
        return dia < otra.dia;
    }

    // fecha es posterior a otra
    public boolean mayorQue(Fecha otra) {
        return !menorQue(otra) && !igualQue(otra);
    }
}
