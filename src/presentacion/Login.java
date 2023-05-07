/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package presentacion;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author CSjes
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    private boolean BA = true, BP = false, BE = false;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jbCerrrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnAdmin = new javax.swing.JLabel();
        btnProp = new javax.swing.JLabel();
        btnEmp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 159, 220));
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(217, 217, 217));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCerrrar.setBackground(new java.awt.Color(2, 159, 220));
        jbCerrrar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jbCerrrar.setText("X");
        jbCerrrar.setBorder(null);
        jbCerrrar.setContentAreaFilled(false);
        jbCerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrrarActionPerformed(evt);
            }
        });
        jPanel5.add(jbCerrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 40, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMadereria/02257d66bbff454b898023eac85eb73a (3).png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(217, 217, 217));
        jTextField1.setText("Ingrese su usuario");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(217, 217, 217));
        jPasswordField1.setText("Contrasena");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol.png"))); // NOI18N
        btnAdmin.setText("Administrador");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });

        btnProp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnProp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png"))); // NOI18N
        btnProp.setText("Propietario");
        btnProp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPropMouseClicked(evt);
            }
        });

        btnEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png"))); // NOI18N
        btnEmp.setText("Empleado");
        btnEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Contraseña");

        jPanel3.setBackground(new java.awt.Color(5, 93, 38));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(5, 93, 38));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Iniciar Sesion");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 27, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin)
                    .addComponent(btnProp)
                    .addComponent(btnEmp))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 740, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCerrrarActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        btnAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol.png")));
        btnAdmin.setForeground(new Color(255, 255, 255));
        btnEmp.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png")));
        btnEmp.setForeground(new Color(0, 0, 0));
        btnProp.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png")));
        btnProp.setForeground(new Color(0, 0, 0));
        BA = true;
        BP = false;
        BE = false;
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnPropMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPropMouseClicked
        btnProp.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol.png")));
        btnProp.setForeground(new Color(255, 255, 255));
        btnEmp.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png")));
        btnEmp.setForeground(new Color(0, 0, 0));
        btnAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png")));
        btnAdmin.setForeground(new Color(0, 0, 0));
        BA = false;
        BP = true;
        BE = false;
    }//GEN-LAST:event_btnPropMouseClicked

    private void btnEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpMouseClicked
        btnEmp.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol.png")));
        btnEmp.setForeground(new Color(255, 255, 255));
        btnAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png")));
        btnAdmin.setForeground(new Color(0, 0, 0));
        btnProp.setIcon(new ImageIcon(getClass().getResource("/imagenesMadereria/Comp_Rol_B.png")));
        btnProp.setForeground(new Color(0, 0, 0));
        BA = false;
        BP = false;
        BE = true;
    }//GEN-LAST:event_btnEmpMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        if (BA && !BP && !BE) {
            this.setVisible(false);
            new MenuAdministrador().setVisible(true);
        } else if (!BA && BP && !BE) {
            this.setVisible(false);
            new MenuPropietario().setVisible(true);
        } else if (!BA && !BP && BE) {
            this.setVisible(false);
            new MenuEmpleado().setVisible(true);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnEmp;
    private javax.swing.JLabel btnProp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCerrrar;
    // End of variables declaration//GEN-END:variables

}
