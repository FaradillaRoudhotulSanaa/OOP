package Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainPeminjaman {
    public static void main(String[] args) {
        
        PeminjamanNo1 pjm1 = new PeminjamanNo1();
        pjm1.id = "2A";
        pjm1.namaMember = "Amanda Vanika Putri";
        pjm1.namaGame = "Valorant";
        pjm1.tampilDataPinjam();
        System.out.println("Harga Dibayar   : " + pjm1.tampilTotalBiaya(5, 15000));

    }
}
