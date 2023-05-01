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
public class DevolucionVenta extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public DevolucionVenta() {
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

        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbClave = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnInsertarProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtTotalVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtCantidad = new javax.swing.JTextField();
        btnRealizarVenta1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        titulo.setForeground(new java.awt.Color(5, 93, 38));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Devolución de venta");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 200, 40));

        jLabel2.setText("Total de la devolución");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 130, -1));

        add(cmbClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 90, 30));

        btnCancelar.setBackground(new java.awt.Color(204, 38, 38));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 160, -1));

        btnInsertarProducto.setBackground(new java.awt.Color(5, 93, 38));
        btnInsertarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarProducto.setText("Insertar Producto");
        btnInsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarProductoActionPerformed(evt);
            }
        });
        add(btnInsertarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 130, -1));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtTabla.getTableHeader().setReorderingAllowed(false);
        jtTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtTabla);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 440, 270));

        jLabel3.setText("Clave del producto");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, -1));

        jtTotalVenta.setEditable(false);
        jtTotalVenta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtTotalVenta.setText("$0.00");
        add(jtTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 130, 30));

        jLabel4.setText("Cantidad de productos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, -1));
        add(jtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 80, 30));

        btnRealizarVenta1.setBackground(new java.awt.Color(5, 93, 38));
        btnRealizarVenta1.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarVenta1.setText("Realizar Devolución");
        btnRealizarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVenta1ActionPerformed(evt);
            }
        });
        add(btnRealizarVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarProductoActionPerformed

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTablaMouseClicked

    private void btnRealizarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarVenta1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInsertarProducto;
    private javax.swing.JButton btnRealizarVenta1;
    private javax.swing.JComboBox<String> cmbClave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtTotalVenta;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
