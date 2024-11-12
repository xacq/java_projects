/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Alimento> items;

    public Factura() {
        items = new ArrayList<>();
    }

    public void agregarAlimento(Alimento alimento) {
        items.add(alimento);
    }

    public void mostrarFactura() {
        double total = 0;
        System.out.println("Factura:");
        for (Alimento item : items) {
            System.out.println(item.getDescripcion() + "    - $" + item.getPrecio());
            total += item.getPrecio();
        }
        System.out.println("Total: $    " + total);
    }
}

