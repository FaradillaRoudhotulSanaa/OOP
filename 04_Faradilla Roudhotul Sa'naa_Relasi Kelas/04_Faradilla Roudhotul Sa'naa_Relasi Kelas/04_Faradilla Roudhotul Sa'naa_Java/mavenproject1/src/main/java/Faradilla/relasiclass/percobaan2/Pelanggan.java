package Faradilla.relasiclass.percobaan2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    Pelanggan() {
        
    }
    
    public void getNama() {
        this.nama = nama;
    }
    
    public void getMobil() {
        this.mobil = mobil;
    }
    
    public void getSopir() {
        this.sopir = sopir;
    }
    
    public void getHari() {
        this.hari = hari;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
    
    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }
    
    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayasopir(hari);
    }
}
