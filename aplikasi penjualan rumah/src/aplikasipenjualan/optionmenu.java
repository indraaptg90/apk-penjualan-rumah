/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenjualan;

/**
 *
 * @author ASUS
 */
public class optionmenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form optionmenu
     */
    public optionmenu() {
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

        topaymentbtn = new javax.swing.JButton();
        showdatabtn = new javax.swing.JButton();

        setTitle("PILIHAN MENU");

        topaymentbtn.setText("PENJUALAN RUMAH");
        topaymentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topaymentbtnActionPerformed(evt);
            }
        });

        showdatabtn.setText("TAMPILKAN DATA");
        showdatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdatabtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topaymentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(showdatabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topaymentbtn)
                    .addComponent(showdatabtn))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topaymentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topaymentbtnActionPerformed
        paymentform Paymentform = new paymentform();
        Paymentform.setVisible(true);
        this.getDesktopPane().add(Paymentform);
        this.dispose();
    }//GEN-LAST:event_topaymentbtnActionPerformed

    private void showdatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdatabtnActionPerformed
        dataform Dataform = new dataform();
        Dataform.setVisible(true);
        this.getDesktopPane().add(Dataform);
        this.dispose();
    }//GEN-LAST:event_showdatabtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton showdatabtn;
    private javax.swing.JButton topaymentbtn;
    // End of variables declaration//GEN-END:variables
}
