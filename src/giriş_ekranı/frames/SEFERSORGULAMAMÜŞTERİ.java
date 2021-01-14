
package giriş_ekranı.frames;

import degerler.BiletKayıt;
import giriş_ekranı.frames.seferbillgileriekranı;
import giriş_ekranı.BiletAlmaIslem;
import degerler.BiletKayıt;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author silan
 */
public class SEFERSORGULAMAMÜŞTERİ extends javax.swing.JFrame {
DefaultTableModel model;
BiletAlmaIslem İSLEMLER = new BiletAlmaIslem();
public SEFERSORGULAMAMÜŞTERİ() {
        initComponents();
         model = (DefaultTableModel) txtTABLOMODEL.getModel();
 BILETSIRALA();
    }
public void BILETSIRALA()
{    
    model.setRowCount(0);   
   ArrayList<BiletKayıt> bilet = new ArrayList<BiletKayıt>(); 
   
   bilet = İSLEMLER.BİLETBİLGİLERİ();
  
    if(bilet != null)
    {
        for (BiletKayıt biletler :bilet)
        {
            Object[] ekleme =  {biletler.getID(),biletler.getAD(),biletler.getSOYAD(),biletler.getTC(),biletler.getCEP(),biletler.getMAIL(),biletler.getGIDISTARIHI()};
            model.addRow(ekleme);
        }
    }
    
}   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        arama = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtguncelle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTABLOMODEL = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        arama_soyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        arama_mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        arama_cep = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        arama_tarih = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        arama_tc = new javax.swing.JTextField();
        arama_ad = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("AD :");

