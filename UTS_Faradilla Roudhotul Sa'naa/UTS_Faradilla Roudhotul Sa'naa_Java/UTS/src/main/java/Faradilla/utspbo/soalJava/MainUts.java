package Faradilla.utspbo.soalJava;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class MainUts {
    public static void main(String[] args) {
        Penulis p1 = new Penulis();
        p1.setNama("Quinn");
        p1.setAlamat("Jakarta");
        
        Penulis p2 = new Penulis();
        p2.setNama("Giantara Alam");
        p2.setAlamat("Bandung");
        
        Buku b1 = new Buku();
        b1.setISBN("9786022204398");
        b1.setJudul("High Reputation");
        b1.setPenulis(p1);
        b1.setHarga(99000);
        
        Buku b2 = new Buku();
        b2.setISBN("9786022204350");
        b2.setJudul("My Youth");
        b2.setPenulis(p2);
        b2.setHarga(109000);
        
        System.out.println("--------------------------------------------");
        System.out.println("                 Data Buku");
        System.out.println("--------------------------------------------");
        System.out.println("ISBN            : " + b1.getISBN());
        System.out.println("Judul           : " + b1.getJudul());
        System.out.println("Nama Penulis    : " + b1.getPenulis().getNama());
        System.out.println("Alamat Penulis  : " + b1.getPenulis().getAlamat());
        System.out.println("Harga           : " + b1.getHarga());
        System.out.println("--------------------------------------------");
        System.out.println("ISBN            : " + b2.getISBN());
        System.out.println("Judul           : " + b2.getJudul());
        System.out.println("Nama Penulis    : " + b2.getPenulis().getNama());
        System.out.println("Alamat Penulis  : " + b2.getPenulis().getAlamat());
        System.out.println("Harga           : " + b2.getHarga());
        System.out.println("--------------------------------------------");
    }
}
