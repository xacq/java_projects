
package prog.florrosita;


public class Tarjetas {
        //ATRIBUTOS DE LA CLASE
    String sizeTarjeta;
    String tipoTarjeta;
    int cantidadHojas;
    double valorTarjetas;
    String descripcionTarjeta;
    
    //CONSTRUCTOR ATRIBUTOS
    Tarjetas(String sizeTarjeta,String tipoTarjeta,int cantidadHojas,double valorTarjetas,String descripcionTarjeta){
        this.sizeTarjeta=sizeTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.cantidadHojas = cantidadHojas;
        this.valorTarjetas = valorTarjetas;
        this.descripcionTarjeta = descripcionTarjeta;
    }
    //CONSTRUCTOR 
    Tarjetas(){
        this.sizeTarjeta="A5";
        this.tipoTarjeta="Aniversario";
        this.cantidadHojas=4;
        this.valorTarjetas=15.00;
        this.descripcionTarjeta="La tarjeta es de color negro con decoración de flores, globos y regalos de color dorado y plata con la oración Felis Aniversario...!";
    }

    public void mostrarTarjeta() {
        System.out.println("\nLa tarjeta de tamaño "+this.sizeTarjeta+" es para una ocación de "+this.tipoTarjeta +".  Posee  "+ this.cantidadHojas+ " hojas y tiene el valor de "+this.valorTarjetas+ "$.  \nPosee los siguientes elementos: \n"+this.descripcionTarjeta+".");
    }
}
