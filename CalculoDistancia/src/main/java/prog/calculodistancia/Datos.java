
package prog.calculodistancia;

public class Datos {
    //ATRIBUTOS DEL PROBLEMA
    private double velocidad_A;
    private double velocidad_B;
    private double distancia_total;
    //CONSTRUCTOR
    Datos(){
        //SE INICIA EL CONSTRUCTOR CON VALORES POR 
        this.velocidad_A = 90;
        this.velocidad_B = 70;
        this.distancia_total = 50;
    }
    //FUNCION QUE MUESTRA LOS DATOS DEL PROBLEMA
    public void mostrarDatos(){
        System.out.println (
                "\nDATOS DEL PROBLEMA PLANTEADO:"
                +"\nVelocidad carro A= "+ this.velocidad_A + "km/hr."
                +"\nVelocidad carro B= "+ this.velocidad_B + "km/hr."
                +"\nDistancia Total entre ambos carros= "+ this.distancia_total +"Km."
                +"\nTiempo en el que tienen que encontrarse...?"
        );
    }

    public double getVelocidad_A() {
        return velocidad_A;
    }

    public void setVelocidad_A(double velocidad_A) {
        this.velocidad_A = velocidad_A;
    }

    public double getVelocidad_B() {
        return velocidad_B;
    }

    public void setVelocidad_B(double velocidad_B) {
        this.velocidad_B = velocidad_B;
    }

    public double getDistancia_total() {
        return distancia_total;
    }

    public void setDistancia_total(double distancia_total) {
        this.distancia_total = distancia_total;
    }
    
}
