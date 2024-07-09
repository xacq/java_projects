/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleadoproject;

import java.util.Scanner;

public class EmpleadoProject {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Empleado empleado = new Empleado(12345678, 2000.0, 20.0, 10, 15.0, true, 2);
        empleado.printAll();
        

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Ver información básica del empleado");
            System.out.println("2. Ver toda la información del empleado");
            System.out.println("3. Modificar sueldo base");
            System.out.println("4. Modificar pago por hora extra");
            System.out.println("5. Modificar horas extra realizadas");
            System.out.println("6. Modificar tipo de IRPF");
            System.out.println("7. Modificar estado civil");
            System.out.println("8. Modificar número de hijos");
            System.out.println("9. Calcular complemento por horas extra");
            System.out.println("10. Calcular sueldo bruto");
            System.out.println("11. Calcular retención de IRPF");
            System.out.println("12. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion;
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    empleado.println();
                    break;
                case 2:
                    empleado.printAll();
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo sueldo base: ");
                    double nuevoSueldoBase = leer.nextDouble();
                    empleado.setSueldoBase(nuevoSueldoBase);
                    break;
                case 4:
                    System.out.print("Ingrese el nuevo pago por hora extra: ");
                    double nuevoPagoPorHoraExtra = leer.nextDouble();
                    empleado.setPagoPorHoraExtra(nuevoPagoPorHoraExtra);
                    break;
                case 5:
                    System.out.print("Ingrese las nuevas horas extra realizadas: ");
                    int nuevasHorasExtra = leer.nextInt();
                    empleado.setHorasExtraRealizadas(nuevasHorasExtra);
                    break;
                case 6:
                    System.out.print("Ingrese el nuevo tipo de IRPF: ");
                    double nuevoTipoIrpf = leer.nextDouble();
                    empleado.setTipoIrpf(nuevoTipoIrpf);
                    break;
                case 7:
                    System.out.print("Ingrese el nuevo estado civil (true para casado, false para no casado): ");
                    boolean nuevoEstadoCivil = leer.nextBoolean();
                    empleado.setCasado(nuevoEstadoCivil);
                    break;
                case 8:
                    System.out.print("Ingrese el nuevo número de hijos: ");
                    int nuevoNumeroHijos = leer.nextInt();
                    empleado.setNumeroHijos(nuevoNumeroHijos);
                    break;
                case 9:
                    System.out.println("Complemento por horas extra: " + empleado.calcularComplementoHorasExtra());
                    break;
                case 10:
                    System.out.println("Sueldo bruto: " + empleado.calcularSueldoBruto());
                    break;
                case 11:
                    System.out.println("Retención de IRPF: " + empleado.calcularRetencionesIrpf());
                    break;
                case 12:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    
}
