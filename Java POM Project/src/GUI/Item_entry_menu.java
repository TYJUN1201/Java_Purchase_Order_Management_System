/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author TYJ1201
 */
public class Item_entry_menu extends javax.swing.JFrame {

    /**
     * Creates new form Item_entry_menu
     */
    public Item_entry_menu() {
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

        edititem_btn = new javax.swing.JButton();
        additem_btn = new javax.swing.JButton();
        deleteitem_btn = new javax.swing.JButton();
        searchitem_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edititem_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edititem_btn.setText("Edit Item");
        edititem_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edititem_btnActionPerformed(evt);
            }
        });

        additem_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        additem_btn.setText("Add Item");
        additem_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additem_btnActionPerformed(evt);
            }
        });

        deleteitem_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteitem_btn.setText("Delete Item");
        deleteitem_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitem_btnActionPerformed(evt);
            }
        });

        searchitem_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchitem_btn.setText("Search Item");
        searchitem_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchitem_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Item Entry Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(edititem_btn)
                    .addComponent(additem_btn)
                    .addComponent(deleteitem_btn)
                    .addComponent(jLabel1)
                    .addComponent(searchitem_btn))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {additem_btn, deleteitem_btn, edititem_btn, searchitem_btn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(additem_btn)
                .addGap(18, 18, 18)
                .addComponent(edititem_btn)
                .addGap(18, 18, 18)
                .addComponent(deleteitem_btn)
                .addGap(18, 18, 18)
                .addComponent(searchitem_btn)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edititem_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edititem_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edititem_btnActionPerformed

    private void additem_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additem_btnActionPerformed
        Add_Item_screen add_item_screen =  new Add_Item_screen();
        add_item_screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_additem_btnActionPerformed

    private void deleteitem_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitem_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteitem_btnActionPerformed

    private void searchitem_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchitem_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchitem_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Item_entry_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item_entry_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item_entry_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item_entry_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item_entry_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additem_btn;
    private javax.swing.JButton deleteitem_btn;
    private javax.swing.JButton edititem_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchitem_btn;
    // End of variables declaration//GEN-END:variables
}
