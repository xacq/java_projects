package com.javaexamples;
import java.util.Scanner;

public class Cedula {
    public static void main(String[] args) {
        boolean cedulaCorrecta = false;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula:");
        String cedula = Teclado.next();
        if (cedula.length() == 10){ /*Verifica el largo del numero*/
            /*Convierte caracter en numero*/
            // cpnvertir una posicion de un acadena en un entero
            int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
            if (tercerDigito < 6) {
                int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                int verificador = Integer.parseInt(cedula.substring(9,10));
                int suma = 0;
                int digito = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                    //multiplicando segun posicion del contador i, tanto la cadena
                    //de la cedula como la cadena de factores [2,1,2,1,2,1,2,1]
                    digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                    int residuo1 = digito%10;
                    int residuo2 = digito/10;
                    suma += (residuo1+residuo2);
                }
                if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                    cedulaCorrecta = true;
                   }
                else if ((10 - (suma % 10)) == verificador) {
                    cedulaCorrecta = true;
                   } 
                else {
                    cedulaCorrecta = false;
                   }
            }
            else {
                cedulaCorrecta = false;
                }
        } 
        else {
            cedulaCorrecta = false;
            }
        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta.");
            }
        else{
            System.out.println("La Cédula es Correcta.");
        }
    }    
}