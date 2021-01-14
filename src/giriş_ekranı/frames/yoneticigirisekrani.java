package giriş_ekranı.frames;

import giriş_ekranı.frames.otomasyonGirisekrani;
import giriş_ekranı.frames.yöneticigirdi;
import giriş_ekranı.frames.otomasyonGirisekrani;
import giriş_ekranı.frames.otomasyonGirisekrani;
import javax.swing.JOptionPane;

public class yoneticigirisekrani extends javax.swing.JFrame {

    public yoneticigirisekrani() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabelKULLANICIADI = new javax.swing.JLabel();
        LabelKULLANICIGIRISAL = new javax.swing.JTextField();
        jLabelKULLANICIŞIFRESI = new javax.swing.JLabel();
        jPasswordFieldKULLANICIŞİFRESİ = new javax.swing.JPasswordField();
        jButtonYÖNETICIGIRIS = new javax.swing.JButton();
        gerial = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YÖNETİCİ GİRİŞ EKRANI");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(450, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Yönetici giriş ekranı");

        jLabelKULLANICIADI.setBackground(new java.awt.Color(255, 102, 153));
        jLabelKULLANICIADI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKULLANICIADI.setForeground(new java.awt.Color(0, 51, 51));
        jLabelKULLANICIADI.setText("KULLANICI ADI");

        LabelKULLANICIGIRISAL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelKULLANICIGIRISAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelKULLANICIGIRISALActionPerformed(evt);
            }
        });

        jLabelKULLANICIŞIFRESI.setBackground(new java.awt.Color(255, 102, 153));
        jLabelKULLANICIŞIFRESI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKULLANICIŞIFRESI.setText("KULLANICI ŞİFRESİ");

        jPasswordFieldKULLANICIŞİFRESİ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldKULLANICIŞİFRESİActionPerformed(evt);
            }
        });

        jButtonYÖNETICIGIRIS.setBackground(new java.awt.Color(255, 255, 255));
        jButtonYÖNETICIGIRIS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonYÖNETICIGIRIS.setText("GİRİŞ");
        jButtonYÖNETICIGIRIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonYÖNETICIGIRIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYÖNETICIGIRISActionPerformed(evt);
            }
        });

        gerial.setBackground(new java.awt.Color(0, 0, 0));
        gerial.setForeground(new java.awt.Color(255, 255, 255));
        gerial.setText("GERİYE DÖN");
        gerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKULLANICIADI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKULLANICIŞIFRESI, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButtonYÖNETICIGIRIS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordFieldKULLANICIŞİFRESİ)
                            .addComponent(LabelKULLANICIGIRISAL))
                        .addGap(100, 100, 100))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gerial, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKULLANICIADI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelKULLANICIGIRISAL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelKULLANICIŞIFRESI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPasswordFieldKULLANICIŞİFRESİ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jButtonYÖNETICIGIRIS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(gerial))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonYÖNETICIGIRISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYÖNETICIGIRISActionPerformed
        String sys_parola ="123456";
        String kullanici_adi = "silan";
        char[] parola_al=  jPasswordFieldKULLANICIŞİFRESİ.getPassword();
        String kullanici_adi_al = LabelKULLANICIGIRISAL.getText();
        String kullanici_adi_calıstır =String.valueOf(kullanici_adi);
        String parola_calıstır =String.valueOf(parola_al);
        if((parola_calıstır.equals(sys_parola))&&(kullanici_adi_calıstır.equals(kullanici_adi)))
        {
            String dogrugirismesaj = "Doğru giriş yaptınız . Lütfen bekleyiniz...";
            JOptionPane.showMessageDialog(rootPane,dogrugirismesaj);
            //      Thread.sleep(1000); bekletme komutu çalışmıyor
              yöneticigirdi geri10 = new yöneticigirdi();
    geri10.setVisible(true);
    dispose();
        }
      
        else 
        {
            if(hak>1)
            {
                String hataligirismesaji = "Yanlış Şifre Veya Parola (kalan hak "+(hak-1)+")";
                JOptionPane.showMessageDialog(rootPane,hataligirismesaji);
                hak -= 1;
            }
            else
            {
                String bitis_mesaj = "3 defa hatalı giriş yapıldı.";
                JOptionPane.showMessageDialog(rootPane,bitis_mesaj);
                dispose();
            }
        }
     
    }//GEN-LAST:event_jButtonYÖNETICIGIRISActionPerformed

    private void jPasswordFieldKULLANICIŞİFRESİActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldKULLANICIŞİFRESİActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldKULLANICIŞİFRESİActionPerformed

    private void LabelKULLANICIGIRISALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelKULLANICIGIRISALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelKULLANICIGIRISALActionPerformed

    private void gerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerialActionPerformed
       otomasyonGirisekrani gerial =new otomasyonGirisekrani();
gerial.setVisible(true);
      dispose();
    }//GEN-LAST:event_gerialActionPerformed
int hak =3;
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
            java.util.logging.Logger.getLogger(yoneticigirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yoneticigirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yoneticigirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yoneticigirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yoneticigirisekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LabelKULLANICIGIRISAL;
    private javax.swing.JToggleButton gerial;
    private javax.swing.JButton jButtonYÖNETICIGIRIS;
    private javax.swing.JLabel jLabelKULLANICIADI;
    private javax.swing.JLabel jLabelKULLANICIŞIFRESI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldKULLANICIŞİFRESİ;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
