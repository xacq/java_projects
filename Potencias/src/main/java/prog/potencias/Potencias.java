
package prog.potencias;

import java.util.Scanner;

public class Potencias {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero=0;
        System.out.println("Introduce el numero limite para las potencias: ");
        numero = reader.nextInt();
        double cuadrado;
        double suma = 0;
        for (int i = 1; i <= numero; i++){
            cuadrado = Math.pow(i, i);
            suma += cuadrado;
            if (i!=numero) System.out.print(cuadrado + "+");
            else System.out.print(cuadrado + " = ");
        }
        System.out.println("La suma total es de " + suma);
    }
    
}
