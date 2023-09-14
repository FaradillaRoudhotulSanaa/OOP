package Percobaan1JS2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        System.out.println("----------------------------");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Faradilla Roudhotul Sa'naa";
        mhs2.alamat = "Jl. Bunga Pinang Merah II No 9";
        mhs2.kelas = "2C";
        mhs2.tampilBiodata();
        
        System.out.println("----------------------------");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Hana Sugianto";
        mhs3.alamat = "Jl. Ikan Sepat No 10";
        mhs3.kelas = "2G";
        mhs3.tampilBiodata();
    }
}
