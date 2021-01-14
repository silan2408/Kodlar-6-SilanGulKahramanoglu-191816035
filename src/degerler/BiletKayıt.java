package degerler;

public class BiletKayıt {
     private int ID;
    private String AD;
    private String SOYAD;
    private String TC;
     private String CEP;
    private String MAIL;
    private String GIDISTARIHI;

    public BiletKayıt(int ID, String AD, String SOYAD, String TC, String CEP, String MAIL, String GIDISTARIHI) {
        this.ID = ID;
        this.AD = AD;
        this.SOYAD = SOYAD;
        this.TC = TC;
        this.CEP = CEP;
        this.MAIL = MAIL;
        this.GIDISTARIHI = GIDISTARIHI;
    }

    public int getID() {
        return ID;
    }

    public String getAD() {
        return AD;
    }

    public String getSOYAD() {
        return SOYAD;
    }

    public String getTC() {
        return TC;
    }

    public String getCEP() {
        return CEP;
    }

    public String getMAIL() {
        return MAIL;
    }

    public String getGIDISTARIHI() {
        return GIDISTARIHI;
    }



}
