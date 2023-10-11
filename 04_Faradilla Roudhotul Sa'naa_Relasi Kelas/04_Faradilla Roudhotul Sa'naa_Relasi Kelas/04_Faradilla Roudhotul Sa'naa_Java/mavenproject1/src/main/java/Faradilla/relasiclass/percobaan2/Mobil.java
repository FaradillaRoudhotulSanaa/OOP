package Faradilla.relasiclass.percobaan2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Mobil {
    private String merk;
    private int biaya;
    
    Mobil() {
        
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public void getMerk(String merk) {
        this.merk = merk;
    }
    
    public void getBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
