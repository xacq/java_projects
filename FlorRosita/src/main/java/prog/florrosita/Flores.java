
package prog.florrosita;


public class Flores {
    //ATRIBUTOS DE LA CLASE
    String arregloFloral;
    String tipoFlores;
    int cantidadFlores;
    double valorArreglo;
    String arregloDescripcion;
    
    //CONSTRUCTOR ATRIBUTOS
    Flores(String arregloFloral,String tipoFlores,int cantidadFlores,double valorArreglo,String arregloDescripcion){
        this.arregloFloral=arregloFloral;
        this.tipoFlores = tipoFlores;
        this.cantidadFlores = cantidadFlores;
        this.valorArreglo = valorArreglo;
        this.arregloDescripcion = arregloDescripcion;
    }
    //CONSTRUCTOR 
    Flores(){
        this.arregloFloral="Sweet";
        this.tipoFlores="Rosas";
        this.cantidadFlores=3;
        this.valorArreglo=18.99;
        this.arregloDescripcion="Las rosas rojas con 2 hojas de palmeras y ramas con flores blancas pequeñas envueltas en papel";
    }
    
    
    public void mostrarFlores() {
        System.out.println("\nEl arreglo Floral "+this.arregloFloral+" posee "+this.cantidadFlores+" "+ this.tipoFlores + " y tiene el valor de "+this.valorArreglo+ "$.  \nPara hacerlo necesitamos los siguiente: \n"+this.arregloDescripcion+".");
    }
}
