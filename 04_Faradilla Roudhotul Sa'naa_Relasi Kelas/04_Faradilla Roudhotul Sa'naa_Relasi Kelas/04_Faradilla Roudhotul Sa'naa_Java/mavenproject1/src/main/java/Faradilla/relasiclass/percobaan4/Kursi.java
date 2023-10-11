package Faradilla.relasiclass.percobaan4;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    
    // konstruktor kursi isinya nomor tok, gapake penumpang
    Kursi(String nomor) {
        this.nomor = nomor;
    }
    
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    
    public String getNomor() {
        return nomor;
    }
    
    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public Penumpang getPenumpang() {
        return penumpang;
    }
    
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
