/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentaproject;

public class Cuenta {
    private static long proximoNumeroCuenta = 202400001;
    private long numeroCuenta;
    private String dniCliente;
    private double saldoActual;
    private double interesAnual;

    // Constructor por defecto
    public Cuenta() {
        this.numeroCuenta = proximoNumeroCuenta++;
        this.dniCliente = "0123456789";
        this.saldoActual = 0.0;
        this.interesAnual = 0.001;
    }

    // Constructor con parámetros
    public Cuenta(String dniCliente, double saldoActual, double interesAnual) {
        this.numeroCuenta = proximoNumeroCuenta++;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        saldoActual += cantidad;
        System.out.println("Se ingresaron $" + cantidad + " .");
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
            System.out.println("Se retiraron $" + cantidad + " .");
        } else {
            System.out.println("No hay saldo suficiente" + cantidad + ".");
        }
    }

    // Método para actualizar el saldo aplicando el interés diario
    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365.0;
        double interes = saldoActual * (interesDiario / 100);
        saldoActual += interes;
        System.out.println("El saldo se ha actualizado + interés diario.");
    }

    // Método para mostrar los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("\n--- Información ---");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: $" + saldoActual);
        System.out.println("Interés anual (%): " + interesAnual);
    }

    // Getters y setters necesarios
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
}
