/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenjualan;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Mainframe extends javax.swing.JFrame {

    /**
     * Creates new form menuutama
     */
    public Mainframe() {
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

        desktoppane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuexit = new javax.swing.JMenu();
        menulogin = new javax.swing.JMenuItem();
        menulogout = new javax.swing.JMenuItem();
        Menuexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktoppaneLayout = new javax.swing.GroupLayout(desktoppane);
        desktoppane.setLayout(desktoppaneLayout);
        desktoppaneLayout.setHorizontalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        desktoppaneLayout.setVerticalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        menuexit.setText("LOGIN/MASUK");
        menuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuexitActionPerformed(evt);
            }
        });

        menulogin.setText("LOGIN");
        menulogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuloginActionPerformed(evt);
            }
        });
        menuexit.add(menulogin);

        menulogout.setText("LOGOUT");
        menulogout.setEnabled(false);
        menulogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulogoutActionPerformed(evt);
            }
        });
        menuexit.add(menulogout);

        Menuexit.setText("EXIT");
        Menuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuexitActionPerformed(evt);
            }
        });
        menuexit.add(Menuexit);

        jMenuBar1.add(menuexit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktoppane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktoppane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuloginActionPerformed
        desktoppane.removeAll();
        loginform Loginform = new loginform();
        Loginform.setVisible(true);
        desktoppane.add(Loginform);
        menulogin.setEnabled(false);
        menulogout.setEnabled(true);
    }//GEN-LAST:event_menuloginActionPerformed

    private void menulogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulogoutActionPerformed
        desktoppane.removeAll();
        loginform Loginform = new loginform();
        Loginform.setVisible(true);
        desktoppane.add(Loginform);
        menulogout.setEnabled(false);
        menulogin.setEnabled(true);
    }//GEN-LAST:event_menulogoutActionPerformed

    private void menuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuexitActionPerformed
        
    }//GEN-LAST:event_menuexitActionPerformed

    private void MenuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuexitActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Keluar Aplikasi?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(pilih == JOptionPane.OK_OPTION){
            System.exit(0);
        } else {
            JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_MenuexitActionPerformed

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menuexit;
    private javax.swing.JDesktopPane desktoppane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuexit;
    private javax.swing.JMenuItem menulogin;
    private javax.swing.JMenuItem menulogout;
    // End of variables declaration//GEN-END:variables
}
