package com.mycompany.cujijw_tenecotajm_tragamonedas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HiloColumna extends Thread {
    private JLabel label;
    private ImageIcon[] imagenes = {
        new ImageIcon(getClass().getResource("/imagenes/imagen1.png")),
        new ImageIcon(getClass().getResource("/imagenes/imagen2.png")),
        new ImageIcon(getClass().getResource("/imagenes/imagen3.png")),
        new ImageIcon(getClass().getResource("/imagenes/imagen4.png"))
    };
    private int sleepTime;
    private boolean running = true;
    private int index = 0;

    public HiloColumna(JLabel label, int sleepTime) {
        this.label = label;
        this.sleepTime = sleepTime;
        label.setIcon(imagenes[0]); // Establece la primera imagen
    }

    public synchronized void detener() {
        running = false;
    }

    public synchronized void cambiarTiempo(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getImagenActual() {
        return imagenes[index].getDescription(); // Devuelve la descripción de la imagen
    }

    @Override
    public void run() {
        while (running) {
            try {
                label.setIcon(imagenes[index]);
                index = (index + 1) % imagenes.length;
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.err.println("Hilo interrumpido: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        label.setIcon(imagenes[index]); 
    }
}

/*import javax.swing.JLabel;

public class HiloColumna extends Thread {
    private JLabel label;
    private String[] imagenes = {"🍒", "🍋", "🍉", "⭐"}; 
    private int sleepTime;
    private boolean running = true;
    private int index = 0;

    public HiloColumna(JLabel label, int sleepTime) {
        this.label = label;
        this.sleepTime = sleepTime;
        label.setText(imagenes[0]); 
    }

    public synchronized void detener() {
        running = false;
    }

    public synchronized void cambiarTiempo(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getImagenActual() {
        return label.getText();
    }

    @Override
    public void run() {
        while (running) {
            try {
                label.setText(imagenes[index]);
                index = (index + 1) % imagenes.length;
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.err.println("Hilo interrumpido: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        label.setText(imagenes[index]); // Muestra la última imagen antes de detenerse.
    }
}
*/