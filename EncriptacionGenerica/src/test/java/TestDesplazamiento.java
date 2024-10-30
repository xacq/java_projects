/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.classes.EncriptadorGenerico;
import com.mycompany.Astudillo_S_Diaz_E_EncriptacionGenerica.encriptadores.EncriptacionPorDesplazamiento;

public class TestDesplazamiento {
        public static void main(String[] args) {
        String message = "HELLO";
        int movimiento = 3;

        EncriptacionPorDesplazamiento encriptacion = new EncriptacionPorDesplazamiento(movimiento);
        EncriptadorGenerico<String> encriptor = new EncriptadorGenerico<>(encriptacion);

        System.out.println("Encrypted message: " + encriptor.encrypt(message)); 
    }
}
