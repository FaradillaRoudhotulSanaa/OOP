package Faradilla.inheritance.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int noPegawai;
    
    public DaftarGaji(int maxPegawai) {
        listPegawai = new Pegawai[maxPegawai];
        noPegawai = 0;
    }
    
    public void addPegawai(Pegawai pegawai) {
        if (noPegawai < listPegawai.length) {
            listPegawai[noPegawai] = pegawai;
            noPegawai++;
        } else {
            System.out.println("Daftar gaji penuh");
        }
    }
    
    public void printSemuaGaji() {
        System.out.println("Daftar Gaji Pegawai");
        System.out.println("-------------------");
        for (int i = 0; i < noPegawai; i++) {
            System.out.println("Nama : " + listPegawai[i].getNama());
            System.out.println("Gaji : " + listPegawai[i].getGaji());
            System.out.println();
        }
    }
}
