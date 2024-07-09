/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nifproject;

public class NIFProject {

    public static void main(String[] args) {
        NIF nif = new NIF();
        nif.leer();
        nif.mostrar();
        
        // Probar constructor con DNI
        NIF otroNif = new NIF(395469);
        otroNif.mostrar();
        
        // Probar DNI
        otroNif.setNumeroDNI(12345678);
        otroNif.mostrar();
    }
}
