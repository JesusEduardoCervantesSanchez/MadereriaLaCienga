/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package papeleriayolis;

/**
 *
 * @author CSjes
 */
public class MenuServicios extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuServicios() {
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
        jpMenu = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jbRegresarMP = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jbDesplegarMenu = new javax.swing.JButton();
        jbCerrrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 159, 220));
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(1, 159, 220));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(252, 195, 20));

        jButton2.setBackground(new java.awt.Color(252, 195, 20));
        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton2.setText("Local");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbRegresarMP.setBackground(new java.awt.Color(252, 195, 20));
        jbRegresarMP.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbRegresarMP.setText("Regresar al menu principal");
        jbRegresarMP.setBorder(null);
        jbRegresarMP.setContentAreaFilled(false);
        jbRegresarMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegresarMPMouseClicked(evt);
            }
        });
        jbRegresarMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarMPActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(252, 195, 20));
        jButton6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton6.setText("En linea");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbRegresarMP, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRegresarMP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel5.add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, -1, 520));

        jbDesplegarMenu.setBackground(new java.awt.Color(1, 159, 220));
        jbDesplegarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_icon_2_icon-icons.com_71856.png"))); // NOI18N
        jbDesplegarMenu.setBorder(null);
        jbDesplegarMenu.setContentAreaFilled(false);
        jbDesplegarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesplegarMenuActionPerformed(evt);
            }
        });
        jPanel5.add(jbDesplegarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 40, 40));

        jbCerrrar.setBackground(new java.awt.Color(2, 159, 220));
        jbCerrrar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jbCerrrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrrar.setText("X");
        jbCerrrar.setBorder(null);
        jbCerrrar.setContentAreaFilled(false);
        jbCerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrrarActionPerformed(evt);
            }
        });
        jPanel5.add(jbCerrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbDesplegarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesplegarMenuActionPerformed
        int posicion = jbDesplegarMenu.getX();
        if(posicion>5)
        {
            Animacion.Animacion.mover_izquierda(261, 5, 2, 2, jbDesplegarMenu);
            Animacion.Animacion.mover_izquierda(5, -260, 2, 2, jpMenu);
        }
        else
        {
            Animacion.Animacion.mover_derecha(5, 260, 2, 2, jbDesplegarMenu);
            Animacion.Animacion.mover_derecha(-260, 5, 2, 2, jpMenu);
        }
    }//GEN-LAST:event_jbDesplegarMenuActionPerformed

    private void jbCerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCerrrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbRegresarMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegresarMPActionPerformed

    private void jbRegresarMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegresarMPMouseClicked
        dispose();
        MenuPrincipal obmp = new MenuPrincipal();
        obmp.setVisible(true);
    }//GEN-LAST:event_jbRegresarMPMouseClicked

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
            java.util.logging.Logger.getLogger(MenuServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MenuServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbCerrrar;
    private javax.swing.JButton jbDesplegarMenu;
    private javax.swing.JButton jbRegresarMP;
    private javax.swing.JPanel jpMenu;
    // End of variables declaration//GEN-END:variables

}
