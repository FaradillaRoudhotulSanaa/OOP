package Faradilla.inheritance2.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Windows extends Leptop {
    public String fitur;
    
    public Windows() {
        
    }
    
    public Windows(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    public void tampilWindows() {
        super.tampilLeptop();
        System.out.println("Fitur           : " + fitur);
    }
}
