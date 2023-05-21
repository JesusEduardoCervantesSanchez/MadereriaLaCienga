/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import negocio.ProveedorControl;

/**
 *
 * @author hg710
 */
public class BajaProveedor extends javax.swing.JPanel {

    private final ProveedorControl control;
    
    public BajaProveedor() {
        initComponents();
        control = new ProveedorControl();
        Listar("");
        comboProv();
    }
    
    public void Listar(String texto)
    {
        jtListado.setModel(control.Listar(texto));
        TableRowSorter modeloOrdenado = new TableRowSorter(jtListado.getModel());
        jtListado.setRowSorter(modeloOrdenado);
       
        //lblRegistrosMostrados.setText("Mostrados " + control.TotalMostrados() + " registros de " + control.Total());
    }
    
    public void comboProv(){
        cmbClave.setModel(control.seleccionarProveedores(1));
    }
    
    public void mensajeOK(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Papelería Yolis", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajeError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Papelería Yolis", JOptionPane.ERROR_MESSAGE);
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
        btnBaja = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        titulo.setForeground(new java.awt.Color(5, 93, 38));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Baja Proveedor");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 200, 40));

        jLabel2.setText("Clave");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 120, -1));

        add(cmbClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 80, 30));

        btnCancelar.setBackground(new java.awt.Color(204, 38, 38));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 160, -1));

        btnBaja.setBackground(new java.awt.Color(5, 93, 38));
        btnBaja.setForeground(new java.awt.Color(255, 255, 255));
        btnBaja.setText("Dar de baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });
        add(btnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 160, -1));

        jtListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtListado.getTableHeader().setReorderingAllowed(false);
        jtListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtListado);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 560, 260));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMadereria/lupa.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Listar("");
        comboProv();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        String resp;
        if(jtListado.getSelectedRowCount()==1){
                if(JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el proveedor: "+jtListado.getValueAt(jtListado.getSelectedRow(), 1).toString()+"?","Sistema Compras-Ventas", JOptionPane.YES_NO_OPTION)==0){
                    resp=control.Desactivar(Integer.parseInt(jtListado.getValueAt(jtListado.getSelectedRow(), 0).toString()));
                    if(resp.equals("OK")){
                        mensajeOK("Proveedor eliminado.");
                        Listar("");
                        comboProv();
                    }
                    else
                        mensajeError(resp);
                }
            else
                mensajeError("Eliminación cancelada.");
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes seleccionar un proveedor","Madereria La Cienega", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void jtListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtListadoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String accion = cmbClave.getSelectedItem().toString();
        if(accion.equals("Todos")){
            Listar("");
        }else{
            Listar(accion);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbClave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtListado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
