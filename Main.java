package abschluss;


public class Main extends javax.swing.JFrame {
    /*  Yusuf Daniel Turkoglu
       
        Her sinifi ilk olarak 3 e ayirdim. 1 ile baslayanlar: ekleme, silme ve guncelleme yapiyor.
        2 ile baslayanlar: listeleme ve arama yapiyor.
        3 ile baslayanlar: derse ekleme, dersten cikarma ve bir kisinin tum derslerini gosterme islemini yapiyor.
        
        
    
    */

    
    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stu1 = new javax.swing.JButton();
        stu2 = new javax.swing.JButton();
        stu3 = new javax.swing.JButton();
        doz1 = new javax.swing.JButton();
        doz2 = new javax.swing.JButton();
        doz3 = new javax.swing.JButton();
        lva1 = new javax.swing.JButton();
        lva2 = new javax.swing.JButton();
        lva3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Student");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Dozent");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("LVA");

        stu1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        stu1.setText("hinzufugen,loschen,bearbeiten");
        stu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu1ActionPerformed(evt);
            }
        });

        stu2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        stu2.setText("auflisten,suchen");
        stu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu2ActionPerformed(evt);
            }
        });

        stu3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        stu3.setText("zu oder von LVAs, alle LVAs eines");
        stu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu3ActionPerformed(evt);
            }
        });

        doz1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        doz1.setText("hinzufugen,loschen, bearbeiten");
        doz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doz1ActionPerformed(evt);
            }
        });

        doz2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        doz2.setText("auflisten,suchen");
        doz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doz2ActionPerformed(evt);
            }
        });

        doz3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        doz3.setText("zu oder von LVAs, alle LVAs eines ");
        doz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doz3ActionPerformed(evt);
            }
        });

        lva1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lva1.setText("hinzufugen,loschen,bearbeiten");
        lva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lva1ActionPerformed(evt);
            }
        });

        lva2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lva2.setText("auflisten,suchen");
        lva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lva2ActionPerformed(evt);
            }
        });

        lva3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lva3.setText("alle Studenten, Dozenten einer LVA");
        lva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lva3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doz2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(doz3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(doz1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lva3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lva2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lva1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stu1)
                    .addComponent(doz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stu2)
                    .addComponent(doz2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stu3)
                    .addComponent(doz3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lva1)
                .addGap(18, 18, 18)
                .addComponent(lva2)
                .addGap(18, 18, 18)
                .addComponent(lva3)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu1ActionPerformed
        Stu1 e= new Stu1();
        e.setVisible(true);
    }//GEN-LAST:event_stu1ActionPerformed

    private void stu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu2ActionPerformed
        Stu2 e= new Stu2();
        e.setVisible(true);
    }//GEN-LAST:event_stu2ActionPerformed

    private void stu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu3ActionPerformed
        Stu3 e= new Stu3();
        e.setVisible(true);
    }//GEN-LAST:event_stu3ActionPerformed

    private void doz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doz1ActionPerformed
        Doz1 e= new Doz1();
        e.setVisible(true);
    }//GEN-LAST:event_doz1ActionPerformed

    private void doz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doz2ActionPerformed
       Doz2 e= new Doz2();
       e.setVisible(true);
    }//GEN-LAST:event_doz2ActionPerformed

    private void doz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doz3ActionPerformed
        Doz3 e= new Doz3();
        e.setVisible(true);
    }//GEN-LAST:event_doz3ActionPerformed

    private void lva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lva1ActionPerformed
        Lva1 e= new Lva1();
        e.setVisible(true);
    }//GEN-LAST:event_lva1ActionPerformed

    private void lva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lva2ActionPerformed
        Lva2 e= new Lva2();
        e.setVisible(true);
    }//GEN-LAST:event_lva2ActionPerformed

    private void lva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lva3ActionPerformed
        Lva3 e= new Lva3();
        e.setVisible(true);
    }//GEN-LAST:event_lva3ActionPerformed

    
   
    
    
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doz1;
    private javax.swing.JButton doz2;
    private javax.swing.JButton doz3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lva1;
    private javax.swing.JButton lva2;
    private javax.swing.JButton lva3;
    private javax.swing.JButton stu1;
    private javax.swing.JButton stu2;
    private javax.swing.JButton stu3;
    // End of variables declaration//GEN-END:variables
}
