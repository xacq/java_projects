
package prog.fibonachi;

import java.util.Scanner;

public class Fibonachi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        System.out.println("Introduce numero maximo para la serie: ");
        numero = sc.nextInt();
        System.out.println("Los " + numero + " primeros términos de la serie son:");                 
        fibo1=1;
        fibo2=1;
        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
    
