/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

public class Cafe implements Alimento {
    @Override
    public double getPrecio() {
        return 2.20;
    }

    @Override
    public String getDescripcion() {
        return "Café";
    }
}


