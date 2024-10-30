/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.encriptadores;

import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.classes.Encriptacion;


public class EncriptacionPorDesplazamiento implements Encriptacion<String> {
    private final int cambio;

    public EncriptacionPorDesplazamiento(int cambio) {
        this.cambio = cambio;
    }

    @Override
    public String encriptando(String message) {
        StringBuilder encriptado = new StringBuilder();
        for (char c : message.toCharArray()) {
            encriptado.append((char) (c + cambio));
        }
        return encriptado.toString();
    }
}
