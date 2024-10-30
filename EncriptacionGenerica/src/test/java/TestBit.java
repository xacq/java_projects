/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.classes.EncriptadorGenerico;
import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.encriptadores.EncriptacionBit;

public class TestBit {
    public static void main(String[] args) {
        String mensaje = "HELLO";
        String llave = "KEY";

        EncriptacionBit encriptacion = new EncriptacionBit(llave);
        EncriptadorGenerico<String> encriptador = new EncriptadorGenerico<>(encriptacion);

        System.out.println("Encrypted message: " + encriptador.encrypt(mensaje)); 
    }
}