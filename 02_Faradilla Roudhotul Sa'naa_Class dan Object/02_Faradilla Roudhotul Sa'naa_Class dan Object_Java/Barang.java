package Percobaan1JS2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang() {
        System.out.println("Nama Barang     : " + namaBrg);
        System.out.println("Jenis Barang    : " + jenisBrg);
        System.out.println("Stok            : " + stok);
    }
    
    // method dengan argumen dan nilai nalik (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
