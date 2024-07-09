/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentaproject;

import java.util.Scanner;

public class CuentaProject {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar información de la cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Actualizar saldo con interés diario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> cuenta.mostrarDatos();
                case 2 -> {
                    System.out.print("Ingrese la cantidad a ingresar: $");
                    double cantidadIngresar = leer.nextDouble();
                    cuenta.ingresar(cantidadIngresar);
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double cantidadRetirar = leer.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                }
                case 4 -> cuenta.actualizarSaldo();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 5);
    }

}
