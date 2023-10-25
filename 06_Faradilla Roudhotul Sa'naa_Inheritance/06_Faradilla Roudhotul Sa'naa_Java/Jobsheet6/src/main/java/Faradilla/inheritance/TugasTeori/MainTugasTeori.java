package Faradilla.inheritance.TugasTeori;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainTugasTeori {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(4.0f,6.0f);
        Lingkaran ling = new Lingkaran(7.0f);
        Segitiga se = new Segitiga(8.0f, 12.0f);
        
        System.out.println("-----------------------------------------");
        System.out.println("Menghitung Luas dan Keliling Bangun Datar");
        System.out.println("-----------------------------------------");
        System.out.println("1. Persegi Panjang");
        System.out.println("Panjang : " + pp.panjang + "    |   " + "Lebar : " + pp.lebar);
        System.out.println("Luas : " + pp.luas());
        System.out.println("Keliling : " + pp.keliling() + "\n");
        System.out.println("2. Lingkran");
        System.out.println("r : " + ling.r);
        System.out.println("Luas : " + ling.luas());
        System.out.println("Keliling : " + ling.keliling() + "\n");
        System.out.println("3. Segitiga");
        System.out.println("Alas : " + se.alas + "    |   " + "Tinggi : " + se.tinggi);
        System.out.println("Luas : " + se.luas());
        System.out.println("Keliling : " + se.keliling() + "\n"  
                + "Tidak dapat dihitung karena keliling segitiga harus menjumlahkan ketiga sisi.");
    }
}
