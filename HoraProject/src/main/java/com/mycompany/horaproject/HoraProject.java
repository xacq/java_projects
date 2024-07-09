/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.horaproject;

public class HoraProject {

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        hora1.leer();
        hora1.print();

        Hora hora2 = new Hora(23, 59, 59);
        hora2.siguiente();
        hora2.print();

        Hora hora3 = new Hora(0, 0, 0);
        hora3.anterior();
        hora3.print();

        System.out.println("Segundos desde medianoche: " + hora2.aSegundos());

        Hora hora4 = new Hora();
        hora4.deSegundos(3601);
        hora4.print();

        System.out.println("Segundos entre hora1 y hora2: " + hora1.segundosDesde(hora2));

        Hora hora5 = hora4.copia();
        System.out.println("Hora 5 es igual que Hora 4: " + hora5.igualQue(hora4));
    }
}
