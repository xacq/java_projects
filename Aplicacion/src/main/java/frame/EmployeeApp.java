/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;
import coneccion.EmployeeDAO;
import coneccion.EmployeeDTO;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class EmployeeApp extends javax.swing.JFrame {

    public EmployeeApp() {
        initComponents();
        
        setTitle("Employee Management");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "USUARIO", "CONTRASEÑA", "TIPO", "HORAS TRABAJADAS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(58, 58, 58)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(53, 53, 53)
                .addComponent(jButton4)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JTextField userField = new JTextField(20);
        JTextField passwordField = new JPasswordField(20);
        JTextField employeeTypeField = new JTextField(20);
        JTextField hoursWorkedField = new JTextField(20);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Usuario:"));
        panel.add(userField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passwordField);
        panel.add(new JLabel("Tipo de Empleado:"));
        panel.add(employeeTypeField);
        panel.add(new JLabel("Horas Trabajadas:"));
        panel.add(hoursWorkedField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Agregar Empleado",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setUsuario(userField.getText());
        employee.setContrasena(passwordField.getText());
        employee.setEmployeeTipo(employeeTypeField.getText());
        employee.setHoras_trabajo(Integer.parseInt(hoursWorkedField.getText()));

        EmployeeDAO dao = new EmployeeDAO();
try {
            dao.addEmployee(employee);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{null, employee.getUsuario(), employee.getContrasena(),
                    employee.getEmployeeTipo(), employee.getHoras_trabajo()});
            JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de la excepción para depurar
            JOptionPane.showMessageDialog(null, "Error al agregar el empleado a la base de datos");
        }

     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String user = (String) model.getValueAt(selectedRow, 1);
            String password = (String) model.getValueAt(selectedRow, 2);
            String employeeType = (String) model.getValueAt(selectedRow, 3);
            Integer hoursWorked = (Integer) model.getValueAt(selectedRow, 4);

            JTextField userField = new JTextField(user, 20);
            JTextField passwordField = new JPasswordField(password, 20);
            JTextField employeeTypeField = new JTextField(employeeType, 20);
            JTextField hoursWorkedField = new JTextField(hoursWorked.toString(), 20);

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Usuario:"));
            panel.add(userField);
            panel.add(new JLabel("Contraseña:"));
            panel.add(passwordField);
            panel.add(new JLabel("Tipo de Empleado:"));
            panel.add(employeeTypeField);
            panel.add(new JLabel("Horas Trabajadas:"));
            panel.add(hoursWorkedField);

            int result = JOptionPane.showConfirmDialog(null, panel, "Editar Empleado",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                model.setValueAt(userField.getText(), selectedRow, 1);
                model.setValueAt(passwordField.getText(), selectedRow, 2);
                model.setValueAt(employeeTypeField.getText(), selectedRow, 3);
                model.setValueAt(Integer.parseInt(hoursWorkedField.getText()), selectedRow, 4);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para editar");
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String employeeType = (String) model.getValueAt(selectedRow, 3);
            Integer HorasTrabajadas = (Integer) model.getValueAt(selectedRow, 4);
            //AQUI SE INDICAN LOS TIPOS DE USUARIOS DEL SISTEMA    
            double valor_hora;
            valor_hora = switch (employeeType.toLowerCase()) {
                case "administrador" -> 50.0;
                case "gerente" -> 40.0;
                case "obrero" -> 20.0;
                default -> 0.0;
            };

            double salario = HorasTrabajadas * valor_hora;
            JOptionPane.showMessageDialog(null, "El sueldo es: " + salario);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para calcular el sueldo");
        }
    }//GEN-LAST:event_jButton4ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
