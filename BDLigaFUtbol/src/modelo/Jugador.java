
package modelo;


public class Jugador 
{
    int codJugador;
    String nombre;
    String apellido;

    public Jugador(int codJugador, String nombre, String apellido) 
    {
        this.codJugador = codJugador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCodJugador()
    {
        return codJugador;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }
}
