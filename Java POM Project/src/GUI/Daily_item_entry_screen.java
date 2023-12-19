package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import oodj_assignment.FileOperator;
import java.awt.*;

public class Daily_item_entry_screen extends javax.swing.JFrame {
    private String[][] Item_list;
 
    public Daily_item_entry_screen() {
        initComponents();
        try
        { 
            File myData = new File("Item.txt");
            Scanner Sc = new Scanner(myData);
            Scanner Sc2 = new Scanner(myData);
            String cur_Line;
            int rowCount = 0;
            while (Sc.hasNextLine()) {
                Sc.nextLine(); 
                rowCount++;
            }
            System.out.print(rowCount);
            Item_list = new String[rowCount][2];
            String[] cur_Item;
            String[] newItem =  new String[2];
            
            int index = 0;
            while (Sc2.hasNextLine())
            {
                cur_Line = Sc2.nextLine();
                cur_Item = cur_Line.split(";");
                newItem[0] = cur_Item[0];
                newItem[1] = cur_Item[1];
                
                Item_list[index] = new String[] { cur_Item[0], cur_Item[1] };
                index++;
            }
            Sc.close();
            
            item_cmb.removeAllItems();
            for (int i = 0; i < Item_list.length; i++)
            {
                item_cmb.addItem(Item_list[i][0] + "    "+Item_list[i][1]);
            }
        }
        catch (IOException Ex)
        {
            System.out.println("File error.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        save_btn = new javax.swing.JButton();
        item_cmb = new javax.swing.JComboBox<>();
        qty_txt = new javax.swing.JTextField();
        qty_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        add_to_list1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        temp_daily_item_table = new javax.swing.JTable();
        clear_btn = new javax.swing.JButton();
        qty_txt_error_lbl = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Daily Item-wise list:");

        save_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        save_btn.setText("Save list");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        item_cmb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        item_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        item_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cmbActionPerformed(evt);
            }
        });

        qty_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qty_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty_txtActionPerformed(evt);
            }
        });

        qty_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qty_lbl.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Item list:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Daily Item-wise Sales Entry ");

        delete_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delete_btn.setText("Delete Item");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        add_to_list1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add_to_list1.setText("Add Item");
        add_to_list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_list1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("ID:       Name:");

        temp_daily_item_table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        temp_daily_item_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(temp_daily_item_table);

        clear_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clear_btn.setText("Clear All");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        qty_txt_error_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(qty_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qty_txt_error_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qty_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 70, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(add_to_list1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_btn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(clear_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 163, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qty_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qty_lbl))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qty_txt_error_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn)
                    .addComponent(save_btn)
                    .addComponent(add_to_list1))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qty_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty_txtActionPerformed

    }//GEN-LAST:event_qty_txtActionPerformed

    private void add_to_list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_list1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) temp_daily_item_table.getModel();
        qty_txt_error_lbl.setVisible(false);
        String[] id_name = item_cmb.getSelectedItem().toString().split("    ");
        String selectedRow = item_cmb.getSelectedItem().toString();

        String ItemId = id_name[0];
        String ItemName = id_name[1];
        String qty =  qty_txt.getText();
        
        if ( !qty.isEmpty() ) {
            try {
                Integer.parseInt(qty);
                String[] newRow = { ItemId, ItemName, qty };
                if (selectedRow != "-1") {
                    // Create a new data array with the new row appended
                    String[][] data = new String[temp_daily_item_table.getRowCount() + 1][];
                    for (int row = 0; row < model.getRowCount(); row++) {
                            data[row] = new String[] {
                                    model.getValueAt(row, 0).toString(),
                                    model.getValueAt(row, 1).toString(),
                                    model.getValueAt(row, 2).toString()};
                    }

                    data[data.length - 1] = newRow;
                    //Clear table
                    model.setRowCount(0);
                    //Add data to table row by row
                    for (String[] row : data) {
                        model.addRow(row);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Select a item to add.");
                } 
            } catch (NumberFormatException e) {
               qty_txt_error_lbl.setText("Please enter an integer.");
               qty_txt_error_lbl.setForeground(Color.RED);
               qty_txt_error_lbl.setVisible(true);
            }
        } else {
            qty_txt_error_lbl.setText("This shouldn't be emtpy.");
            qty_txt_error_lbl.setVisible(true);
            qty_txt_error_lbl.setForeground(Color.RED);
        }
    }//GEN-LAST:event_add_to_list1ActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) temp_daily_item_table.getModel();
        int selectedRow = temp_daily_item_table.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
        } 
        else {
            JOptionPane.showMessageDialog(null, "Select a row to delete.");
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) temp_daily_item_table.getModel();
        if (temp_daily_item_table.getRowCount() != 0) {
            // Create a new data array with the new row appended
            String[] newRow = new String[temp_daily_item_table.getRowCount() + 1];
     
            newRow[0] = FileOperator.getNewId("Daily Item Data.txt","OD") + ";" + java.time.LocalDate.now().toString();
            for (int row = 1; row < model.getRowCount()+1; row++) {
                    newRow[row]  = model.getValueAt(row-1, 0).toString() + ";" + 
                                                    model.getValueAt(row-1, 1).toString() + ";" + 
                                                    model.getValueAt(row-1, 2).toString();
            }
            System.out.print(String.join(";;", newRow));
            FileOperator.addLine("Daily Item Data.txt", String.join(";;", newRow));
        }
        else {
            JOptionPane.showMessageDialog(null, "The list is empty.");
        }
    }//GEN-LAST:event_save_btnActionPerformed

    private void item_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_cmbActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) temp_daily_item_table.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_clear_btnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daily_item_entry_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_to_list1;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JComboBox<String> item_cmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel qty_lbl;
    private javax.swing.JTextField qty_txt;
    private javax.swing.JLabel qty_txt_error_lbl;
    private javax.swing.JButton save_btn;
    private javax.swing.JTable temp_daily_item_table;
    // End of variables declaration//GEN-END:variables
}
