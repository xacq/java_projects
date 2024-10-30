/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.encriptadores;

import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.classes.Encriptacion;
import java.util.ArrayList;
import java.util.List;

public class EncriptacionBit implements Encriptacion<String> {
    private String llave;

    public EncriptacionBit(String llave) {
        this.llave = llave;
    }

    @Override
    public String encriptando(String message) {
        List<Integer> encriptado = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            encriptado.add(message.charAt(i) ^ llave.charAt(i % llave.length()));
        }
        return encriptado.toString();
    }
}
