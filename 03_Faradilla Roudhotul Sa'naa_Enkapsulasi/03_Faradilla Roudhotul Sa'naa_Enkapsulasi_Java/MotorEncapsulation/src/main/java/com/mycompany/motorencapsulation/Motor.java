package com.mycompany.motorencapsulation;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin() {
        kontakOn = true;
    }
    
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan() {
        if (kecepatan == 100) {
            System.out.println("Kecepatan tidak bisa bertambah karena telah mencapai batas!");
        } else {
            if (kontakOn == true) {
                kecepatan += 20;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
            }
        }
    }
    
    public void kurangKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
