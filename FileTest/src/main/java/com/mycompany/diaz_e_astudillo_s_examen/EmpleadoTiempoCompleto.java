/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diaz_e_astudillo_s_examen;

// Clase concreta para empleados de tiempo completo
public class EmpleadoTiempoCompleto implements Empleado {
    private String nombre;
    private double horasTrabajadas;

    public EmpleadoTiempoCompleto(String nombre, double horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * 1.50;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipoEmpleado() {
        return "Tiempo Completo";
    }
    
    @Override
    public Empleado getEmpleado() {
        return this; // Devuelve la instancia actual del empleado
    }
}

