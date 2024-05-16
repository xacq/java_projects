package modelos;


public class Mago extends PersonajeBase{
    private int encanto;

    public Mago(String nombre, String habilidad, String equipo, String imagen, int encanto) {
        super(nombre, habilidad, equipo, imagen);
        this.encanto = encanto;
    }

    // Getter y Setter para encanto    

    public int getEncanto() {
        return encanto;
    }

    public void setEncanto(int encanto) {
        this.encanto = encanto;
    }
   
    /**
     *
     * @return
     */
    @Override
    public PersonajeBase clonar() {
        Mago clon = (Mago) super.clonar();
        clon.encanto = this.encanto; // Copiar atributo específico
        clon.setNombre(this.getNombre()); // Establecer el nombre del clon
        RegistroClonados.agregarMagoClonado(clon.getNombre(), clon);
        return clon;
    }
}
