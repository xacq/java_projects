package modelos;

public class Guerrero extends PersonajeBase {
    private int fuerza;

    public Guerrero(String nombre, String habilidad, String equipo, 
String imagen, int fuerza) {
        super(nombre, habilidad, equipo, imagen);
        this.fuerza = fuerza;
    }

    @Override
    public PersonajeBase clonar() {
        Guerrero clon = (Guerrero) super.clonar();
        clon.fuerza = this.fuerza; // Copiar atributo específico
        clon.setNombre(this.getNombre()); // Establecer el nombre del clon
        RegistroClonados.agregarGuerreroClonado(clon.getNombre(), clon);
        return clon;
    }

    // Métodos específicos de Guerrero
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}