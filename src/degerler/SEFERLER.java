
package degerler;

/**
 *
 * @author silan
 */
public class SEFERLER {
  private String ID;
    private String ÇALIŞANAD;
    private String ÇALIŞANSOYAD;
    private String ÇALIŞANSEFERİ;
    private String ÇALIŞANSEFERTARİHİ;

    public SEFERLER(String ID, String ÇALIŞANAD, String ÇALIŞANSOYAD, String ÇALIŞANSEFERİ, String ÇALIŞANSEFERTARİHİ) {
        this.ID = ID;
        this.ÇALIŞANAD = ÇALIŞANAD;
        this.ÇALIŞANSOYAD = ÇALIŞANSOYAD;
        this.ÇALIŞANSEFERİ = ÇALIŞANSEFERİ;
        this.ÇALIŞANSEFERTARİHİ = ÇALIŞANSEFERTARİHİ;
    }

    public String getID() {
        return ID;
    }

    public String getÇALIŞANAD() {
        return ÇALIŞANAD;
    }

    public String getÇALIŞANSOYAD() {
        return ÇALIŞANSOYAD;
    }

    public String getÇALIŞANSEFERİ() {
        return ÇALIŞANSEFERİ;
    }

    public String getÇALIŞANSEFERTARİHİ() {
        return ÇALIŞANSEFERTARİHİ;
    }
    
}
