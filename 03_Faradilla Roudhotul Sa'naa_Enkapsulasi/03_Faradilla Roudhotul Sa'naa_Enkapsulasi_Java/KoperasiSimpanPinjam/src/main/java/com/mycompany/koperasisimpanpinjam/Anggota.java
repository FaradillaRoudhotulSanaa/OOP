package com.mycompany.koperasisimpanpinjam;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Anggota {
    private String nama;
    private String noKtp;
    private int limit, pinjaman;
    
    public Anggota(String noKtp, String nama, int limit) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limit = limit;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNoktp() {
        return noKtp;
    }
    
    public int getLimitPinjaman() {
        return limit;
    }
    
    public int getJumlahPinjam() {
        return pinjaman;
    }
    
    public void angsur(int uang) {
        if (pinjaman == 0) {
            System.out.println("Anda belum melakukan pinjaman");
        } else { 
            if (uang < (limit * 10 / 100)) {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            } else {
                pinjaman -= uang;
            }
        }
    }
    
    public void pinjam(int uang) {
        if (uang > limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            pinjaman += uang;
        }
    }
}
