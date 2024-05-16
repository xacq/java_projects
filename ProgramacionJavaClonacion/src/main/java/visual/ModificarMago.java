package visual;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.Mago;
import modelos.RegistroClonados;

public class ModificarMago extends javax.swing.JFrame {
    private String nombreOriginal; 
    private Mago magoAModificar;

    public ModificarMago(String nombreOriginal) {
        initComponents();
        this.nombreOriginal = nombreOriginal;
        for (Mago mago : RegistroClonados.obtenerMagosClonados()) {
            if (mago.getNombre().equals(nombreOriginal)) {
                magoAModificar = mago; // Guardar referencia al objeto Guerrero
                break; 
            }
        }
        if (magoAModificar != null) {
            cargarDatosPersonaje();
        } else {
            // Manejar el caso donde no se encuentra el guerrero
            JOptionPane.showMessageDialog(this, "No se encontró al mago...! " + nombreOriginal, "Error", JOptionPane.ERROR_MESSAGE);
            dispose(); // Cerrar la ventana si no se encuentra el guerrero
        }
        // Agregar ActionListener al ComboBox para actualizar la imagen
        jComboBox1.addActionListener((java.awt.event.ActionEvent evt) -> {
            actualizarImagenLabel();
        });
    }

    private void cargarDatosPersonaje() {
        for (Mago mago : RegistroClonados.obtenerMagosClonados()) {
            if (mago.getNombre().equals(nombreOriginal)) {
                jTextField1.setText(mago.getNombre());
                jTextField2.setText(mago.getHabilidad());
                jTextField3.setText(mago.getEquipo());
                jTextField4.setText(String.valueOf(mago.getEncanto()));
                jTextField5.setText(mago.getImagen());
                ImageIcon imageIcon = new ImageIcon(jTextField5.getText());
                jLabel7.setIcon(imageIcon); 
                break; 
            }
        }
    }
    
    private void actualizarImagenLabel() {
        String imagePath = (String) jComboBox1.getSelectedItem();
        if (imagePath != null) {
            switch (imagePath) {
                case "Mago 1" ->                     {
                        ImageIcon imageIcon = new ImageIcon("C:\\DiazE_AstudilloS_Prototype\\src\\main\\java\\Images\\Mago1.jpg");
                        jLabel7.setIcon(imageIcon);
                        jTextField5.setText("C:\\DiazE_AstudilloS_Prototype\\src\\main\\java\\Images\\Mago1.jpg");
                    }
                case "Mago 2" ->                     {
                        ImageIcon imageIcon = new ImageIcon("C:\\DiazE_AstudilloS_Prototype\\src\\main\\java\\Images\\Mago2.jpg");
                        jLabel7.setIcon(imageIcon);
                        jTextField5.setText("C:\\DiazE_AstudilloS_Prototype\\src\\main\\java\\Images\\Mago2.jpg");
                    }
                case "Mago 3" ->                     {
                        ImageIcon imageIcon = new ImageIcon("C:\\DiazE_AstudilloS_Prototype\\src\\main\\java\\Images\\Mago3.jpg");
                        jLabel7.setIcon(imageIcon);
                        jTextField5.setText("C:\\DiazE_AstudilloS_Prototype\\src\\main\\java\\Images\\Mago3.jpg");
                    }
                default -> {
                    
                }
            }

        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Mago");
        setResizable(false);

        jLabel1.setText("Nombre");

        jLabel2.setText("Habilidad");

        jLabel3.setText("Equipo");

        jLabel4.setText("Fuerza/Encanto");

        jLabel5.setText("Imagen");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextField5.setEnabled(false);

        jButton5.setBackground(new java.awt.Color(0, 153, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SELECCIONA UNA FOTOGRAFIA PARA EL PERSONAJE");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mago 1", "Mago 2", "Mago 3", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField4)
                            .addComponent(jTextField1)))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                if (magoAModificar != null) {
            try {
                // Actualizar los datos del guerrero con los valores de los campos de texto
                magoAModificar.setNombre(jTextField1.getText());
                magoAModificar.setHabilidad(jTextField2.getText());
                magoAModificar.setEquipo(jTextField3.getText());
                magoAModificar.setEncanto(Integer.parseInt(jTextField4.getText())); // Asegurarse de que el valor sea un número
                magoAModificar.setImagen(jTextField5.getText());

                // Puedes agregar aquí un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Mago actualizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Cerrar la ventana 
            } catch (NumberFormatException e) {
                // Manejar la excepción si la fuerza no es un número válido
                JOptionPane.showMessageDialog(this, "La fuerza debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Manejar el caso donde no se encuentra el guerrero
            JOptionPane.showMessageDialog(this, "No se encontró al mago...!" + nombreOriginal, "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
