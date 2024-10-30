/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.classes;

public class EncriptadorGenerico<T> {
    private final Encriptacion<T> encryptionAlgorithm;

    public EncriptadorGenerico(Encriptacion<T> algoritmoEncriptacion) {
        this.encryptionAlgorithm = algoritmoEncriptacion;
    }

    public T encrypt(T data) {
        return encryptionAlgorithm.encriptando(data);
    }
}
