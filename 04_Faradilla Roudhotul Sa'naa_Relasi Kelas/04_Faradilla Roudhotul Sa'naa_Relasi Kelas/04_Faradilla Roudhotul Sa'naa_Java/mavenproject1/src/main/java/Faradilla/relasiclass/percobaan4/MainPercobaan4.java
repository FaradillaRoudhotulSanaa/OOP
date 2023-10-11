package Faradilla.relasiclass.percobaan4;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        
        Penumpang Budi = new Penumpang("98765", "Budi");
        gerbong.setPenumpang(Budi, 1);
        
        System.out.println(gerbong.info());
    }
}
