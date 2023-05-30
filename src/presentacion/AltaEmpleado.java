/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import negocio.EmpleadosControl;

/**
 *
 * @author cp
 */
public class AltaEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form AltaEmpleado
     */
    private final EmpleadosControl control;
    
    public AltaEmpleado() {
        initComponents();
        this.control = new EmpleadosControl();
        if(control.clvmax()==0)
        {
            txtClave.setText("");
            txtClave.setEditable(false);
        }
        else
        {
            txtClave.setText((control.clvmax())+"");
            txtClave.setEditable(false);
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

        jLabel9 = new javax.swing.JLabel();
        txtMedidas1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        clave = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        colonia = new javax.swing.JLabel();
        nomUsuario = new javax.swing.JLabel();
        contraceña = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtNomUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel9.setText("Nombre de usuario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        titulo.setForeground(new java.awt.Color(5, 93, 38));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registrar Empleado");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 190, 40));

        clave.setText("Clave");
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 120, -1));

        nombres.setText("Nombre[s]");
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 140, -1));

        apellidos.setText("Apellidos");
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));

        telefono.setText("Teléfono");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, -1));

        direccion.setText("Dirección");
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, -1));

        colonia.setText("Colonia");
        jPanel1.add(colonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, -1));

        nomUsuario.setText("Nombre de usuario");
        jPanel1.add(nomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 120, -1));

        contraceña.setText("Contraseña");
        jPanel1.add(contraceña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 120, -1));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 280, 30));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 280, 30));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 280, 30));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 280, 30));
        jPanel1.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 280, 30));
        jPanel1.add(txtNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 280, 30));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 280, 30));

        txtClave.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 80, 30));

        btnAceptar.setBackground(new java.awt.Color(5, 93, 38));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 160, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 38, 38));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Window w = SwingUtilities.getWindowAncestor(AltaEmpleado.this);
        w.dispose();
        MenuAdministrador oba = new MenuAdministrador();
        oba.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty() && !txtTelefono.getText().isEmpty() && !txtDireccion.getText().isEmpty()
                && !txtColonia.getText().isEmpty() && !txtNomUsuario.getText().isEmpty() && !txtContraseña.getText().isEmpty()) {
            control.insertar(txtNombres.getText(), txtApellidos.getText(), txtTelefono.getText(),
                    txtDireccion.getText(), txtColonia.getText(), txtNomUsuario.getText(), txtContraseña.getText());
            JOptionPane.showMessageDialog(this, "Empleado y Usuario creado con exito", "Madereria La Cienega", JOptionPane.INFORMATION_MESSAGE);
            txtNombres.setText("");
            txtApellidos.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtColonia.setText("");
            txtNomUsuario.setText("");
            txtContraseña.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Campos vacios, favor de verificar", "Madereria La Cienega", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel clave;
    private javax.swing.JLabel colonia;
    private javax.swing.JLabel contraceña;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomUsuario;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMedidas1;
    private javax.swing.JTextField txtNomUsuario;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
