
package prog.florrosita;

public class mainItemsRosita {

    public static void main(String[] args) {
        //INSTANCIA DE ARREGLOS FLORALES CON LA CLASE FLORES
        Flores Floreria =  new Flores();
        Floreria.mostrarFlores();
        
        Flores FloreriaLee = new Flores(
                "Lee",
                "Rosas Tomates",
                5 ,
                22.90 ,
                "Las rosas cortadas en diferentes tamaños en el tallo para generar una cascada en el adorno"
                        + " y acompañadas de ramas de color amarillo y verde.  Se necesitara un oasis dentro "
                        + "de una maseta plastica de color gris"                
                
        );
        FloreriaLee.mostrarFlores();
        
        //INSTANCIA DE TARJETAS CON LA CLASE TARJETAS
        Tarjetas Tarjeteria = new Tarjetas();
        Tarjeteria.mostrarTarjeta();
        
        Tarjetas tarjetaAniversario = new Tarjetas(
                "A4",
                "Despedida",
                2,
                14.50 ,
                "La tarjeta es de color celeste con un avion en el centro y la palabra Que tengas un buen viaje."
                        + "\nDentro posee la expreción Espero que todo te vaya muy bien... Te extrañaremos...!"
        );
        tarjetaAniversario.mostrarTarjeta();
        
        //INSTANCIA DE REGALOS
        Regalos Juguetes =  new Regalos();
        Juguetes.mostrarRegalo();
        
        Regalos Munecos = new Regalos(
                "Muneco de Dragon Ball Z - Goku San",
                "varon",
                15.75,
                "El muneco es de tamano regular (15cm) y posee ropa de plastico para intercambiar, tambien "
                        + "\nposee un bastón y un turbante de color blanco");
        Munecos.mostrarRegalo();        
    }
    
}
