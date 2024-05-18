package modelos;
/**
 * La interfaz Subject define los métodos que deben ser implementados por cualquier clase que quiera permitir a otros objetos registrarse, eliminarse y ser notificados
 * de cambios en su estado. Esta es una parte del patrón de diseño Observer, donde el Subject (o Observable)
 * gestiona una lista de Observers y los notifica cuando hay cambios.  Este patrón se utiliza comúnmente en situaciones donde un objeto necesita
 * informar a una lista de dependientes sobre cualquier cambio de estado.  */
public interface Subject {
    /**
     * Registra un nuevo Observer para recibir actualizaciones del Subject. Las clases que implementen esta interfaz mantendrán una lista de Observers
     * registrados y llamarán a este método para añadir nuevos Observers. @param o el Observer que se quiere registrar.
     * @param o  */
    void registerObserver(Observer o);
    /**
     * Elimina un Observer existente de la lista de observadores registrados.  Las clases que implementen esta interfaz llamarán a este método para
     * eliminar un Observer que ya no desea recibir actualizaciones.  
     * @param o el Observer que se quiere eliminar. */
    void removeObserver(Observer o);
    /**
     * Notifica a todos los Observers registrados sobre un cambio en el estado del Subject.  Las clases que implementen esta interfaz llamarán a este método para iterar
     * sobre la lista de Observers y llamar a su método `update`. */
    void notifyObservers();
}
