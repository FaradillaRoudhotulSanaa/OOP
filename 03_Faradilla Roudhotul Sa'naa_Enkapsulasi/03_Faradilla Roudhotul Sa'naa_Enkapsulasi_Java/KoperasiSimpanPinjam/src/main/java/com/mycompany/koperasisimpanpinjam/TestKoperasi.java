package com.mycompany.koperasisimpanpinjam;
import java.util.Scanner;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class TestKoperasi {
    
    public static int jumlahPinjam, jumlahAngsur;
    public static int menu;
    public static char pilihan;
    
    public static void main(String[] args) {
        Scanner nana = new Scanner(System.in);
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan jumlah uang: ");
        jumlahPinjam = nana.nextInt();
        donny.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        
        do {
            System.out.println("----------------------------------------------");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.print("\nPilih menu: ");
            menu = nana.nextInt();
            System.out.println("----------------------------------------------");
            if (menu == 1) {
                System.out.print("Masukkan jumlah uang: ");
                jumlahPinjam = nana.nextInt();
                donny.pinjam(jumlahPinjam);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
            } else if (menu == 2) {
                System.out.print("Masukkan jumlah uang: ");
                jumlahAngsur = nana.nextInt();
                donny.angsur(jumlahAngsur);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
            }
            System.out.print("\nApakah anda ingin keluar [y/n]? ");
            pilihan = nana.next().charAt(0);
        } while (pilihan == 'n');
    }
}
