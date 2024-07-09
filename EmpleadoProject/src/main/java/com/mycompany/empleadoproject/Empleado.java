/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleadoproject;

public class Empleado {
    private int nif;
    private double sueldoBase;
    private double pagoPorHoraExtra;
    private int horasExtraRealizadas;
    private double tipoIrpf;
    private boolean casado;
    private int numeroHijos;

    public Empleado(int nif) {
        this.nif = nif;
    }

    public Empleado(int nif, double sueldoBase, double pagoPorHoraExtra, int horasExtraRealizadas, double tipoIrpf, boolean casado, int numeroHijos) {
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
        this.horasExtraRealizadas = horasExtraRealizadas;
        this.tipoIrpf = tipoIrpf;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }

    public long getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public int getHorasExtraRealizadas() {
        return horasExtraRealizadas;
    }

    public void setHorasExtraRealizadas(int horasExtraRealizadas) {
        this.horasExtraRealizadas = horasExtraRealizadas;
    }

    public double getTipoIrpf() {
        return tipoIrpf;
    }

    public void setTipoIrpf(double tipoIrpf) {
        this.tipoIrpf = tipoIrpf;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public double calcularComplementoHorasExtra() {
        return horasExtraRealizadas * pagoPorHoraExtra;
    }

    public double calcularSueldoBruto() {
        return sueldoBase + calcularComplementoHorasExtra();
    }

    public double calcularRetencionesIrpf() {
        double tipoAplicado = tipoIrpf - (casado ? 2 : 0) - numeroHijos;
        return calcularSueldoBruto() * tipoAplicado / 100;
    }

    public void println() {
        System.out.println("NIF: " + nif);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Pago por hora extra: " + pagoPorHoraExtra);
        System.out.println("Horas extra realizadas: " + horasExtraRealizadas);
        System.out.println("Tipo de IRPF: " + tipoIrpf);
        System.out.println("Casado: " + casado);
        System.out.println("Número de hijos: " + numeroHijos);
    }

    public void printAll() {
        println();
        System.out.println("Complemento por horas extra: " + calcularComplementoHorasExtra());
        System.out.println("Sueldo bruto: " + calcularSueldoBruto());
        System.out.println("Retención IRPF: " + calcularRetencionesIrpf());
        System.out.println("Sueldo neto: " + (calcularSueldoBruto() - calcularRetencionesIrpf()));
    }

    public Empleado copia() {
        return new Empleado(nif, sueldoBase, pagoPorHoraExtra, horasExtraRealizadas, tipoIrpf, casado, numeroHijos);
    }
}
