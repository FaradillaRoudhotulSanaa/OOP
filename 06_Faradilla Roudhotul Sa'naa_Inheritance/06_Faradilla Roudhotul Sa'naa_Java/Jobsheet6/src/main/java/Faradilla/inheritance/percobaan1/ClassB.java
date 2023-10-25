package Faradilla.inheritance.percobaan1;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class ClassB extends ClassA {
    public int z;
    
    public void getNilaiZ() {
        System.out.println("nilai z : " + z);
    }
    
    public void getJumlah() {
        System.out.println("jumlah : " + (x + y+ z));
    }
}

