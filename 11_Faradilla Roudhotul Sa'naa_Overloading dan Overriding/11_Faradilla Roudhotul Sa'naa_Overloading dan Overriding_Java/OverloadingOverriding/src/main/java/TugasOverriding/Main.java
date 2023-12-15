package TugasOverriding;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Main {
    public static void main(String[] args) {
        Manusia human1 = new Dosen();
        Manusia human2 = new Mahasiswa();
        
        human1.bernafas();
        human1.makan();
        human2.bernafas();
        human2.makan();
    }
}
