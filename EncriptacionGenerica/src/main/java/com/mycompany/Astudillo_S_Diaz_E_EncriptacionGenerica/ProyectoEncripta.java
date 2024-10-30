/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica;

import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.classes.EncriptadorGenerico;
import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.classes.Encriptacion;
import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.encriptadores.EncriptacionPorDesplazamiento;
import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.encriptadores.EncriptacionBit;

import java.util.Scanner;

public class ProyectoEncripta {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            boolean continuar = true; // Variable para controlar el bucle

            while (continuar) {
                // Mensaje a encriptar
                System.out.print("Ingrese el mensaje a encriptar: ");
                String mensaje = leer.nextLine();

                // Menú de selección
                System.out.println("\nSeleccione el algoritmo para encriptar:");
                System.out.println("1. Por Desplazamiento");
                System.out.println("2. Por Bit");
                System.out.println("3. Salir");
                System.out.print("Seleccione (1, 2 o 3): ");
                
                int seleccion = leer.nextInt();

                switch (seleccion) {
                    case 1 -> {
                        //Desplazamiento
                        int llaveDesplazamiento = 0;
                        boolean esNumero = false;

                        while (!esNumero) {
                            System.out.print("Ingrese la llave de desplazamiento: ");
                            if (leer.hasNextInt()) {
                                llaveDesplazamiento = leer.nextInt();
                                esNumero = true; 
                            } else {
                                System.out.println("Por favor, ingrese valores numericos (0 - 9).");
                                leer.next(); 
                            }
                        }

                        Encriptacion<String> shiftEncryption = new EncriptacionPorDesplazamiento(llaveDesplazamiento);
                        EncriptadorGenerico<String> shiftEncryptor = new EncriptadorGenerico<>(shiftEncryption);
                        
                        System.out.println("Mensaje encriptado por Desplazamiento: " + shiftEncryptor.encrypt(mensaje));
                    }
                    case 2 -> {
                        //  Bit
                        System.out.print("Ingrese la llave para Bit (cadena): ");
                        leer.nextLine(); 
                        String llaveBit = leer.nextLine();
                        
                        Encriptacion<String> bitEncryption = new EncriptacionBit(llaveBit);
                        EncriptadorGenerico<String> bitEncryptor = new EncriptadorGenerico<>(bitEncryption);
                        
                        System.out.println("Mensaje encriptado por Bit: " + bitEncryptor.encrypt(mensaje));
                    }
                    case 3 -> {
                        // Opción de salida
                        System.out.println("Saliendo del programa.");
                        continuar = false;
                    }
                    default -> System.out.println("Por favor, elija 1, 2 o 3.");
                }

                leer.nextLine();
            }
        }
    }
}
