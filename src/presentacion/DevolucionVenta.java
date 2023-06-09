/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import entidades.DetalleDevVentas;
import entidades.VentaDetalle;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import negocio.DevVentasControl;

/**
 *
 * @author hg710
 */
public class DevolucionVenta extends javax.swing.JPanel {
    private final DevVentasControl CONTROL=new DevVentasControl();
    DefaultTableModel modelo;
    int total = 0;
    int clave;
    /**
     * Creates new form NewJPanel
     */
    
    public DevolucionVenta() {
    }

    public DevolucionVenta(int clave) {
        initComponents();
        this.clave = clave;
        String titulos[] = {"Clave", "Cantidad", "Nombre", "Precio", "Monto"};
        modelo=new DefaultTableModel(null, titulos);
        cmbClave.setModel(CONTROL.ListaClaves());
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTotalVenta = new javax.swing.JTextField();
        btnRealizarDevolucion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        titulo.setForeground(new java.awt.Color(5, 93, 38));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Devolución de venta");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 200, 40));

        jLabel2.setText("Total de la devolución");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 130, -1));

        cmbClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClaveActionPerformed(evt);
            }
        });
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

        jLabel3.setText("Clave de la venta");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, -1));

        txtTotalVenta.setEditable(false);
        txtTotalVenta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTotalVenta.setText("$0.00");
        add(txtTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 130, 30));

        btnRealizarDevolucion.setBackground(new java.awt.Color(5, 93, 38));
        btnRealizarDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarDevolucion.setText("Realizar Devolución");
        btnRealizarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarDevolucionActionPerformed(evt);
            }
        });
        add(btnRealizarDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Window w = SwingUtilities.getWindowAncestor(DevolucionVenta.this);
        w.dispose();
        MenuEmpleado oba = new MenuEmpleado(clave);
        oba.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTablaMouseClicked

    private void btnRealizarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarDevolucionActionPerformed
        ArrayList<DetalleDevVentas> lista = new ArrayList();
        if(jtTabla.getRowCount()>0)
        {
            for(int i = 0; i<jtTabla.getRowCount(); i++)
            {
                System.out.println("Insertar clvprod: "+jtTabla.getModel().getValueAt(i, 0).toString());
                lista.add(new DetalleDevVentas(Integer.parseInt(jtTabla.getModel().getValueAt(i, 0).toString()), Integer.parseInt(jtTabla.getModel().getValueAt(i, 1).toString())));
            }
            String estado = CONTROL.insertar(Integer.parseInt(cmbClave.getModel().getElementAt(cmbClave.getSelectedIndex())+""), lista);
            JOptionPane.showMessageDialog(this, estado, "Madereria La Cienega", JOptionPane.INFORMATION_MESSAGE);
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            txtTotalVenta.setText("");
            total = 0;
}
        }
        else {
            JOptionPane.showMessageDialog(this, "Seleccione un proveedor y/o agregue un producto", "Madereria La Cienega", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_btnRealizarDevolucionActionPerformed

    private void cmbClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClaveActionPerformed
        if(cmbClave.getSelectedIndex()>0)
        {
            jtTabla.setModel(CONTROL.listarDetalle(Integer.parseInt(cmbClave.getModel().getElementAt(cmbClave.getSelectedIndex())+"")));
            for(int i = 0; i<jtTabla.getRowCount(); i++)
                total += Double.parseDouble(jtTabla.getModel().getValueAt(i, 4)+"");
            txtTotalVenta.setText("$"+total+"");
        }
    }//GEN-LAST:event_cmbClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRealizarDevolucion;
    private javax.swing.JComboBox<String> cmbClave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtTabla;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables
}
