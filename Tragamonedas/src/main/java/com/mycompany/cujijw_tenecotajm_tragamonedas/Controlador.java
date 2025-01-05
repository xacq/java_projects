package com.mycompany.cujijw_tenecotajm_tragamonedas;

import javax.swing.JOptionPane;

public class Controlador {
    private VistaTragamonedas vista;
    private HiloColumna hilo1, hilo2, hilo3;

    public Controlador(VistaTragamonedas vista) {
        this.vista = vista;
        // Configurar botones individuales
        vista.getBtnIniciarColumna1().addActionListener(e -> iniciarColumna(1));
        vista.getBtnPararColumna1().addActionListener(e -> pararColumna(1));

        vista.getBtnIniciarColumna2().addActionListener(e -> iniciarColumna(2));
        vista.getBtnPararColumna2().addActionListener(e -> pararColumna(2));

        vista.getBtnIniciarColumna3().addActionListener(e -> iniciarColumna(3));
        vista.getBtnPararColumna3().addActionListener(e -> pararColumna(3));

        // Configurar botones generales
        vista.getBtnIniciarTodos().addActionListener(e -> iniciarTodos());
        vista.getBtnPararTodos().addActionListener(e -> pararTodos());
    }

    private void iniciarColumna(int columna) {
        int tiempo = 100;
        switch (columna) {
            case 1 -> {
                if (hilo1 != null && hilo1.isAlive()) return; // Evitar reinicio
                tiempo = obtenerTiempo(vista.getTiempoColumna1().getText());
                hilo1 = new HiloColumna(vista.getColumna1(), tiempo);
                hilo1.start();
            }
            case 2 -> {
                if (hilo2 != null && hilo2.isAlive()) return; // Evitar reinicio
                tiempo = obtenerTiempo(vista.getTiempoColumna2().getText());
                hilo2 = new HiloColumna(vista.getColumna2(), tiempo);
                hilo2.start();
            }
            case 3 -> {
                if (hilo3 != null && hilo3.isAlive()) return; // Evitar reinicio
                tiempo = obtenerTiempo(vista.getTiempoColumna3().getText());
                hilo3 = new HiloColumna(vista.getColumna3(), tiempo);
                hilo3.start();
            }
        }
    }

    private void pararColumna(int columna) {
        switch (columna) {
            case 1 -> { if (hilo1 != null) hilo1.detener(); }
            case 2 -> { if (hilo2 != null) hilo2.detener(); }
            case 3 -> { if (hilo3 != null) hilo3.detener(); }
        }
    }

    private void iniciarTodos() {
        iniciarColumna(1);
        iniciarColumna(2);
        iniciarColumna(3);
    }

    private void pararTodos() {
        pararColumna(1);
        pararColumna(2);
        pararColumna(3);
        verificarResultado(); 
    }

    private int obtenerTiempo(String textoTiempo) {
        try {
            return Integer.parseInt(textoTiempo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vista, "Por favor, ingrese un número válido en el tiempo.");
            return 100; 
        }
    }

    /*private void verificarResultado() {
        if (hilo1 != null && hilo2 != null && hilo3 != null) {
            String img1 = hilo1.getImagenActual();
            String img2 = hilo2.getImagenActual();
            String img3 = hilo3.getImagenActual();

            if (img1.equals(img2) && img2.equals(img3)) {
                JOptionPane.showMessageDialog(vista, "¡HA GANADO! Las imágenes son: " + img1);
            } else {
                JOptionPane.showMessageDialog(vista, "VUELVA A INTENTAR. Las imágenes fueron: " 
                        + img1 + ", " + img2 + ", " + img3);
            }
        }
    }*/
    private void verificarResultado() {
        if (hilo1 != null && hilo2 != null && hilo3 != null) {
            String img1 = hilo1.getImagenActual();
            String img2 = hilo2.getImagenActual();
            String img3 = hilo3.getImagenActual();

            if (img1.equals(img2) && img2.equals(img3)) {
                JOptionPane.showMessageDialog(vista, "¡HA GANADO! Las imágenes son iguales.");
            } else {
                JOptionPane.showMessageDialog(vista, "VUELVA A INTENTAR. Las imágenes no coinciden.");
            }
        }
    }

}
