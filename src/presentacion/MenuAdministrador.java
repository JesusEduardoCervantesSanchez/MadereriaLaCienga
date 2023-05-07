/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package presentacion;

/**
 *
 * @author CSjes
 */
public class MenuAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuAdministrador() {
        initComponents();
        menuScrollable1.setEvent(new EventoMenu() {
            @Override
            public void selected(int index, int subIndex) {
                switch (index) {
                    case 0:
                        switch (subIndex) {
                            case 1:
                                new CambiaPanel(jpAlmacenador, new AltaEmpleado());
                                break;
                            case 2:
                                new CambiaPanel(jpAlmacenador, new BajaEmpleado());
                                break;
                            case 3:
                                new CambiaPanel(jpAlmacenador, new AltaProveedor());
                                break;
                            case 4:
                                new CambiaPanel(jpAlmacenador, new BajaProveedor());
                                break;
                        }
                        break;
                    case 1:
                        switch (subIndex) {
                            case 1:
                                new CambiaPanel(jpAlmacenador, new AltaProducto());
                                break;
                            case 2:
                                new CambiaPanel(jpAlmacenador, new BajaProducto());
                                break;
                        }
                        break;
                    case 2:
                        new Login().setVisible(true);
                        setVisible(false);
                        break;
                }
            }

        });
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scrollPaneWin111 = new raven.scroll.win11.ScrollPaneWin11();
        menuScrollable1 = new presentacion.MenuScrollableA();
        jbCerrrar = new javax.swing.JButton();
        jpAlmacenador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 159, 220));
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(217, 217, 217));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMadereria/Administrador.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jpMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        scrollPaneWin111.setBackground(new java.awt.Color(217, 217, 217));
        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setViewportView(menuScrollable1);

        jpMenu.add(scrollPaneWin111, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 380));

        jPanel5.add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 520));

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

        jpAlmacenador.setBackground(new java.awt.Color(255, 255, 255));
        jpAlmacenador.setPreferredSize(new java.awt.Dimension(670, 460));
        jpAlmacenador.setLayout(new javax.swing.BoxLayout(jpAlmacenador, javax.swing.BoxLayout.LINE_AXIS));
        jPanel5.add(jpAlmacenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

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

    private void jbCerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCerrrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbCerrrar;
    private javax.swing.JPanel jpAlmacenador;
    private javax.swing.JPanel jpMenu;
    private presentacion.MenuScrollableA menuScrollable1;
    private raven.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    // End of variables declaration//GEN-END:variables

}
