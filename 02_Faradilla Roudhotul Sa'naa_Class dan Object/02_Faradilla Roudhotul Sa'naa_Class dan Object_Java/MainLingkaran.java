package Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainLingkaran {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("--------------------------------------");
        LingkaranNo2 ling1 = new LingkaranNo2();
        ling1.r = 7;
        System.out.println("Jari - Jari         : " + ling1.r);
        System.out.println("Luas Lingkaran      : " + ling1.hitungLuas(7));
        System.out.println("Keliling Lingkaran  : " + ling1.hitungKeliling(7));
        System.out.println("--------------------------------------");
        LingkaranNo2 ling2 = new LingkaranNo2();
        ling2.r = 12;
        System.out.println("Jari - Jari         : " + ling2.r);
        System.out.println("Luas Lingkaran      : " + ling2.hitungLuas(12));
        System.out.println("Keliling Lingkaran  : " + ling2.hitungKeliling(12));
        System.out.println("--------------------------------------");
        LingkaranNo2 ling3 = new LingkaranNo2();
        ling3.r = 3.5;
        System.out.println("Jari - Jari         : " + ling3.r);
        System.out.println("Luas Lingkaran      : " + ling3.hitungLuas(3.5));
        System.out.println("Keliling Lingkaran  : " + ling3.hitungKeliling(3.5));
        System.out.println("--------------------------------------");
    }
}
