/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import Negocio.ComprasControl;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import negocio.ProveedorControl;

/**
 *
 * @author hg710
 */
public class AltaProveedor extends javax.swing.JPanel {

    private final ProveedorControl control;
    //private String nombreant;
    
    public AltaProveedor() {
        initComponents();
        control = new ProveedorControl();
        Clave();
    }

    public void MensajeOK(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje, "Alta Proveedor", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void MensajeError(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje, "Alta Proveedor", JOptionPane.ERROR_MESSAGE);
    }
    
    public void Limpiar()
    {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtEstado.setText("");
        txtTelefono.setText("");
        txtLocalidad.setText("");
        Clave();
    }
    
    public void Clave(){
        txtClave.setText(control.id()+"");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        titulo.setForeground(new java.awt.Color(5, 93, 38));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Eliminar Proveedor");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 190, 40));

        jLabel2.setText("Clave");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 120, -1));

        jLabel3.setText("Nombre del aserradero");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        jLabel4.setText("Dirección");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, -1));

        jLabel5.setText("Estado");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, -1));

        jLabel7.setText("Localidad");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, -1));

        jLabel6.setText("Teléfono");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));
        add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 280, 30));
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 280, 30));
        add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 280, 30));
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 280, 30));

        txtClave.setEditable(false);
        add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, 30));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 280, 30));

        btnCancelar.setBackground(new java.awt.Color(204, 38, 38));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 160, -1));

        btnAceptar.setBackground(new java.awt.Color(5, 93, 38));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       String resp;
       if(txtNombre.getText().isBlank()){
           JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del proveedor", "Alta Proveedor", JOptionPane.WARNING_MESSAGE);
           txtNombre.requestFocus();
           return;
       }
       if(txtDireccion.getText().isBlank()){
          JOptionPane.showMessageDialog(this, "Debe ingresar la direccion del proveedor", "Alta Proveedor", JOptionPane.WARNING_MESSAGE);
          txtDireccion.requestFocus();
          return;
       }
       if(txtEstado.getText().isBlank()){
           JOptionPane.showMessageDialog(this, "Debe ingresar el estado del proveedor", "Alta Proveedor", JOptionPane.WARNING_MESSAGE);
           txtEstado.requestFocus();
           return;
       }
       if(txtTelefono.getText().isBlank()){
           JOptionPane.showMessageDialog(this, "Debe ingresar el telefono del proveedor", "Alta Proveedor", JOptionPane.WARNING_MESSAGE);
           txtTelefono.requestFocus();
           return;
       }
       if(txtLocalidad.getText().isBlank()){
           JOptionPane.showMessageDialog(this, "Debe ingresar la localidad del proveedor", "Alta Proveedor", JOptionPane.WARNING_MESSAGE);
           txtLocalidad.requestFocus();
           return;
       }
       resp=control.Insertar(txtNombre.getText().trim(), txtDireccion.getText().trim(), txtEstado.getText().trim(), txtTelefono.getText().trim(), txtLocalidad.getText());
        if(resp.equals("OK")){
            MensajeOK("Proveedor registrado correctamente");
            Limpiar();
        }else{
            MensajeError(resp);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
