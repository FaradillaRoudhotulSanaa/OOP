package Faradilla.inheritance.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainTugas {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(10);

        Dosen dos1 = new Dosen("123456", "Faradilla", "Jl. Bunga Pinang");
        dos1.setSKS(4);

        Dosen dos2 = new Dosen("060600", "Lee Haechan", "Jl. Hongdae");
        dos2.setSKS(8);

        daftarGaji.addPegawai(dos1);
        daftarGaji.addPegawai(dos2);

        daftarGaji.printSemuaGaji();
    }
}
