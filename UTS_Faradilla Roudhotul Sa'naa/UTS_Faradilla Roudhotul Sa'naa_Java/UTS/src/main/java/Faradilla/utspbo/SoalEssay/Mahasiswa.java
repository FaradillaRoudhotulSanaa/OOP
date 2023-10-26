package Faradilla.utspbo.SoalEssay;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
    
    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void printMahasiswa() {
        System.out.println("NIM             : " +  nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("--------------------------------");
    }
    
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("         Data Mahasiswa         ");
        System.out.println("--------------------------------");
        Mahasiswa mahasiswa1 = new Mahasiswa("2241720205", "Faradilla R Sanaa", 
        "Jl. Bunga Pinang Merah II", 'P');
        mahasiswa1.printMahasiswa();
        
        Mahasiswa mahasiswa2 = new Mahasiswa("2241720073", "Azahra Salsabila", 
                "Jl. Bunga Coklat", 'P');
        mahasiswa2.printMahasiswa();
        
        Mahasiswa mahasiswa3 = new Mahasiswa("06062000", "Lee Donghyuck", 
                "Seoul", 'L');
        mahasiswa3.printMahasiswa();
    }
}
