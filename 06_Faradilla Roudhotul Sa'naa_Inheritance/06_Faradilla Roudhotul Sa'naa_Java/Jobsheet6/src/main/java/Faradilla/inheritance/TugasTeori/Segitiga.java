package Faradilla.inheritance.TugasTeori;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Segitiga {
    public float alas;
    public float tinggi;
    
    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void setAlas(float alas) {
        this.alas = alas;
    }
    
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
    public float luas() {
        return 0.5f * alas * tinggi;
    }
    
    public float keliling() {
        return 0;
    }
}
