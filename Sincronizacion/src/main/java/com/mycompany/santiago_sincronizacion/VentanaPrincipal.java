
package com.mycompany.santiago_sincronizacion;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class VentanaPrincipal extends javax.swing.JFrame {

    private static int contadorVisitantes = 1; // Contador para identificar visitantes
    private static final Queue<Visitante> colaVisitantes = new LinkedList<>(); // Cola de visitantes creados
    private static final Queue<String> visitantesProcesados = new LinkedList<>(); // Registro de visitantes procesados

    Biblioteca biblioteca = new Biblioteca();
    
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearVisitante = new javax.swing.JButton();
        btnPasarVisitante = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSacarVisitante = new javax.swing.JButton();
        txtVisitante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Acceso a Biblioteca");

        btnCrearVisitante.setBackground(new java.awt.Color(51, 153, 0));
        btnCrearVisitante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearVisitante.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearVisitante.setText("CREAR VISITANTE");
        btnCrearVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVisitanteActionPerformed(evt);
            }
        });

        btnPasarVisitante.setBackground(new java.awt.Color(0, 102, 204));
        btnPasarVisitante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPasarVisitante.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarVisitante.setText("PASAR VISITANTE");
        btnPasarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarVisitanteActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mesa 1: [Vacío]");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mesa 2: [Vacío]");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mesa 3: [Vacío]");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIBLIOTECA");

        btnSacarVisitante.setBackground(new java.awt.Color(204, 51, 0));
        btnSacarVisitante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSacarVisitante.setForeground(new java.awt.Color(255, 255, 255));
        btnSacarVisitante.setText("SACAR VISITANTE");
        btnSacarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarVisitanteActionPerformed(evt);
            }
        });

        txtVisitante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(btnCrearVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtVisitante)
                            .addComponent(btnSacarVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPasarVisitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPasarVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSacarVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVisitanteActionPerformed
        String nombreVisitante = "V" + contadorVisitantes++;
        Visitante visitante = new Visitante(nombreVisitante);
        colaVisitantes.add(visitante); // Agregar a la cola de visitantes
        JOptionPane.showMessageDialog(null,"Visitante creado: " + nombreVisitante);
        txtLog.append("Visitante creado: " + nombreVisitante + "\n");
    }//GEN-LAST:event_btnCrearVisitanteActionPerformed

    private void btnPasarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarVisitanteActionPerformed
        if (colaVisitantes.isEmpty()) { // Verificar si hay visitantes en la cola
            JOptionPane.showMessageDialog(null, "No hay más visitantes en la cola para pasar.");
            return;
        }

        Visitante visitante = colaVisitantes.poll(); // Tomar el primer visitante de la cola
        String nombreVisitante = visitante.getNombre();

        new Thread(() -> {
            try {
                biblioteca.entrar(nombreVisitante);

                SwingUtilities.invokeLater(() -> {
                    if (jLabel2.getText().contains("[Vacío]")) {
                        jLabel2.setText("Mesa 1: " + nombreVisitante);
                    } else if (jLabel3.getText().contains("[Vacío]")) {
                        jLabel3.setText("Mesa 2: " + nombreVisitante);
                    } else if (jLabel4.getText().contains("[Vacío]")) {
                        jLabel4.setText("Mesa 3: " + nombreVisitante);
                    }
                });

            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error al pasar visitante: " + nombreVisitante);
            }
        }).start();
    }//GEN-LAST:event_btnPasarVisitanteActionPerformed

    private void btnSacarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarVisitanteActionPerformed
            String nombreVisitante = txtVisitante.getText();
            if (nombreVisitante.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Por favor, ingresa el nombre del visitante a sacar.");
                return;
            }
            // Sacar el visitante en un nuevo hilo
            new Thread(() -> {
                biblioteca.salir(nombreVisitante);
                SwingUtilities.invokeLater(() -> {
                    // Liberar la mesa del visitante que sale
                    if (jLabel2.getText().contains(nombreVisitante)) {
                        jLabel2.setText("Mesa 1: [Vacío]");
                    } else if (jLabel3.getText().contains(nombreVisitante)) {
                        jLabel3.setText("Mesa 2: [Vacío]");
                    } else if (jLabel4.getText().contains(nombreVisitante)) {
                        jLabel4.setText("Mesa 3: [Vacío]");
                    }
                });
            }).start();
    }//GEN-LAST:event_btnSacarVisitanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearVisitante;
    private javax.swing.JButton btnPasarVisitante;
    private javax.swing.JButton btnSacarVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtVisitante;
    // End of variables declaration//GEN-END:variables
}
