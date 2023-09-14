package Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class PeminjamanNo1 {
    public String id;
    public String namaMember;
    public String namaGame;
    public int hargaDibayar;
    
    public void tampilDataPinjam() {
        System.out.println("ID              : " + id);
        System.out.println("Nama Member     : " + namaMember);
        System.out.println("Nama Game       : " + namaGame);
    }
    
    public int tampilTotalBiaya(int sewa, int harga) {
        return sewa * harga;
    }
}
