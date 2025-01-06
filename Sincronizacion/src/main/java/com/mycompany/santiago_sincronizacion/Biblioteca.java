package com.mycompany.santiago_sincronizacion;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Biblioteca {
    private final int capacidadMaxima = 3; // Capacidad máxima de la biblioteca
    private final Queue<String> visitantes = new LinkedList<>(); // Lista de visitantes dentro de la biblioteca

    // Método sincronizado para permitir la entrada
    public synchronized void entrar(String visitante) throws InterruptedException {
        while (visitantes.size() >= capacidadMaxima) { 
            JOptionPane.showMessageDialog(null, "Biblioteca llena. " + visitante + " espera.");
            wait(); // El hilo se detiene hasta ser notificado
        }
        visitantes.add(visitante); 
        JOptionPane.showMessageDialog(null, visitante + " entra a la biblioteca. Visitantes actuales: " + visitantes);
        notifyAll(); // Notificar que un hilo puede entrar
    }

    // Método sincronizado para permitir la salida
    public synchronized void salir(String visitante) {
        if (visitantes.remove(visitante)) {
            JOptionPane.showMessageDialog(null, visitante + " sale de la biblioteca. Visitantes actuales: " + visitantes);
            notifyAll(); // Notificar que hay espacio disponible
        } else {
            JOptionPane.showMessageDialog(null, visitante + " no está en la biblioteca.");
        }
    }

    // Método para obtener los visitantes actuales
    public synchronized String getVisitantesActuales() {
        return visitantes.toString();
    }
}


