/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diaz_e_astudillo_s_examen;

// Clase concreta para empleados de tiempo parcial
public class EmpleadoTiempoParcial implements Empleado {
    private String nombre;
    private double horasTrabajadas;

    public EmpleadoTiempoParcial(String nombre, double horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return Math.min(horasTrabajadas, 10) * 1.00;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipoEmpleado() {
        return "Tiempo Parcial";
    }
    
    @Override
    public Empleado getEmpleado() {
        return this; // Devuelve la instancia actual del empleado
    }
}

