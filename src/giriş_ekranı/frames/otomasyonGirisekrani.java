/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giriş_ekranı.frames;

import giriş_ekranı.frames.seferbillgileriekranı;
import giriş_ekranı.frames.yoneticigirisekrani;
import giriş_ekranı.frames.otobusbilet;
import giriş_ekranı.frames.seferbillgileriekranı;





/**
 *
 * @author silan
 */
public class otomasyonGirisekrani extends javax.swing.JFrame {

    /**
     * Creates new form otomasyon
     */
    public otomasyonGirisekrani() {
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

        jPanel1 = new javax.swing.JPanel();
        btnbiletal = new javax.swing.JButton();
        btnseferbilgiler = new javax.swing.JButton();
        btnyoneticigirsi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SİSTEME HOŞ GELDİNİZ");
        setBackground(new java.awt.Color(255, 204, 255));
        setLocation(new java.awt.Point(450, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnbiletal.setBackground(new java.awt.Color(255, 102, 153));
        btnbiletal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnbiletal.setForeground(new java.awt.Color(51, 51, 51));
        btnbiletal.setLabel("BİLET AL");
        btnbiletal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbiletalActionPerformed(evt);
            }
        });

        btnseferbilgiler.setBackground(new java.awt.Color(255, 102, 153));
        btnseferbilgiler.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnseferbilgiler.setText("SEFER BİLGİLERİ");
        btnseferbilgiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseferbilgilerActionPerformed(evt);
            }
        });

        btnyoneticigirsi.setBackground(new java.awt.Color(255, 102, 153));
        btnyoneticigirsi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnyoneticigirsi.setText("YÖNETİCİ GİRİŞİ");
        btnyoneticigirsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyoneticigirsiActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\silan\\Downloads\\YENİ LOGO1.png")); // NOI18N
        jLabel1.setText("logo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnbiletal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnseferbilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnyoneticigirsi, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnbiletal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnseferbilgiler, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnyoneticigirsi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbiletalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbiletalActionPerformed
      otobusbilet ekran1 =new otobusbilet();
      ekran1.setVisible(true);
      dispose();
    }//GEN-LAST:event_btnbiletalActionPerformed

    private void btnyoneticigirsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyoneticigirsiActionPerformed
        yoneticigirisekrani ekran3 = new yoneticigirisekrani();
        ekran3.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnyoneticigirsiActionPerformed

    private void btnseferbilgilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseferbilgilerActionPerformed
        seferbillgileriekranı ekran2 =new seferbillgileriekranı();
      ekran2.setVisible(true);
      dispose();
    }//GEN-LAST:event_btnseferbilgilerActionPerformed

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
            java.util.logging.Logger.getLogger(otomasyonGirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(otomasyonGirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(otomasyonGirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(otomasyonGirisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new otomasyonGirisekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbiletal;
    private javax.swing.JButton btnseferbilgiler;
    private javax.swing.JButton btnyoneticigirsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
