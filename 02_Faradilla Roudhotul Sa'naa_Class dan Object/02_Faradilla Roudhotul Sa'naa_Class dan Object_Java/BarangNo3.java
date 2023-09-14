package Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class BarangNo3 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - ((diskon * hargaDasar) / 100));
        return hargaJual;
    }
    
    public void tampilData() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp. " + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
    }
}
