package Faradilla.inheritance.TugasTeori;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class PersegiPanjang {
    public float panjang;
    public float lebar;
    
    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(float lebar) {
        this.lebar = lebar;
    }
    
    public float luas() {
        return panjang * lebar;
    }
    
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
