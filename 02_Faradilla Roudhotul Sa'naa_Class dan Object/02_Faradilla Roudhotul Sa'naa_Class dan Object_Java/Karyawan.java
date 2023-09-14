package Percobaan1JS2;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Karyawan {
    public String id, nama, jenisKelamin, jabatan;
    public int gajiPokok, tunjangan, totalGaji;
    
    public void tampilData() {
        System.out.println("ID Karyawan     : " + id);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Jabatan         : " + jabatan);
    }
    
    public void totalGaji() {
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji      : " + totalGaji);
    }
}
