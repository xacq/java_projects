
package visual;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import modelos.Guerrero;
import modelos.Mago;
import modelos.RegistroClonados;

public class Clonados extends javax.swing.JFrame {

    private String tipoSeleccionado;
    private int filaSeleccionada = -1;
    
    public Clonados() {
        initComponents();
        // Add ListSelectionListener to jTable1
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel selectionModel = jTable1.getSelectionModel();
        selectionModel.addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) { // Only handle final selection
                filaSeleccionada = jTable1.getSelectedRow();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pantalla para Clonados");
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personajes", "Guerrero", "Mago" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Habilidad", "Equipo", "Fuerza/Encanto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\DiazE_AstudilloS_Prototype\\src\\main\\java\\Images\\portada.jpg")); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (selectedIndex >= 1) {
            Object selectedValue = jComboBox1.getItemAt(selectedIndex);
            model.setRowCount(0); // Limpiar la tabla antes de agregar datos
            if ("Guerrero".equals(selectedValue.toString())){
                List<Guerrero> guerrerosClonados = RegistroClonados.obtenerGuerrerosClonados();
                for (Guerrero guerrero : guerrerosClonados) {
                    Object[] rowData = { 
                        guerrero.getNombre(), 
                        guerrero.getHabilidad(),
                        guerrero.getEquipo(), 
                        guerrero.getFuerza() 
                    };
                model.addRow(rowData);
            }
                }
            else if ("Mago".equals(selectedValue.toString())){
                List<Mago> magos = RegistroClonados.obtenerMagosClonados();
                for (Mago mago : magos) {
                    Object[] rowData = { 
                        mago.getNombre(), 
                        mago.getHabilidad(),
                        mago.getEquipo(),
                        mago.getEncanto() 
                    };
                    model.addRow(rowData);
            }
                }
            }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar uno de los personajes...!", "Error de seleccion.", JOptionPane.WARNING_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex >= 1) {
            Object selectedValue = jComboBox1.getItemAt(selectedIndex);
            if (null == selectedValue.toString()){
                JOptionPane.showMessageDialog(null, "Debe seleccionar uno de los personajes...!", "Error de seleccion.", JOptionPane.WARNING_MESSAGE);
            }        // TODO add your handling code here:

            else switch (selectedValue.toString()) {
                case "Guerrero" -> {
                    if (filaSeleccionada != -1) {
                        String nombre = (String) jTable1.getValueAt(filaSeleccionada, 0);
                        ModificarGuerrero modificar = new ModificarGuerrero(nombre);
                        modificar.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe seleccionar uno de los personajes en la tabla...!", "Error de seleccion.", JOptionPane.WARNING_MESSAGE);
                        
                    }
                }
                case "Mago" -> {
                    if (filaSeleccionada != -1) {
                        String nombre = (String) jTable1.getValueAt(filaSeleccionada, 0);
                        ModificarMago modificar = new ModificarMago(nombre);
                        modificar.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe seleccionar uno de los personajes en la tabla...!", "Error de seleccion.", JOptionPane.WARNING_MESSAGE);
                        
                    }
                }
                default -> JOptionPane.showMessageDialog(null, "Debe seleccionar uno de los personajes...!", "Error de seleccion.", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex >= 1) {
            Object selectedValue = jComboBox1.getItemAt(selectedIndex);
            if (filaSeleccionada != -1) { 
                String nombre = (String) jTable1.getValueAt(filaSeleccionada, 0);
                if ("Guerrero".equals(selectedValue.toString())) {
                    eliminarGuerrero(nombre);
                } else if ("Mago".equals(selectedValue.toString())) {
                    eliminarMago(nombre);
                } 
                // Eliminar la fila de la tabla
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.removeRow(filaSeleccionada);
                filaSeleccionada = -1; // Reset selected row
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un personaje de la tabla para eliminarlo.", 
                                          "Error de selección", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de personaje.", 
                                      "Error de selección", JOptionPane.WARNING_MESSAGE);
        } 
    }

    private void eliminarGuerrero(String nombre) {
        List<Guerrero> guerreros = RegistroClonados.obtenerGuerrerosClonados();
        for (int i = 0; i < guerreros.size(); i++) {
            if (guerreros.get(i).getNombre().equals(nombre)) {
                guerreros.remove(i); 
                RegistroClonados.eliminarGuerreroClonado(i);
                JOptionPane.showMessageDialog(this, "Guerrero eliminado correctamente", 
                          "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
    
    private void eliminarMago(String nombre) {
        List<Mago> magos = RegistroClonados.obtenerMagosClonados();
        for (int i = 0; i < magos.size(); i++) {
            if (magos.get(i).getNombre().equals(nombre)) {
                magos.remove(i);
                RegistroClonados.eliminarMagoClonado(i);
                JOptionPane.showMessageDialog(this, "Mago eliminado correctamente", 
                                          "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
                break; // Salir del método después de eliminar
            }
        }            
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
