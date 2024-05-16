package modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroClonados {
    private static final Map<String, List<Guerrero>> guerrerosClonados = new HashMap<>();
    private static final Map<String, List<Mago>> magosClonados = new HashMap<>();

    public static void agregarGuerreroClonado(String nombre, Guerrero clon) {
        guerrerosClonados.computeIfAbsent(nombre, k -> new ArrayList<>()).add(clon);
    }
    
    public static List<Guerrero> obtenerGuerrerosClonados() {
        List<Guerrero> todosGuerreros = new ArrayList<>();
        for (List<Guerrero> guerreros : guerrerosClonados.values()) {
            todosGuerreros.addAll(guerreros);
        }
        return todosGuerreros;
    }

    public static void agregarMagoClonado(String nombre, Mago clon) {
        magosClonados.computeIfAbsent(nombre, k -> new ArrayList<>()).add(clon);
    }

    public static List<Mago> obtenerMagosClonados() {
        List<Mago> todosMagos = new ArrayList<>();
        for (List<Mago> magos : magosClonados.values()) {
            todosMagos.addAll(magos);
        }
        return todosMagos;
    }
    
    public static void eliminarGuerreroClonado(int posicion) {
        List<Guerrero> todosGuerreros = obtenerGuerrerosClonados();
        if (posicion >= 0 && posicion < todosGuerreros.size()) {
            Guerrero guerreroAEliminar = todosGuerreros.get(posicion);
            
            // Encontrar la lista específica que contiene al guerrero
            for (List<Guerrero> guerreros : guerrerosClonados.values()) {
                if (guerreros.contains(guerreroAEliminar)) {
                    guerreros.remove(guerreroAEliminar);
                    break; // Salir del bucle después de eliminar
                }
            }
        }
    }

    public static void eliminarMagoClonado(int posicion) {
        List<Mago> todosMagos = obtenerMagosClonados();
        if (posicion >= 0 && posicion < todosMagos.size()) {
            Mago magoAEliminar = todosMagos.get(posicion);
            
            // Encontrar la lista específica que contiene al mago
            for (List<Mago> magos : magosClonados.values()) {
                if (magos.contains(magoAEliminar)) {
                    magos.remove(magoAEliminar);
                    break; // Salir del bucle después de eliminar
                }
            }
        }
    }
}
