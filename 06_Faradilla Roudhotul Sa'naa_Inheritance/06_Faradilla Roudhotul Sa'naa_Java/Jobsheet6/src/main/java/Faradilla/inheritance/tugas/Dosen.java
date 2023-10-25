package Faradilla.inheritance.tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Dosen extends Pegawai {
    protected int jumlahSKS;
    protected int tarif_SKS = 250000;
    
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.jumlahSKS = 0;
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        return jumlahSKS * tarif_SKS;
    }
    
}
