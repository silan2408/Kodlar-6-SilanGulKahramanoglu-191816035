package degerler;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ÇALIŞANLAR {
    private String ID;
    private String AD;
    private String SOYAD;
    private String MAAŞ;

    public ÇALIŞANLAR(String ID, String AD, String SOYAD, String MAAŞ) {
        this.ID = ID;
        this.AD = AD;
        this.SOYAD = SOYAD;
        this.MAAŞ = MAAŞ;
    }

   

    public String getID() {
        return ID;
    }

    public String getAD() {
        return AD;
    }

    public String getSOYAD() {
        return SOYAD;
    }

    public String getMAAŞ() {
        return MAAŞ;
    }
  
   
}
