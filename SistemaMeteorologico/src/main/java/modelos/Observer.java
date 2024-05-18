package modelos;

/**
 * La interfaz Observer define un método que debe ser implementado por cualquier
 * clase que desee ser notificada de los cambios en la temperatura.
 * Esta es una parte del patrón de diseño Observer, donde el Observer se registra
 * con un Observable (o Sujeto) para recibir actualizaciones.
 * Este patrón se utiliza comúnmente en situaciones donde un objeto (Observable)
 * necesita notificar a otros objetos (Observers) sobre cambios en su estado.
 */
public interface Observer {
    void update(float temperature);
}
