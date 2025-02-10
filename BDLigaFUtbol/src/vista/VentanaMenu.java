
package vista;

import javax.swing.SwingUtilities;


public class VentanaMenu extends javax.swing.JFrame 
{
    PanelJugador panelJugador=new PanelJugador();
    
    
    public VentanaMenu() 
    {
        initComponents();
    }

    public PanelJugador getPanelJugador() 
    {
        return panelJugador;
    }
   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnPanel = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnPanel1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio);

        jMenu1.setText("Modulos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnPanel.setText("Jugador");
        mnPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPanelActionPerformed(evt);
            }
        });
        jMenu1.add(mnPanel);
        jMenu1.add(jSeparator1);

        mnPanel1.setText("opciones");
        mnPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPanel1ActionPerformed(evt);
            }
        });
        jMenu1.add(mnPanel1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPanelActionPerformed
        getContentPane().remove(escritorio);
        getContentPane().add(panelJugador);
        
        actualizarPantalla();
        
    }//GEN-LAST:event_mnPanelActionPerformed

    private void mnPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPanel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnPanel1ActionPerformed

    public void actualizarPantalla()
    {
        SwingUtilities.updateComponentTreeUI(this);
    }             

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnPanel;
    private javax.swing.JMenuItem mnPanel1;
    // End of variables declaration//GEN-END:variables
}
