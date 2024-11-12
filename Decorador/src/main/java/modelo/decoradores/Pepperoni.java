/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.decoradores;

import modelo.Alimento;

public class Pepperoni  extends AlimentoDecorador {
    public Pepperoni (Alimento alimento) {
        super(alimento);
    }

    @Override
    public double getPrecio() {
        return alimento.getPrecio() + 1.10;
    }

    @Override
    public String getDescripcion() {
        return alimento.getDescripcion() + "    + Pepperoni";
    }
}