        arama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramaActionPerformed(evt);
            }
        });
        arama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaKeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GERİYE DÖN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 204));
        jButton3.setText("İPTAL ET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtguncelle.setBackground(new java.awt.Color(255, 102, 204));
        txtguncelle.setText("GÜNCELLE");
        txtguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtguncelleActionPerformed(evt);
            }
        });

        txtTABLOMODEL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AD", "SOYAD", "TC", "CEP", "MAIL", "GIDISTARİHİ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        txtTABLOMODEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTABLOMODELMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtTABLOMODEL);
        if (txtTABLOMODEL.getColumnModel().getColumnCount() > 0) {
            txtTABLOMODEL.getColumnModel().getColumn(0).setResizable(false);
            txtTABLOMODEL.getColumnModel().getColumn(1).setResizable(false);
            txtTABLOMODEL.getColumnModel().getColumn(2).setResizable(false);
            txtTABLOMODEL.getColumnModel().getColumn(3).setResizable(false);
            txtTABLOMODEL.getColumnModel().getColumn(4).setResizable(false);
            txtTABLOMODEL.getColumnModel().getColumn(5).setResizable(false);
            txtTABLOMODEL.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel2.setText("SOYAD :");

        arama_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_soyadActionPerformed(evt);
            }
        });
        arama_soyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_soyadKeyReleased(evt);
            }
        });

        jLabel3.setText("CEP  :");

        arama_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_mailActionPerformed(evt);
            }
        });
        arama_mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_mailKeyReleased(evt);
            }
        });

        jLabel4.setText("TARİH :");

        arama_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_cepActionPerformed(evt);
            }
        });
        arama_cep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cepKeyReleased(evt);
            }
        });

        jLabel5.setText("MAIL :");

        arama_tarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_tarihActionPerformed(evt);
            }
        });
        arama_tarih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_tarihKeyReleased(evt);
            }
        });

        jLabel6.setText("TC :");

        arama_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_tcActionPerformed(evt);
            }
        });
        arama_tc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_tcKeyReleased(evt);
            }
        });

        arama_ad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        arama_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_adActionPerformed(evt);
            }
        });

        mesaj_yazisi.setEditable(false);
        mesaj_yazisi.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("ara(isim)");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(txtguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arama_ad, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(arama_soyad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arama_tc, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(arama_cep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arama_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(arama_tarih))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(arama, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arama_ad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(arama_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arama_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(arama_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arama_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(arama_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txtguncelle))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aramaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        seferbillgileriekranı gerial7 =new seferbillgileriekranı();
        gerial7.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mesaj_yazisi.setText(" ");
        int selectdrow = txtTABLOMODEL.getSelectedRow();
        if(selectdrow == -1)
        {
            if (model.getRowCount()== 0)
            {
                mesaj_yazisi.setText("bilet listesi şuan da boş");
            }
            else{
                mesaj_yazisi.setText("Lütfen silinicek bileti seçin");
            }
        }
        else {
            int ID =  (int) model.getValueAt(selectdrow, 0);
            İSLEMLER.musterisil(ID);
            BILETSIRALA();
           mesaj_yazisi.setText("biletiniz silindi");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtguncelleActionPerformed
   String AD = arama_ad.getText();
   String SOYAD = arama_soyad.getText();
   String TC = arama_tc.getText();
   String CEP = arama_cep.getText();
   String MAIL = arama_mail.getText();
   String GIDISTARIHI = arama_tarih.getText();
    int selectedrow =  txtTABLOMODEL.getSelectedRow();
    if (selectedrow == -1)
    {
        if(model.getRowCount() ==0)
        {
            mesaj_yazisi.setText("müşteriler şu anda boş");
        }
        else{
            mesaj_yazisi.setText("lütfen güncellemek için bir bilet seçin.");
            
        }      
    }
    else{
        int ID =(int) model.getValueAt(selectedrow, 0);
       İSLEMLER.musteriguncelle(ID,AD,SOYAD,TC,CEP,MAIL,GIDISTARIHI);
       
       BILETSIRALA();
   
       mesaj_yazisi.setText("Müşteri tablosu güncellendi.");
    }
    }//GEN-LAST:event_txtguncelleActionPerformed
public void dinamikAra(String ara)
{
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
    txtTABLOMODEL.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(ara));
            
}
    private void aramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaKeyReleased
       String ara =  arama.getText();
       dinamikAra(ara);
    }//GEN-LAST:event_aramaKeyReleased

    private void txtTABLOMODELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTABLOMODELMouseClicked
    int selectdrow = txtTABLOMODEL.getSelectedRow();
    
    arama_ad.setText(model.getValueAt(selectdrow, 1).toString());
    arama_soyad.setText(model.getValueAt(selectdrow, 2).toString());
    arama_tc.setText(model.getValueAt(selectdrow, 3).toString());
    arama_cep.setText(model.getValueAt(selectdrow, 4).toString());
    arama_mail.setText(model.getValueAt(selectdrow, 5).toString());
    arama_tarih.setText(model.getValueAt(selectdrow, 6).toString());

    
    }//GEN-LAST:event_txtTABLOMODELMouseClicked

    private void arama_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_soyadActionPerformed

    private void arama_soyadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_soyadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_soyadKeyReleased

    private void arama_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_mailActionPerformed

    private void arama_mailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_mailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_mailKeyReleased

    private void arama_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_cepActionPerformed

    private void arama_cepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cepKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_cepKeyReleased

    private void arama_tarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_tarihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_tarihActionPerformed

    private void arama_tarihKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_tarihKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_tarihKeyReleased

    private void arama_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_tcActionPerformed

    private void arama_tcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_tcKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_tcKeyReleased

    private void arama_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_adActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEFERSORGULAMAMÜŞTERİ().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama;
    private javax.swing.JTextField arama_ad;
    private javax.swing.JTextField arama_cep;
    private javax.swing.JTextField arama_mail;
    private javax.swing.JTextField arama_soyad;
    private javax.swing.JTextField arama_tarih;
    private javax.swing.JTextField arama_tc;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mesaj_yazisi;
    private javax.swing.JTable txtTABLOMODEL;
    private javax.swing.JButton txtguncelle;
    // End of variables declaration//GEN-END:variables
}
