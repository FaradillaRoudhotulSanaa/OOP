package Faradilla.utspbo.SoalEssay;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};

        int jumlah = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            jumlah += arrayInt[i].length;
        }

        System.out.println("Jumlah elemen dalam array: " + jumlah);
    }
}

