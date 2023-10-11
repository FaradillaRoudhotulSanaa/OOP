package Faradilla.relasiclass.percobaan3;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }
    
    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }
    
    public void getNama() {
        this.nama = nama;
    }
    
    public void getKelas() {
        this.kelas = kelas;
    }
    
    public void getMasinis() {
        this.masinis = masinis;
    }
    
    public void getAsisten() {
        this.asisten = asisten;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis + "\n";
        info += "Asisten: " + this.asisten + "\n";
        return info;
    }
}
