package Faradilla.kuis2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Main {
    public static void main(String[] args) {
        //objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Faradilla Roudhotul Sa'naa", "2241720205", 93);
        Mahasiswa mhs2 = new Mahasiswa("Lee Haechan", "2241720060", 90);

        //objek MataKuliah
        MataKuliah mk1 = new MataKuliah("Matematika", 4, 92);
        MataKuliah mk2 = new MataKuliah("Kimia", 3, 95);

        //perwalian
        Perwalian p = new Perwalian();
        p.tambahMhs(mhs1);
        p.tambahMhs(mhs2);

        p.tambahMatkul(mk1);
        p.tambahMatkul(mk2);

        //cetak info
        p.tampilData();
    }
}
