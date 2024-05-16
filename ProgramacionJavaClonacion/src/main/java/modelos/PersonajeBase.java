package modelos;


public abstract class PersonajeBase implements Personaje, Cloneable {
    private String nombre;
    private String habilidad;
    private String equipo;
    private String imagen;

    public PersonajeBase(String nombre, String habilidad, String equipo, String imagen) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.equipo = equipo;
        this.imagen = imagen;
    }

    /**
     *
     * @return
     */
    @Override
    public PersonajeBase clonar() {
        try {
            return (PersonajeBase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el objeto", e);
        }
    }

    // Getters y Setters para atributos generales    

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getHabilidad() {
        return habilidad;
    }

    @Override
    public String getEquipo() {
        return equipo;
    }

    @Override
    public String getImagen() {
        return imagen;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
