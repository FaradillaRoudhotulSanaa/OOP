package TugasOverloading;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Segitiga {
    private int sudut;
    
    public int sudutTotal(int sudut1) {
        this.sudut = 180 - sudut1;
        return this.sudut;
    }
    
    public int sudutTotal(int sudut1, int sudut2) {
        this.sudut = 180 - (sudut1 + sudut2);
        return this.sudut;
    }
    
    public int keliling(int sisi1, int sisi2, int sisi3) {
        return sisi1 + sisi2 + sisi3;
    }
    
    public double keliling(int sisi1, int sisi2) {
        double c = Math.sqrt(Math.pow(sisi1, 2) + Math.pow(sisi2, 2));
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga seg = new Segitiga();
        int totalSudut1 = seg.sudutTotal(60);
        System.out.println("Total Sudut 1 : " + totalSudut1);
        int totalSudut2 = seg.sudutTotal(30, 60);
        System.out.println("Total Sudut 2 : " + totalSudut2);
        int kelilingSeg1 = seg.keliling(7, 5, 6);
        System.out.println("Keliling Segitiga XYZ : " + kelilingSeg1);
        double kelilingSeg2 = seg.keliling(3, 4);
        System.out.println("Keliling Segitiga AB : " + kelilingSeg2);
    }
}
