package Faradilla.relasiclass.percobaan1;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    Laptop() {
        
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setProc(Processor proc) {
        this.proc = proc;
    }
    
    public void getMerk(String merk) {
        this.merk = merk;
    }
    
    public void getProc(Processor proc) {
        this.proc = proc;
    }
    
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
    
}
