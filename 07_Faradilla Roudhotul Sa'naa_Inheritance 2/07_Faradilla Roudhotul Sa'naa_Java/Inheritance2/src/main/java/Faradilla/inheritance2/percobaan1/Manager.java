package Faradilla.inheritance2.percobaan1;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Manager extends Karyawan {
    public int tunjangan;
    
    public Manager() {
        
    }
    
    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       =" + tunjangan);
        System.out.println("Total Gaji      =" + (super.gaji + tunjangan));
    }
}
