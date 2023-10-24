package Faradilla.inheritance2.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Leptop extends Komputer {
    public String jnsbatrei;
    
    public Leptop() {
        
    }
    
    public Leptop(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsbatrei = jnsBatrei;
    }
    
    public void tampilLeptop() {
        super.tampilData();
        System.out.println("Jenis Baterai   : " + jnsbatrei);
    }
}
