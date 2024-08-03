
package prog.calculodistancia;

import java.util.Scanner;

public class CalculoAB {

    public static void main(String[] args) {
        System.out.println("SISTEMA QUE CALCULA EL PUNTO DE ENCUENTRO ENTRE DOS CARROS QUE SALEN DE DOS CIUDADES");
        System.out.println("LLAMADAS PUNTOS A Y B A UNA DISTANCIA ESPECIFICA CADA UNO Y CON UNA DISTANCIA QUE");
        System.out.println("SEPARA A CADA CIUDAD.  EL PROGRAMA CALCULARA EL TIEMPO DE ENCUENTRO Y LA DISTANCIA");
        System.out.println("EN LA QUE SE ENCUENTRAN DESDE CADA PUNTO DE PARTIDA.");
        System.out.println("POR FAVOR INGRESE LOS VALORES PARA EL CALCULO ESPECIFICADO.");
        
        double vel_A, vel_B, distancia, puntoEncuentro_A, puntoEncuentro_B, tiempoEncuentro;
        Datos calculo = new Datos();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la velocidad del carro A= ");
        vel_A = leer.nextDouble();
        calculo.setVelocidad_A(vel_A);
        
        System.out.println("Ingrese el valor de la velocidad del carro B= ");
        vel_B = leer.nextDouble();
        calculo.setVelocidad_B(vel_B);
        
        System.out.println("Ingrese la distancia existente entre las dos ciudades= ");
        distancia = leer.nextDouble();
        calculo.setDistancia_total(distancia);
        
        calculo.mostrarDatos();
        tiempoEncuentro = calcularPuntoEncuentro(calculo);
        System.out.println("Los carros se encuentran a los "+ tiempoEncuentro + "horas.");
        puntoEncuentro_A = tiempoEncuentro * calculo.getVelocidad_A();
        puntoEncuentro_B = tiempoEncuentro * calculo.getVelocidad_B();
        System.out.println(puntoEncuentro_A + "Km. desde el punto A.");
        System.out.println(puntoEncuentro_B + "Km. desde el punto B.");
    }
    
    static double calcularPuntoEncuentro(Datos obj){
        return obj.getDistancia_total() /(obj.getVelocidad_A()+obj.getVelocidad_B());
    }
}
