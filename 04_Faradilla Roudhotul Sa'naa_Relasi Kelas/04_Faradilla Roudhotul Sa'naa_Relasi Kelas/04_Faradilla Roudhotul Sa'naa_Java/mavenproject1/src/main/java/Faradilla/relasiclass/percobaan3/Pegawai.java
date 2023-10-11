    package Faradilla.relasiclass.percobaan3;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    
    Pegawai() {
        
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void getNip() {
        this.nip = nip;
    }
    
    public void getNama() {
        this.nama = nama;
    }
    
    public String info() {
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
