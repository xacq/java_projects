
package prog.narcisista;

import java.util.Scanner;

public class Narcisista {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero=0;
        System.out.println("Introduce un numero para averiguar si en Narcisista o no: ");
        numero = reader.nextInt();
        if (esNarcisista(numero)){
            System.out.println(numero + " es narcisista.");
        }
        else{
            System.out.println(numero + " no es narcisista.");
        }
    }
    
    private static boolean esNarcisista(int numero){
        String numeroComoCadena = Integer.toString(numero);
        int longitudDeNumero = numeroComoCadena.length();
        double suma = 0;
        for(int indice = 0; indice < longitudDeNumero; indice++){
            int cifra = Character.getNumericValue(numeroComoCadena.charAt(indice));
            double elevado = Math.pow(cifra, longitudDeNumero);
            suma = suma + elevado;
        }
        return suma == numero;
    }
}
