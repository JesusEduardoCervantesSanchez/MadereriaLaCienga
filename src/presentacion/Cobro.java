/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author hg710
 */
public class Cobro extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Cobro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidadPago = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRealizarCobro = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Monto a cobrar");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 280, -1));

        jLabel5.setText("Cantidad de pago");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 280, -1));

        jLabel6.setText("Cambio");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 280, -1));
        add(txtCantidadPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 280, 30));

        txtCambio.setEditable(false);
        txtCambio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCambio.setText("$0.00");
        add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 280, 30));

        txtMonto.setEditable(false);
        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtMonto.setText("$0.00");
        add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 280, 30));

        btnCancelar.setBackground(new java.awt.Color(204, 38, 38));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 160, -1));

        btnRealizarCobro.setBackground(new java.awt.Color(5, 93, 38));
        btnRealizarCobro.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarCobro.setText("Realizar Cobro");
        btnRealizarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCobroActionPerformed(evt);
            }
        });
        add(btnRealizarCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 160, -1));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        titulo.setForeground(new java.awt.Color(5, 93, 38));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cobro");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 200, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRealizarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarCobroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRealizarCobro;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidadPago;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
