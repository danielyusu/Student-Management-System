/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abschluss;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class Stu3 extends javax.swing.JFrame {

    /**
     * Creates new form Stu3
     */
    public Stu3() {
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

        tf_id = new javax.swing.JTextField();
        tf_lva = new javax.swing.JTextField();
        derseekleButton = new javax.swing.JButton();
        derstensilButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        derslerinigosterButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_auflisten = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_mesaj = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        derseekleButton.setText("Bu derse eklemek istiyorum");
        derseekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derseekleButtonActionPerformed(evt);
            }
        });

        derstensilButton.setText("Bu dersten silmek istiyorum");
        derstensilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derstensilButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Ogrenci ID");

        jLabel4.setText("Ders Kodu");

        derslerinigosterButton.setText("Tum derslerini goster");
        derslerinigosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derslerinigosterButtonActionPerformed(evt);
            }
        });

        ta_auflisten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LVAs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ta_auflisten);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ta_mesaj.setBackground(new java.awt.Color(240, 240, 240));
        ta_mesaj.setColumns(20);
        ta_mesaj.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ta_mesaj.setLineWrap(true);
        ta_mesaj.setRows(5);
        jScrollPane1.setViewportView(ta_mesaj);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(derstensilButton)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_lva, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(derslerinigosterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(derseekleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 9, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_lva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(derstensilButton)
                    .addComponent(derseekleButton)
                    .addComponent(derslerinigosterButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int x=0;
    private void derseekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derseekleButtonActionPerformed
      x=0;
        if(!uni.getLvawithstudent().isEmpty()) {
          for(int i=0; i<uni.getLvawithstudent().size(); i++) {
          if(uni.getLvawithstudent().get(i).getId().equals(tf_id.getText()) && 
             (uni.getLvawithstudent().get(i).getDers().equals(tf_lva.getText())))   {
           ta_mesaj.setText("Bu ogrencinin bu dersi zaten var");
           x=1;
          }
         }
      }
          
     if(a.idkontrol(tf_id.getText()) && (uni.getStudentlist().toString().contains(tf_id.getText())) && 
        (uni.getLvalist().toString().contains(tf_lva.getText())) && (x==0)) {
      String id= tf_id.getText();
      String kod= tf_lva.getText();
      Student s = new Student(id,kod);
      uni.getLvawithstudent().add(s);
      ta_mesaj.setText("Ogrenci derse eklenmistir");
      } 
      else {
      ta_mesaj.setText("Boyle bir ders veya ogrenci mevcut degil, ya da iki defa aynı ders alinmaya calisiliyor");
      }
    }//GEN-LAST:event_derseekleButtonActionPerformed
    
    private void derstensilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derstensilButtonActionPerformed
        //DefaultTableModel dtm= (DefaultTableModel) ta_auflisten.getModel();
        String id= tf_id.getText();
        String kod= tf_lva.getText();
        for(int i=0; i<uni.getLvawithstudent().size(); i++) {
        if((uni.getLvawithstudent().get(i).getId().equals(id)) && (uni.getLvawithstudent().get(i).getDers().equals(kod))){
            uni.getLvawithstudent().remove(i);
            ta_mesaj.setText("Ogrenci basariyla dersten silindi");
            }
        }                
    }//GEN-LAST:event_derstensilButtonActionPerformed
     ArrayList<String> tumidler= new ArrayList();
    private void derslerinigosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derslerinigosterButtonActionPerformed
      String a= tf_id.getText();
      DefaultTableModel dtm= (DefaultTableModel) ta_auflisten.getModel();
      dtm.setRowCount(0);
      if((uni.getStudentlist().toString().contains(a)) && (!tumidler.contains(a))) {
       for(int i= 0; i < uni.getLvawithstudent().size();i++) {
            if (uni.getLvawithstudent().get(i).getId().equals(a) 
                    && uni.getLvalist().toString().contains(uni.getLvawithstudent().get(i).getDers())) {
                String[] ss= new String[1];
                ss[0]= uni.getLvawithstudent().get(i).getDers();
                dtm.addRow(ss);
                tumidler.add(a);
                ta_mesaj.setText("Ogrencinin aldigi dersler listelenmistir");  
             }
            else { ta_mesaj.setText("Eslesen ogrenci veya ders kaydi bulunamadi");
            }
           }
      }
      else if(tumidler.contains(a)) {
        for(int i= 0; uni.getLvawithstudent().size()> i;i++){
            if (uni.getLvawithstudent().get(i).getId().equals(a) 
                    && uni.getLvalist().toString().contains(uni.getLvawithstudent().get(i).getDers())) {
                String[] ss= new String[1];
                ss[0]= uni.getLvawithstudent().get(i).getDers();
                dtm.addRow(ss);
                tumidler.add(a);
                ta_mesaj.setText("Ogrencinin aldigi dersler listelenmistir"); 
            }
            else {ta_mesaj.setText("Eslesen ogrenci veya ders kaydi bulunamadi");
            }
      }
   }
        else {
        ta_mesaj.setText("Eslesen ogrenci veya ders kaydi bulunamadi");
        }
    }//GEN-LAST:event_derslerinigosterButtonActionPerformed

    Student a= new Student("","");
    Universitaet uni = new Universitaet();
    
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
            java.util.logging.Logger.getLogger(Stu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stu3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derseekleButton;
    private javax.swing.JButton derslerinigosterButton;
    private javax.swing.JButton derstensilButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable ta_auflisten;
    private javax.swing.JTextArea ta_mesaj;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_lva;
    // End of variables declaration//GEN-END:variables
}