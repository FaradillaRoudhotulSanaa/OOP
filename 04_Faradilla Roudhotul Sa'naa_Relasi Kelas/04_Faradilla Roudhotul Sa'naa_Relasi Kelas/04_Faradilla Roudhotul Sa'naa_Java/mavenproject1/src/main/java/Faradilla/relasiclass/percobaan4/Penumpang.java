package Faradilla.relasiclass.percobaan4;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKtp() {
        return ktp;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String info() {
        String info = "";
        info += "KTP: " + ktp + "\n"; //gaperlu pake this, tadi ada this.ktp
        info += "Nama: " + nama + "\n";
        return info;
    }
}
