/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class PizzaSencilla  implements Alimento {
    @Override
    public double getPrecio() {
        return 5.00;
    }

    @Override
    public String getDescripcion() {
        return "Pizza Sencilla";
    }
}