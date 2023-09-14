package Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainBarang {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("    Data Barang    ");
        System.out.println("-------------------");
        
        BarangNo3 brg1 = new BarangNo3();
        brg1.kode = "PNL2";
        brg1.namaBarang = "Pensil";
        brg1.hargaDasar = 5000;
        brg1.diskon = 15;
        int hargaJual = brg1.hitungHargaJual();
        brg1.tampilData();
        System.out.println("Harga Jual  : Rp. " + hargaJual);
        System.out.println("-------------------");
        BarangNo3 brg2 = new BarangNo3();
        brg2.kode = "LTP3";
        brg2.namaBarang = "Laptop";
        brg2.hargaDasar = 15000000;
        brg2.diskon = 17;
        int hargaJual2 = brg2.hitungHargaJual();
        brg2.tampilData();
        System.out.println("Harga Jual  : Rp. " + hargaJual);
    }
}
