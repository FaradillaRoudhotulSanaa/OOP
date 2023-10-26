package Faradilla.utspbo.soalJava;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Buku {
    public String ISBN;
    public String judul;
    public Penulis penulis;
    public int harga;
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setPenulis(Penulis penulis) {
        this.penulis = penulis; 
    }
    
    public Penulis getPenulis() {
        return penulis;
    }
}