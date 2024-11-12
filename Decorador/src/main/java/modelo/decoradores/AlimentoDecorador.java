/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo.decoradores;

import modelo.Alimento;

public abstract class AlimentoDecorador implements Alimento {
    protected Alimento alimento;

    public AlimentoDecorador(Alimento alimento) {
        this.alimento = alimento;
    }

    @Override
    public double getPrecio() {
        return alimento.getPrecio(); // Esto ya funciona bien en cada decorador específico
    }

    @Override
    public String getDescripcion() {
        return alimento.getDescripcion(); // La descripción base se acumula en cada decorador específico
    }
    
    public Alimento getAlimento() {
        return alimento;
    }
}

