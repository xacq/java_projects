/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diaz_e_astudillo_s_examen;

// Decorador para seguro médico
class SeguroMedico implements Decorador {
    private Empleado empleado;

    public SeguroMedico(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public double calcularSueldo() {
        return empleado.calcularSueldo() - 30;
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

