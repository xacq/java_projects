
package prog.notavector;

import java.util.Arrays;
import java.util.Scanner;

public class NotaVector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de notas a ingresar: ");
        int cantidad;
        cantidad = sc.nextInt();
        double [] notas = new double[cantidad];
        double suma=0;
        double promedio = 0;
        double max;
        double min;
        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese la nota (entre 0 y 10):");
            notas[i] = sc.nextDouble();
            if (notas[i] > 10 || notas[i] < 0 ) {
                System.out.println("Error en la nota ingresada");
                i--;
            }
            else suma += notas[i];
        }
        promedio = suma / cantidad;
        max = notas[0];
        for (double j : notas) {
            if (j > max)
                max = j;
        }
        min = notas[0];
        for (double k : notas) {
            if (k > min)
                min = k;
        } 
        System.out.println("Lista de notas= "+Arrays.toString(notas));
        System.out.println("Promedio= " + promedio);
        System.out.println("Nota Maxima= " + max);
        System.out.println("Nota Minima= " + min);
    }
    
}
