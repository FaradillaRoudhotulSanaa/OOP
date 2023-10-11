package Faradilla.relasiclass.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Perawat {
    private String nama;
    
    Perawat() {
        
    }
    
    Perawat(String nama) {
        this.nama = nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void getNama() {
        this.nama = nama;
    }
    
    public String info() {
        String info = "";
        info += "Nama perawat yang menangani " + nama;
        return info;
    }
}
