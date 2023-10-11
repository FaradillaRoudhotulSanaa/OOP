package Faradilla.relasiclass.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Dokter {
    private String nama;
    private String spesialisasi;
    
    Dokter(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
    
    public String getSpesialisasi() {
        return spesialisasi;
    }
    
    public String info() {
        String info = "";
        info += "Nama Dokter: " + nama + "\n";
        info += "Spesialisasi: " + spesialisasi;
        return info;
    }
}
