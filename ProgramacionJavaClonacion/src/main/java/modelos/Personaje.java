package modelos;

public interface Personaje extends Cloneable{
    Personaje clonar();
    String getNombre();
    void setNombre(String nombre);
    String getHabilidad();
    String getEquipo();
    String getImagen();
    void setImagen(String imagen);
}
