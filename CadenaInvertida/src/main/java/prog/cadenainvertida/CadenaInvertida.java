
package prog.cadenainvertida;

import java.util.Arrays;
import java.util.Scanner;

public class CadenaInvertida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de palabras que contendra el vector: ");
        int cantidad;
        cantidad = sc.nextInt();
        String [] palabras = new String[cantidad];
        String [] palabrasinvertidas = new String[cantidad];
        int j=0;
        for (int i=0; i<cantidad; i++) {
            System.out.print("Ingrese la palabra número " + (i+1) + ": ");
            palabras[i] = sc.next();
        }
        System.out.println(Arrays.toString(palabras));
         for (int i = palabras.length-1; i >=0; i--) {
          palabrasinvertidas[i]=palabras[j];
          j++;
       }
       System.out.println(Arrays.toString(palabrasinvertidas));
    }
}
    
