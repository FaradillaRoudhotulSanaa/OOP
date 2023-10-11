package Faradilla.relasiclass.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Pasien {
    private String nama;
    private String noPasien;
    private String alamat;
    
    Pasien(String nama, String noPasien, String alamat) {
        this.nama = nama;
        this.noPasien = noPasien;
        this.alamat = alamat;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNoPasien(String noPasien) {
        this.noPasien = noPasien;
    }
    
    public String getNoPasien() {
        return noPasien;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + nama + "\n";
        info += "Nomor Pasien: " + noPasien + "\n";
        info += "Alamat: " + alamat;
        return info;
    }
}
