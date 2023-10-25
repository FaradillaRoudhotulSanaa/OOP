package Faradilla.inheritance.TugasTeori;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Lingkaran {
    public float r;
    
    Lingkaran(float r) {
        this.r = r;
    }
    
    public void setR(float r) {
        this.r = r;
    }
    
    public float luas() {
        return 3.14f * r * r;
    }
    
    public float keliling() {
        return 2 * 3.14f * r;
    }
}
