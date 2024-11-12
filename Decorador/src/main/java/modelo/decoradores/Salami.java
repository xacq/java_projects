/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.decoradores;

import modelo.Alimento;

public class Salami  extends AlimentoDecorador {
    public Salami (Alimento alimento) {
        super(alimento);
    }

    @Override
    public double getPrecio() {
        return alimento.getPrecio() + 0.50;
    }

    @Override
    public String getDescripcion() {
        return alimento.getDescripcion() + "    + Salami";
    }
}
