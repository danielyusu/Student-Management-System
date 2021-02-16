package abschluss;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class Lva1 extends javax.swing.JFrame {

    
    public Lva1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_code = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_lvalist = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_mesaj = new javax.swing.JTextArea();
        checkButton = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Code");

        table_lvalist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_lvalist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_lvalistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_lvalist);

        saveButton.setText("Hinzufugen");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Aktualisieren");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Loschen");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        ta_mesaj.setBackground(new java.awt.Color(240, 240, 240));
        ta_mesaj.setColumns(20);
        ta_mesaj.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ta_mesaj.setLineWrap(true);
        ta_mesaj.setRows(5);
        jScrollPane2.setViewportView(ta_mesaj);

        checkButton.setText("Zum sehen alles in Table, dadurch es kann  loschen und aktualisieren.");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(saveButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tf_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addComponent(checkButton)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String code= tf_code.getText();
        String name= tf_name.getText();
        Lva l= new Lva(code, name);
        if(!code.isEmpty() && !name.isEmpty() && !uni.getLvalist().toString().contains(code)) {
        if(l.lvakodkontrol(code)){
        uni.getLvalist().add(l);
        ta_mesaj.setText("Ders olusturulmustur " + uni.getLvalist().size()+ " kadar ders mevcut");
        String[] ss= new String[2];
        ss[0]= name;
        ss[1]= code;
        DefaultTableModel dtm= (DefaultTableModel) table_lvalist.getModel();
        dtm.addRow(ss);
            }
        }
        else {
        ta_mesaj.setText("Code ist nicht passend zu den Bedingungen ");
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int i= table_lvalist.getSelectedRow();
        if (i>=0 ) {
        uni.getLvalist().remove(i);
        DefaultTableModel dtm= (DefaultTableModel) table_lvalist.getModel();
        dtm.removeRow(i);
        ta_mesaj.setText("Ders silinmistir " + uni.getLvalist().size()+ " kadar ders mevcut");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int i= table_lvalist.getSelectedRow();
        if (i>=0 ) {
            Lva l= uni.getLvalist().get(i);
            if (l.lvakodkontrol(tf_code.getText())&& !tf_name.getText().isEmpty() 
                    && !uni.getLvalist().toString().contains(tf_code.getText())) {
            l.setCode(tf_code.getText());
            l.setName(tf_name.getText());
            table_lvalist.getModel().setValueAt(l.getName(), i, 0);
            table_lvalist.getModel().setValueAt(l.getCode(), i, 1);
            }
            else{
            ta_mesaj.setText("Code ist nicht passend zu den Bedingungen,\nName soll nicht leer.");
            }
      }
        if((i>=0) && (uni.getLvalist().toString().contains(tf_code.getText())) && !tf_name.getText().isEmpty()) {
            Lva l= uni.getLvalist().get(i);
            l.setName(tf_name.getText());
            table_lvalist.getModel().setValueAt(l.getName(), i, 0);
            table_lvalist.getModel().setValueAt(l.getCode(), i, 1);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void table_lvalistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_lvalistMouseClicked
        int i= table_lvalist.getSelectedRow();
        if (i>=0) {
        tf_name.setText((String) table_lvalist.getModel().getValueAt(i, 0));
        tf_code.setText((String) table_lvalist.getModel().getValueAt(i, 1));
         }
    }//GEN-LAST:event_table_lvalistMouseClicked
    
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        DefaultTableModel dtm= (DefaultTableModel) table_lvalist.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < uni.getLvalist().size(); i++) {
            String[] ss= new String[2];
            ss[0]= uni.getLvalist().get(i).getName();
            ss[1]= uni.getLvalist().get(i).getCode();
            dtm.addRow(ss);      
      }
    }//GEN-LAST:event_checkButtonActionPerformed

    Universitaet uni= new Universitaet();
    
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
            java.util.logging.Logger.getLogger(Lva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lva1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextArea ta_mesaj;
    private javax.swing.JTable table_lvalist;
    private javax.swing.JTextField tf_code;
    private javax.swing.JTextField tf_name;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
