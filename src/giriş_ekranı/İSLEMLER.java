package giriş_ekranı;

import degerler.ÇALIŞANLAR;
import degerler.SEFERLER;
import degerler.Masraflar;
import giriş_ekranı.Interface;
import giriş_ekranı.Interface;
import giriş_ekranı.frames.yöneticigirdi;
import giriş_ekranı.DbHelper;
import giriş_ekranı.DbHelper;
import giriş_ekranı.DbHelper;
import giriş_ekranı.DbHelper;
import giriş_ekranı.DbHelper;
import java.awt.color.ICC_ColorSpace;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class İSLEMLER extends abstractclass implements Interface{
    
 
    public  ArrayList<ÇALIŞANLAR> ÇALIŞANGETİR()
    {
     
         ArrayList<ÇALIŞANLAR> cikti = new ArrayList<>();
     
    try { 
         statement = con.createStatement();  
        String sorgu = "Select * from musteriler.çalişanmaaşlari ";
     ResultSet rs = statement.executeQuery(sorgu);
     while(rs.next())
     {
     String  ID = String.valueOf(rs.getInt("ID"));
     String AD = rs.getString("AD");
     String SOYAD = rs.getString("SOYAD");
     String MAAŞ = rs.getString("MAAŞ");
   
      
      cikti.add(new ÇALIŞANLAR(ID,AD,SOYAD,MAAŞ));
     }
       return cikti;
    } catch (SQLException ex) {
        Logger.getLogger(yöneticigirdi.class.getName()).log(Level.SEVERE, null, ex);
     return null;
    } 
        
    }
           public   ArrayList<SEFERLER> SEFERLERİGETİR()
    {
     
         ArrayList<SEFERLER> cikti4 = new ArrayList<SEFERLER>();
     
    try { 
        
         statement = con.createStatement();  
        String sorgu = "Select * from musteriler.çalişanlar ";
     ResultSet rs = statement.executeQuery(sorgu);
    
     while(rs.next())
     {
            String   ID = String.valueOf(rs.getInt("ID"));
     String ÇALIŞANAD = rs.getString("ÇALIŞANAD");
     String ÇALIŞANSOYAD = rs.getString("ÇALIŞANSOYAD");
     String ÇALIŞANSEFERİ = rs.getString("ÇALIŞANSEFERİ");
   String ÇALIŞANSEFERTARİHİ = rs.getString("ÇALIŞANSEFERTARİHİ");
   
      cikti4.add(new SEFERLER(ID,ÇALIŞANAD,ÇALIŞANSOYAD,ÇALIŞANSEFERİ,ÇALIŞANSEFERTARİHİ));
     }
       return cikti4;
    } catch (SQLException ex) {
        Logger.getLogger(yöneticigirdi.class.getName()).log(Level.SEVERE, null, ex);
     return null;
    } 
    }
          
    public  ArrayList<Masraflar> MASRAFLARGETİR()
    {
     
         ArrayList<Masraflar> cikti2 = new ArrayList<Masraflar>();
     
    try { 
         statement = con.createStatement();  
        String sorgu = "Select * from musteriler.masraflar ";
     ResultSet rs = statement.executeQuery(sorgu);
     while(rs.next())
     {
     String  ARABANO = String.valueOf(rs.getInt("ARABANO"));
     String VERGİLER = rs.getString("VERGİLER");
     String YEMEKMAALİYET = rs.getString("YEMEKMAALİYET");
     String ARABAAYLIKBAKIM = rs.getString("ARABAAYLIKBAKIM");
   String MAZOT = rs.getString("MAZOT");
   
      
      cikti2.add(new Masraflar(ARABANO,VERGİLER,YEMEKMAALİYET,ARABAAYLIKBAKIM,MAZOT ));
     }
       return cikti2;
    } catch (SQLException ex) {
        Logger.getLogger(yöneticigirdi.class.getName()).log(Level.SEVERE, null, ex);
     return null;
    } 
    }

    @Override
    public void INTERFACE() {
        System.out.println("bu bir ınterface methodur");
    }

    @Override
    void abstractmetod() {
        System.out.println("ovveride edilmiş abstract methodur.");
    }
   
  
}
