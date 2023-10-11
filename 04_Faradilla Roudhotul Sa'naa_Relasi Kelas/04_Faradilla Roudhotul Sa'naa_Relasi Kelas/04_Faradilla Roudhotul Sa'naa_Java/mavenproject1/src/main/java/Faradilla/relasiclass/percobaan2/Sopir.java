package Faradilla.relasiclass.percobaan2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Sopir {
    private String nama;
    private int biaya;
    
    Sopir() {
        
    }
    
    public void getNama(String nama) {
        this.nama = nama;
    }
    
    public void getBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setBiaya(int biaya) {
        this.nama = nama;
    }
    
    public int hitungBiayasopir(int hari) {
        return biaya * hari;
    }
}
