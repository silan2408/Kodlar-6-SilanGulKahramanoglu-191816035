
package degerler;

public class Masraflar {
    private String ARABANO;
    private String VERGİLER;
    private String YEMEKMAALİYET;
    private String ARABAAYLIKBAKIM;
    private String MAZOT;

    public String getARABANO() {
        return ARABANO;
    }

    public String getVERGİLER() {
        return VERGİLER;
    }

    public String getYEMEKMAALİYET() {
        return YEMEKMAALİYET;
    }

    public String getARABAAYLIKBAKIM() {
        return ARABAAYLIKBAKIM;
    }

    public String getMAZOT() {
        return MAZOT;
    }

    public Masraflar(String ARABANO, String VERGİLER, String YEMEKMAALİYET, String ARABAAYLIKBAKIM, String MAZOT) {
        this.ARABANO = ARABANO;
        this.VERGİLER = VERGİLER;
        this.YEMEKMAALİYET = YEMEKMAALİYET;
        this.ARABAAYLIKBAKIM = ARABAAYLIKBAKIM;
        this.MAZOT = MAZOT;
    }
    
}
