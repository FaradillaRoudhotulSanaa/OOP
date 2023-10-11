package Faradilla.relasiclass.percobaan1;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Processor {
    private String merk;
    private double cache;
    
    Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    Processor() {
        
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setCache(double cache) {
        this.cache = cache;
    }
    
    public void getMerk(String merk) {
        this.merk = merk;
    }
    
    public void getCache(double cache) {
        this.cache = cache;
    }
    
    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
