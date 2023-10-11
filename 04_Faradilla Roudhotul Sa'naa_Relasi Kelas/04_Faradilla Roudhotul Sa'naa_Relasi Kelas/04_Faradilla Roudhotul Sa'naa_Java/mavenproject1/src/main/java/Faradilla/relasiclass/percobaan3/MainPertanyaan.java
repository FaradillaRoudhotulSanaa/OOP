package Faradilla.relasiclass.percobaan3;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("98765", "Faradilla Roudhotul Sa'naa");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
