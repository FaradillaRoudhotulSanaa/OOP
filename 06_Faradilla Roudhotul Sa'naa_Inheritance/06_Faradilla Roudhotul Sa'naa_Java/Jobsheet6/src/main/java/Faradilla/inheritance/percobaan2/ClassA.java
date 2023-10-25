package Faradilla.inheritance.percobaan2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class ClassA {
    public int x;
    public int y;
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void getNilai() {
        System.out.println("nilai x: " + x);
        System.out.println("nilai y : " + y);
    }
}
