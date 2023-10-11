package Faradilla.relasiclass.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Ruangan {
    private String nomorRuang;
    private String namaRuang;
    private Pasien pasien;
    
    Ruangan() {
        
    }
    
    Ruangan(String nomorRuang, String namaRuang, Pasien pasien) {
        this.nomorRuang = nomorRuang;
        this.namaRuang = namaRuang;
        this.pasien = pasien;
    }
    
    public void setNomorRuang(String nomorRuang) {
        this.nomorRuang = nomorRuang;
    }
    
    public String getNomorRuang() {
        return nomorRuang;
    }
    
    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }
    
    public String getNamaRuang() {
        return namaRuang;
    }
    
    public String info() {
        String info = "";
        info += "Nomor: " + nomorRuang + "\n";
        info += "Ruangan: " + namaRuang + "\n";
        info += "Pasien: " + pasien.getNama();
        return info;
    }
}
