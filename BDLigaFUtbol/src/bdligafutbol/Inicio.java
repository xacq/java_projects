
package bdligafutbol;

import controlador.JugadorControlador;
import vista.VentanaMenu;


public class Inicio {

    
    public static void main(String[] args) {
        VentanaMenu vista=new VentanaMenu();
        new JugadorControlador(vista);
        vista.setVisible(true);
    }
    
}
