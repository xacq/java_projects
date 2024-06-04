/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diaz_e_astudillo_s_examen;

// Decorador para horas extras
class HorasExtras implements Decorador {
    private Empleado empleado;

    public HorasExtras(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public double calcularSueldo() {
        double sueldoBase = empleado.calcularSueldo();
        if (empleado instanceof EmpleadoTiempoParcial) {
            double horasExtras = Math.max(empleado.calcularSueldo() - 10, 0);
            return sueldoBase + horasExtras * 0.50;
        } else if (empleado instanceof EmpleadoTiempoCompleto) {
            return sueldoBase + (empleado.calcularSueldo() - 10) * 0.75;
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