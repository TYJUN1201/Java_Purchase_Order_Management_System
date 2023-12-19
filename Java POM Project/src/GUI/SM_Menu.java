package GUI;

public class SM_Menu extends javax.swing.JFrame {
    public SM_Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplier_btn = new javax.swing.JButton();
        display_po_btn = new javax.swing.JButton();
        item_btn = new javax.swing.JButton();
        daily_item_btn = new javax.swing.JButton();
        create_pr_btn = new javax.swing.JButton();
        display_pr_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        supplier_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        supplier_btn.setText("Supplier Entry");
        supplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_btnActionPerformed(evt);
            }
        });

        display_po_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        display_po_btn.setText("Display Purchase Orders");
        display_po_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_po_btnActionPerformed(evt);
            }
        });

        item_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        item_btn.setText("Item Entry");
        item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btnActionPerformed(evt);
            }
        });

        daily_item_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        daily_item_btn.setText("Daily Item-wise Sales Entry");
        daily_item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daily_item_btnActionPerformed(evt);
            }
        });

        create_pr_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        create_pr_btn.setText("Create Purchase Requisition");
        create_pr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_pr_btnActionPerformed(evt);
            }
        });

        display_pr_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        display_pr_btn.setText("Display Purchase Requisition");
        display_pr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_pr_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Sales Manager Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(supplier_btn)
                    .addComponent(display_po_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_btn)
                    .addComponent(daily_item_btn)
                    .addComponent(create_pr_btn)
                    .addComponent(display_pr_btn)
                    .addComponent(jLabel1))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {create_pr_btn, daily_item_btn, display_po_btn, display_pr_btn, item_btn, supplier_btn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(item_btn)
                .addGap(18, 18, 18)
                .addComponent(supplier_btn)
                .addGap(18, 18, 18)
                .addComponent(daily_item_btn)
                .addGap(18, 18, 18)
                .addComponent(create_pr_btn)
                .addGap(18, 18, 18)
                .addComponent(display_pr_btn)
                .addGap(18, 18, 18)
                .addComponent(display_po_btn)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btnActionPerformed
        Item_entry_menu item_menu =  new Item_entry_menu();
        item_menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_item_btnActionPerformed

    private void supplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_btnActionPerformed
        Add_Supplier_Screen add_supplier_screen =  new Add_Supplier_Screen();
        add_supplier_screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_supplier_btnActionPerformed

    private void daily_item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daily_item_btnActionPerformed
        Daily_item_entry_screen daily_item_screen =  new Daily_item_entry_screen();
        daily_item_screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daily_item_btnActionPerformed

    private void create_pr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_pr_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_create_pr_btnActionPerformed

    private void display_pr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_pr_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display_pr_btnActionPerformed

    private void display_po_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_po_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display_po_btnActionPerformed

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
            java.util.logging.Logger.getLogger(SM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SM_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create_pr_btn;
    private javax.swing.JButton daily_item_btn;
    private javax.swing.JButton display_po_btn;
    private javax.swing.JButton display_pr_btn;
    private javax.swing.JButton item_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton supplier_btn;
    // End of variables declaration//GEN-END:variables
}
