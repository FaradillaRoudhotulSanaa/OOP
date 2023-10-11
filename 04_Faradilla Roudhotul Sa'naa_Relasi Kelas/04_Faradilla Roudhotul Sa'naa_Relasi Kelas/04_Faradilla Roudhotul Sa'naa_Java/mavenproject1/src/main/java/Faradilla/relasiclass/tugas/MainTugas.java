package Faradilla.relasiclass.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainTugas {
    public static void main(String[] args) {   
        System.out.println("----------------------");
        System.out.println("Rumah Sakit Siti Hajar");
        System.out.println("----------------------");
        
        Pasien pasien1 = new Pasien("Faradilla Roudhotul S", "112", "Jl. Bunga Pinang Merah");
        Dokter dokter1 = new Dokter("Silfi Nazarina", "Jantung dan Paru-Paru");
        Perawat perawat1 = new Perawat("Kharisma Amalia");
        Ruangan ruang1 = new Ruangan("1010", "Anggrek", pasien1);
        
        Pasien pasien2 = new Pasien("Aisha Rahma", "010", "Jl. Candi Panggung");
        Dokter dokter2 = new Dokter("Hana Sugianto", "Anak");
        Perawat perawat2 = new Perawat("Amanda Vanika");
        Ruangan ruang2 = new Ruangan("1200", "Mawar", pasien2);
        
        System.out.println("Data Pasien");
        System.out.println(pasien1.info() + "\n"); 
        System.out.println(pasien2.info());
        System.out.println("---------------------");
        System.out.println("Dokter yang menangani");
        System.out.println(dokter1.info() + "\n");  
        System.out.println(dokter2.info());
        System.out.println("---------------------");
        System.out.println("Perawat yang membantu");
        System.out.println(perawat1.info() + "\n");
        System.out.println(perawat2.info());
        System.out.println("---------------------");
        System.out.println("Ruangan:");
        System.out.println(ruang1.info() + "\n");
        System.out.println(ruang2.info());

    }
}
