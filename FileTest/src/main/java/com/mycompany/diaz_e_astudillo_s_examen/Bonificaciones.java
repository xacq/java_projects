/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diaz_e_astudillo_s_examen;


// Decorador para bonificaciones
class Bonificaciones implements Decorador {
    private Empleado empleado;
    private int bonificaciones;

    public Bonificaciones(Empleado empleado, int bonificaciones) {
        this.empleado = empleado;
        this.bonificaciones = bonificaciones;
    }

    @Override
    public double calcularSueldo() {
        double sueldoBase = empleado.calcularSueldo();
        if (empleado instanceof EmpleadoTiempoParcial) {
            return sueldoBase + (bonificaciones / 2) * 1;
        } else if (empleado instanceof EmpleadoTiempoCompleto) {
            return sueldoBase + (bonificaciones / 3) * 1 + (bonificaciones % 3) * 0.40;
        }
        return sueldoBase;
    }

    @Override
    public String getNombre() {
        return empleado.getNombre();
    }

    @Override
    public String getTipoEmpleado() {
        return empleado.getTipoEmpleado();
    }

    @Override
    public Empleado getEmpleado() {
        return empleado;
    }
}