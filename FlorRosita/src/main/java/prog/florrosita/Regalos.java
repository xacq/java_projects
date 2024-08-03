
package prog.florrosita;

public class Regalos {
    //ATRIBUTOS DE LA CLASE
    String tipoRegalo;
    String sexoRegalo;
    double valorRegalo;
    String descripcionRegalo;
    
    //CONSTRUCTOR ATRIBUTOS
    Regalos(String tipoRegalo,String sexoRegalo,double valorRegalo,String descripcionRegalo){
        this.tipoRegalo = tipoRegalo;
        this.sexoRegalo = sexoRegalo;
        this.valorRegalo = valorRegalo;
        this.descripcionRegalo = descripcionRegalo;
    }
    //CONSTRUCTOR 
    Regalos(){
        this.tipoRegalo="Carro a control remoto";
        this.sexoRegalo="varon";
        this.valorRegalo=25.00;
        this.descripcionRegalo="EL juguete tiene el carro, control remoto, pilas, muñequitos de accion.  Es un carro de guerra color militar verde";
    }

    public void mostrarRegalo() {
        System.out.println("\nEl regalo consiste en  un "+this.tipoRegalo +".  Es para un(a) "+ this.sexoRegalo+ " y tiene el valor de "+this.valorRegalo+ "$.  \nSu descripción es la siguiente: \n"+this.descripcionRegalo+".");
    }
}
