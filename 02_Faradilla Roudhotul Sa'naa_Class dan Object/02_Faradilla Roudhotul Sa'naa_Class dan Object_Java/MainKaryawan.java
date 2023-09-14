package Percobaan1JS2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainKaryawan {
    public static void main(String[] args) {
        
        System.out.println("Menampilkan Biodata dan Gaji Karyawan");
        System.out.println("-------------------------------------");
        
        Karyawan kar1 = new Karyawan();
        kar1.id = "KAR2C";
        kar1.nama = "Faradilla Roudhotul Sa'naa";
        kar1.jenisKelamin = "Perempuan";
        kar1.jabatan = "Staff";
        kar1.gajiPokok = 3500000;
        kar1.tunjangan = 1000000;
        kar1.tampilData();
        kar1.totalGaji();
        
        System.out.println("-------------------------------------");
        Karyawan kar2 = new Karyawan();
        kar2.id = "KAR2A";
        kar2.nama = "Amanda Vanika Putri";
        kar2.jenisKelamin = "Perempuan";
        kar2.jabatan = "Manager";
        kar2.gajiPokok = 5000000;
        kar2.tunjangan = 1500000;
        kar2.tampilData();
        kar2.totalGaji();
        
        System.out.println("-------------------------------------");
    }
}
