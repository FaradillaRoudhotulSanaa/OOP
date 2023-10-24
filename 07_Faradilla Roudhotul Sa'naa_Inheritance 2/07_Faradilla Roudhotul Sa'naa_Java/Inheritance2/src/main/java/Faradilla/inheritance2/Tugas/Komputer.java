package Faradilla.inheritance2.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;
    
    public Komputer() {
        
    }
    
    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData() {
        System.out.println("Merk            : " + merk);
        System.out.println("Kec Prosesor    : " + kecProsesor + " Hz");
        System.out.println("Size Memory     : " + sizeMemory + " GB");
        System.out.println("Jenis Prosesor  : " + jnsProsesor);
    }
}
