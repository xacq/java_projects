/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.diaz_e_astudillo_s_examen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Diaz_E_Astudillo_S_Examen {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        List<Empleado> empleados = leerEmpleados("Empleados.txt");
        guardarSueldos(empleados, "Sueldos.txt");
    }

    // Lee los datos de los empleados del archivo
    private static List<Empleado> leerEmpleados(String nombreArchivo) throws FileNotFoundException, IOException {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String tipoEmpleado = datos[1];

                // Validación para valores "Null"
                double horasTrabajadas = obtenerValorNumerico(datos[2]);
                int bonificaciones = obtenerValorEntero(datos[3]);

                Empleado empleado;
                if (tipoEmpleado.equals("Tiempo Completo")) {
                    empleado = new EmpleadoTiempoCompleto(nombre, horasTrabajadas) {};
                } else {
                    empleado = new EmpleadoTiempoParcial(nombre, horasTrabajadas);
                }

                // Aplica los decoradores según los beneficios
                if (datos[4] != null && datos[4].equals("SI")) {
                    empleado = new HorasExtras(empleado);
                }
                if (datos[5] != null && datos[5].equals("SI")) {
                    empleado = new SeguroMedico(empleado);
                }
                if (datos[6] != null && datos[6].equals("SI")) {
                    empleado = new Bonificaciones(empleado, bonificaciones);
                }
                empleados.add(empleado);
            }}
        return empleados;
    }

    // Obtiene un valor numérico de un string, manejando valores "Null"
    private static double obtenerValorNumerico(String valor) {
        if (valor == null || valor.isEmpty()) {
            return 0.0; // Valor por defecto si es "Null"
        } else {
            return Double.parseDouble(valor);
        }
    }

    // Obtiene un valor entero de un string, manejando valores "Null"
    private static int obtenerValorEntero(String valor) {
        if (valor == null || valor.isEmpty()) {
            return 0; // Valor por defecto si es "Null"
        } else {
            return Integer.parseInt(valor);
        }
    }

    // Guarda los datos de los sueldos en un archivo
    private static void guardarSueldos(List<Empleado> empleados, String nombreArchivo) throws IOException {
        double sueldoHorasExtras = 0;
        double sueldoBonificaciones = 0;
        double sueldoBase;
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (Empleado empleado : empleados) {
                Empleado empleadoBase = empleado.getEmpleado() != null ? empleado.getEmpleado() : empleado; // Obtener el empleado base
                sueldoBase = empleadoBase.calcularSueldo(); // Calcular el sueldo base
                if (empleado instanceof HorasExtras) {
                    sueldoHorasExtras = empleado.calcularSueldo() - sueldoBase;
                }
                double sueldoSeguroMedico = 0;
                if (empleado instanceof SeguroMedico) {
                    sueldoSeguroMedico = -30;
                }
                if (empleado instanceof Bonificaciones) {
                    sueldoBonificaciones = empleado.calcularSueldo() - sueldoBase - sueldoHorasExtras - sueldoSeguroMedico;
                }
                pw.println(empleado.getNombre() + "," +
                        empleado.getTipoEmpleado() + "," +
                        String.format("%.2f", sueldoBase) + "," +
                        (sueldoHorasExtras > 0 ? String.format("%.2f", sueldoHorasExtras) : "NO") + "," +
                        (sueldoSeguroMedico != 0 ? String.format("%.2f", sueldoSeguroMedico) : "NO") + "," +
                        (sueldoBonificaciones > 0 ? String.format("%.2f", sueldoBonificaciones) : "NO") + "," +
                        String.format("%.2f", empleado.calcularSueldo()));
            }}}
    
}