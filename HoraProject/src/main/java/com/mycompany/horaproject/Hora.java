/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.horaproject;

import java.util.Scanner;

public class Hora {
    //atributos
    private int horas;
    private int minutos;
    private int segundos;
//constructores
    public Hora() {
        this(0, 0, 0);
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        valida();
    }
//metodos
    private void valida() {
        if (segundos < 0 || segundos >= 60) {
            minutos += segundos / 60;
            segundos = segundos % 60;
            if (segundos < 0) {
                segundos += 60;
                minutos--;
            }
        }

        if (minutos < 0 || minutos >= 60) {
            horas += minutos / 60;
            minutos = minutos % 60;
            if (minutos < 0) {
                minutos += 60;
                horas--;
            }
        }

        if (horas < 0 || horas >= 24) {
            horas = (horas % 24 + 24) % 24;
        }
    }

    public void leer() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese las horas: ");
        horas = leer.nextInt();

        System.out.print("Ingrese los minutos: ");
        minutos = leer.nextInt();

        System.out.print("Ingrese los segundos: ");
        segundos = leer.nextInt();

        valida();
    }
//getters
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
        valida();
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
        valida();
    }

    public int getSegundos() {
        return segundos;
    }
//setters
    public void setSegundos(int segundos) {
        this.segundos = segundos;
        valida();
    }

    public void print() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public int aSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public void deSegundos(int totalSegundos) {
        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;
        valida();
    }

    public int segundosDesde(Hora otra) {
        return this.aSegundos() - otra.aSegundos();
    }

    public void siguiente() {
        segundos++;
        valida();
    }

    public void anterior() {
        segundos--;
        valida();
    }

    public Hora copia() {
        return new Hora(horas, minutos, segundos);
    }

    public boolean igualQue(Hora otra) {
        return this.aSegundos() == otra.aSegundos();
    }

    public boolean menorQue(Hora otra) {
        return this.aSegundos() < otra.aSegundos();
    }

    public boolean mayorQue(Hora otra) {
        return this.aSegundos() > otra.aSegundos();
    }
}
