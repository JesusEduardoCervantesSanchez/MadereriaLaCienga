/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import negocio.ProveedorControl;

/**
 *
 * @author hg710
 */
public class ConsultarProveedor extends javax.swing.JPanel {

    private final ProveedorControl control;
    String accion;
    //private String nombreant;
    private String[] proveedores = new String [6];
    private boolean encontrado=false;
    Object id;
    
    public ConsultarProveedor() {
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
        cmbClave.setModel(control.seleccionarProveedores());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbClave = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        titulo.setForeground(new java.awt.Color(5, 93, 38));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Consultar Proveedor");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 200, 40));

        jLabel2.setText("Clave");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 120, -1));

        add(cmbClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 80, 30));

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

    private void jtListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListadoMouseClicked
        
    }//GEN-LAST:event_jtListadoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Listar(cmbClave.getSelectedItem().toString());
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbClave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtListado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
