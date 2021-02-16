
package abschluss;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class Doz3 extends javax.swing.JFrame {

    
    public Doz3() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_tc = new javax.swing.JTextField();
        tf_lva = new javax.swing.JTextField();
        derseekleButton = new javax.swing.JButton();
        derslerinigosterButton = new javax.swing.JButton();
        derstensilButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_auflisten = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_mesaj = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Dozent TC");

        jLabel2.setText("Ders Kodu");

        derseekleButton.setText("Derse eklemek istiyorum");
        derseekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derseekleButtonActionPerformed(evt);
            }
        });

        derslerinigosterButton.setText("Tum derslerini goster");
        derslerinigosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derslerinigosterButtonActionPerformed(evt);
            }
        });

        derstensilButton.setText("Bu dersten silmek istiyorum");
        derstensilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derstensilButtonActionPerformed(evt);
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
        jScrollPane1.setViewportView(ta_auflisten);

        ta_mesaj.setBackground(new java.awt.Color(240, 240, 240));
        ta_mesaj.setColumns(20);
        ta_mesaj.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ta_mesaj.setLineWrap(true);
        ta_mesaj.setRows(5);
        jScrollPane2.setViewportView(ta_mesaj);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_tc)
                            .addComponent(tf_lva)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(derstensilButton)
                        .addGap(18, 18, 18)
                        .addComponent(derslerinigosterButton)
                        .addGap(20, 20, 20)
                        .addComponent(derseekleButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tf_lva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(derseekleButton)
                    .addComponent(derslerinigosterButton)
                    .addComponent(derstensilButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int x=0;
    private void derseekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derseekleButtonActionPerformed
        x=0; 
        if(!uni.getLvawithdozent().isEmpty()) {
          for(int i=0; i<uni.getLvawithdozent().size(); i++) {
          if(uni.getLvawithdozent().get(i).getTcno().equals(tf_tc.getText()) && 
             (uni.getLvawithdozent().get(i).getDers().equals(tf_lva.getText())))   {
           ta_mesaj.setText("Bu dozentin bu dersi zaten var");
            x=1;
          }
         }
      }
        
       if(a.tckontrol(tf_tc.getText()) && (uni.getDozentlist().toString().contains(tf_tc.getText())) && 
        (uni.getLvalist().toString().contains(tf_lva.getText())) && (x==0)) {
      String tc= tf_tc.getText();
      String kod= tf_lva.getText();
      Dozent d = new Dozent(tc,kod);
      uni.getLvawithdozent().add(d);
      ta_mesaj.setText("Dozent derse eklenmistir");
      } 
      else {
      ta_mesaj.setText("Boyle bir ders veya dozent mevcut degil, ya da iki defa ayni derse eklenmeye calisiliyor");
      }
    }//GEN-LAST:event_derseekleButtonActionPerformed

    private void derstensilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derstensilButtonActionPerformed
        //DefaultTableModel dtm= (DefaultTableModel) ta_auflisten.getModel();
        String tc= tf_tc.getText();
        String kod= tf_lva.getText();
        for(int i=0; i<uni.getLvawithdozent().size(); i++) {
        if((uni.getLvawithdozent().get(i).getTcno().equals(tc)) && (uni.getLvawithdozent().get(i).getDers().equals(kod))){
            uni.getLvawithdozent().remove(i);
            ta_mesaj.setText("Dozent basariyla dersten silindi");
            }
        }   
    }//GEN-LAST:event_derstensilButtonActionPerformed
    
    ArrayList<String> tumtcler= new ArrayList();
    private void derslerinigosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derslerinigosterButtonActionPerformed
      String a= tf_tc.getText();
      DefaultTableModel dtm= (DefaultTableModel) ta_auflisten.getModel();
      dtm.setRowCount(0);
      if((uni.getDozentlist().toString().contains(a)) && (!tumtcler.contains(a))) {
       for(int i= 0; i < uni.getLvawithdozent().size();i++) {
            if (uni.getLvawithdozent().get(i).getTcno().equals(a) 
                    && uni.getLvalist().toString().contains(uni.getLvawithdozent().get(i).getDers())) {
                String[] ss= new String[1];
                ss[0]= uni.getLvawithdozent().get(i).getDers();
                dtm.addRow(ss);
                tumtcler.add(a);
                ta_mesaj.setText("Dozentin verdigi dersler listelenmistir");  
             } 
            else {ta_mesaj.setText("Eslesen dozent veya ders kaydi bulunamadi");
            }
           }
      }
      else if(tumtcler.contains(a)) {
        for(int i= 0; uni.getLvawithdozent().size()> i;i++){
            if (uni.getLvawithdozent().get(i).getTcno().equals(a)) {
                String[] ss= new String[1];
                ss[0]= uni.getLvawithdozent().get(i).getDers();
                dtm.addRow(ss);
                tumtcler.add(a);
                ta_mesaj.setText("Dozentin verdigi dersler listelenmistir"); 
            }
            else {ta_mesaj.setText("Eslesen dozent veya ders kaydi bulunamadi");
            }
      }
   }
        else {
        ta_mesaj.setText("Eslesen dozent veya ders kaydi bulunamadi");
        }
    }//GEN-LAST:event_derslerinigosterButtonActionPerformed
    
    Dozent a= new Dozent("","");
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
            java.util.logging.Logger.getLogger(Doz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doz3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derseekleButton;
    private javax.swing.JButton derslerinigosterButton;
    private javax.swing.JButton derstensilButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable ta_auflisten;
    private javax.swing.JTextArea ta_mesaj;
    private javax.swing.JTextField tf_lva;
    private javax.swing.JTextField tf_tc;
    // End of variables declaration//GEN-END:variables
}
