
package giriş_ekranı;

import degerler.BiletKayıt;
import giriş_ekranı.Interface;
import giriş_ekranı.Interface;
import giriş_ekranı.frames.yöneticigirdi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BiletAlmaIslem extends abstractclass implements Interface{
     public void biletekle(String AD,String SOYAD,String TC,String CEP,String MAIL,Date GIDISTARIHI)
           {
           String sorgu = "Insert Into biletbilgileri (AD, SOYAD, TC, CEP, MAIL, GIDISTARIHI)  VALUES (?,?,?,?,?,?)";
              
             DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
             java.sql.Date tarihSql =null;
               try{
                //   java.util.Date tarihJava = format.parse(GIDISTARIHI);
           tarihSql = new java.sql.Date(GIDISTARIHI.getTime());
                     preparedStatement = con.prepareStatement(sorgu);
                     preparedStatement.setString(1, AD);
                      preparedStatement.setString(2, SOYAD);
                      preparedStatement.setString(3, TC);
                       preparedStatement.setString(4, CEP);
                        preparedStatement.setString(5, MAIL);
                         preparedStatement.setDate(6, tarihSql);
                         preparedStatement.executeUpdate();
               } catch(SQLException ex){
                   Logger.getLogger(İSLEMLER.class.getName()).log(Level.SEVERE, null,ex);
               }
           }
           
                public  ArrayList<BiletKayıt> BİLETBİLGİLERİ()
    {
     
         ArrayList<BiletKayıt> cikti3 = new ArrayList<BiletKayıt>();
     
    try { 
         statement = con.createStatement();  
        String sorgu = "Select * from musteriler.biletbilgileri ";
     ResultSet rs = statement.executeQuery(sorgu);
     while(rs.next())
     {
     int  ID = rs.getInt("ID");
     String AD = rs.getString("AD");
     String SOYAD = rs.getString("SOYAD");
     String TC = rs.getString("TC");
   String CEP = rs.getString("CEP");
       String MAIL = rs.getString("MAIL");
   String GIDISTARIHI = rs.getString("GIDISTARİHİ");
   
      
      cikti3.add(new BiletKayıt(ID, AD, SOYAD, TC, CEP, MAIL, GIDISTARIHI));
     }
       return cikti3;
    } catch (SQLException ex) {
        Logger.getLogger(yöneticigirdi.class.getName()).log(Level.SEVERE, null, ex);
     return null;
    } 
    }
                
       public void musteriguncelle(int ID ,String yeni_AD,String yeni_SOYAD ,String yeni_TC,String yeni_CEP,String yeni_MAIL,String yeni_GIDISTARIHI)
        { 
            String sorgu = "Update musteriler.biletbilgileri set AD = ? ,SOYAD = ?, TC = ?, CEP = ?, MAIL = ? ,GIDISTARIHI = ? where ID =? ";
         try {
            
             
             preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setString(1, yeni_AD);
                   preparedStatement.setString(2,  yeni_SOYAD);
      preparedStatement.setString(3, yeni_TC);
                preparedStatement.setString(4, yeni_CEP);
            preparedStatement.setString(5, yeni_MAIL);
          preparedStatement.setString(6, yeni_GIDISTARIHI);
          preparedStatement.setInt(7, ID);
          preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(İSLEMLER.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
       public void musterisil(int  ID)
       { 
           String sorgu = "Delete from musteriler.biletbilgileri where ID = ?";
         try {
            
             preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setInt(1, ID);
             preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(İSLEMLER.class.getName()).log(Level.SEVERE, null, ex);
         }
       }      

    @Override
    public void INTERFACE() {
        System.out.println("bu bir interface metodur");
    }

    @Override
    void abstractmetod() {
        System.out.println("bu ovveride edilmiş abstract methodur.");
    }
}
