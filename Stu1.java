package abschluss;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Stu1 extends javax.swing.JFrame {

    public Stu1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_nachname = new javax.swing.JTextField();
        jlabel4 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_studentlist = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_fakultaet = new javax.swing.JTextField();
        tf_programm = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_mesaj = new javax.swing.JTextArea();
        checkButton = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlabel2.setText("Name");

        jlabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlabel3.setText("Nachname");

        jlabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlabel4.setText("ID");

        saveButton.setText("Hinzufugen");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        table_studentlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "ID", "Fakultaet", "Programm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_studentlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_studentlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_studentlist);

        deleteButton.setText("Loschen");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Aktualisieren");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Fakultaet");

        jLabel2.setText("Programm");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_mesaj.setEditable(false);
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(tf_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nachname)
                            .addComponent(tf_fakultaet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_programm, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel3)
                    .addComponent(tf_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_fakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_programm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(checkButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String n= tf_name.getText();
        String nn= tf_nachname.getText();
        String id= tf_id.getText();
        String fakultaet= tf_fakultaet.getText();
        String programm= tf_programm.getText();
        Student s= new Student(n, nn, id, fakultaet, programm);
        if(!id.isEmpty() && !n.isEmpty() && !nn.isEmpty() && !uni.getStudentlist().toString().contains(id)) {
        if(s.idkontrol(id)){
        uni.getStudentlist().add(s);
        ta_mesaj.setText("Ogrenci eklenmistir " + uni.getStudentlist().size()+ " kadar ogrenci mevcut");
        String[] ss= new String[5];
        ss[0]= n;
        ss[1]= nn;
        ss[2]= id;
        ss[3]= fakultaet;
        ss[4]= programm;
        DefaultTableModel dtm= (DefaultTableModel) table_studentlist.getModel();
        dtm.addRow(ss);
            }
        }
        else {
        ta_mesaj.setText("ID passt nicht zu Regeln, oder vorher gegebenes ID, "
                + "\nName und Nachname soll nicht leer.");
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int i= table_studentlist.getSelectedRow();
        if (i>=0 ) {
        uni.getStudentlist().remove(i);
        DefaultTableModel dtm= (DefaultTableModel) table_studentlist.getModel();
        dtm.removeRow(i);
        ta_mesaj.setText("Ogrenci silinmistir " + uni.getStudentlist().size()+ " kadar ogrenci mevcut");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         int i= table_studentlist.getSelectedRow();
        if (i>=0 ) {
            Student s= uni.getStudentlist().get(i);
            if (s.idkontrol(tf_id.getText()) && !tf_name.getText().isEmpty() && !tf_nachname.getText().isEmpty() &&
                    !uni.getStudentlist().toString().contains(tf_id.getText())) {
            s.setName(tf_name.getText());
            s.setNachname(tf_nachname.getText());
            s.setId(tf_id.getText());
            s.setFakultaet(tf_fakultaet.getText());
            s.setProgramm(tf_programm.getText());
            table_studentlist.getModel().setValueAt(s.getName(), i, 0);
            table_studentlist.getModel().setValueAt(s.getNachname(), i, 1);
            table_studentlist.getModel().setValueAt(s.getId(), i, 2);  
            table_studentlist.getModel().setValueAt(s.getFakultaet(), i, 3); 
            table_studentlist.getModel().setValueAt(s.getProgramm(), i, 4); 
            }
            else{
            ta_mesaj.setText("ID passt nicht Regeln, "
                    + "oder vorher gegebenes ID");
            }
        }
        if( (i>=0) && (uni.getStudentlist().toString().contains(tf_id.getText())) && !tf_name.getText().isEmpty() 
                && !tf_nachname.getText().isEmpty()) {
        Student s= uni.getStudentlist().get(i);
            s.setName(tf_name.getText());
            s.setNachname(tf_nachname.getText());
            s.setFakultaet(tf_fakultaet.getText());
            s.setProgramm(tf_programm.getText());
            table_studentlist.getModel().setValueAt(s.getName(), i, 0);
            table_studentlist.getModel().setValueAt(s.getNachname(), i, 1);
            table_studentlist.getModel().setValueAt(s.getId(), i, 2);  
            table_studentlist.getModel().setValueAt(s.getFakultaet(), i, 3); 
            table_studentlist.getModel().setValueAt(s.getProgramm(), i, 4); 
            ta_mesaj.setText(" ");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void table_studentlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_studentlistMouseClicked
        int i= table_studentlist.getSelectedRow();
        if (i>=0) {
        tf_name.setText((String) table_studentlist.getModel().getValueAt(i, 0));
        tf_nachname.setText((String) table_studentlist.getModel().getValueAt(i, 1));
        tf_id.setText((String) table_studentlist.getModel().getValueAt(i, 2));
        tf_fakultaet.setText((String) table_studentlist.getModel().getValueAt(i, 3));
        tf_programm.setText((String) table_studentlist.getModel().getValueAt(i, 4));
        }
    }//GEN-LAST:event_table_studentlistMouseClicked
    
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
            DefaultTableModel dtm= (DefaultTableModel) table_studentlist.getModel();
            dtm.setRowCount(0);
            for (int i = 0; i < uni.getStudentlist().size(); i++) {
            String[] ss= new String[5];
            ss[0]= uni.getStudentlist().get(i).getName();
            ss[1]= uni.getStudentlist().get(i).getNachname();
            ss[2]= uni.getStudentlist().get(i).getId();
            ss[3]= uni.getStudentlist().get(i).getFakultaet();
            ss[4]= uni.getStudentlist().get(i).getProgramm();
            dtm.addRow(ss);     
       }  
    }//GEN-LAST:event_checkButtonActionPerformed
     
    Universitaet uni= new Universitaet();
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Stu1().setVisible(true);
        });
    
 }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextArea ta_mesaj;
    private javax.swing.JTable table_studentlist;
    private javax.swing.JTextField tf_fakultaet;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nachname;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_programm;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
