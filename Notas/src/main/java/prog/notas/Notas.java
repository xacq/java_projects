
package prog.notas;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cantidad = 0;
        int numero;
        int pares = 0;
        int impares = 0;
        int suma = 0;
        System.out.println("A continuacion ingrese numeros.");
        do{
            System.out.println("Ingrese un numero: ");
            numero = reader.nextInt();
            if (numero!=0){
                cantidad ++;
                suma += numero;
                if (esPar(numero)) pares ++;
                else impares ++;
            }
        }while (numero != 0);
        
        System.out.println("Ingreso " + cantidad + " números en total.");
        System.out.println("De esta cantidad " +pares+ " son pares");
        System.out.println("De esta cantidad " +impares+ " son impares");
        System.out.println("La suma total es de = " + suma);
        
    }
    
    public static boolean esPar(int x) {
            return (x % 2) == 0;
    }
}
