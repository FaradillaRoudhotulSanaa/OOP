package Faradilla.inheritance2.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainTugas {
    public static void main(String[] args) {
        
        Leptop l = new Leptop();
        l.merk = "Asus";
        l.kecProsesor = 2400;
        l.sizeMemory = 16;
        l.jnsProsesor = "Intel Core 9";
        l.jnsbatrei = "Li-Lon";
        System.out.println("--------- Data Leptop ---------");
        l.tampilLeptop();
        
        Pc p = new Pc();
        p.merk = "Lenovo";
        p.kecProsesor = 2400;
        p.sizeMemory = 16;
        p.jnsProsesor = "AMD";
        p.ukuranMonitor = 15;
        System.out.println("----------- Data PC -----------");
        p.tampilPc();
        
        Mac m = new Mac("Apple", 3000, 128,
                "M1", "Lithium-ion", "Gatekeeper");
        System.out.println("----------- Data Mac ----------");
        m.tampilMac();
        
        Windows w = new Windows("Micorsoft", 5000, 64, 
                "Ryzen", "Lithium-ion", "Windows Defender");
        System.out.println("--------- Data Windows --------");
        w.tampilWindows();
        
    }
}
