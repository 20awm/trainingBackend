package day3.Interfaces;

public class Main {
    public static void main(String[] args) {
        DataBuku dataBuku = new DataBuku();
        BukuDipinjam bukuDipinjam= new BukuDipinjam();

        // Implementation One
//        System.out.println("Daftar Buku disumbangkan ke Perpustakaan: " + dataBuku.listBook());
//        System.out.println("Jumlah Buku disumbangkan ke Perpustakaan: " + dataBuku.totalBook());
//        System.out.println("__________________________");
//        System.out.println("Daftar Buku dipinjam dari Perpustakaan: " + bukuDipinjam.listBook());
//        System.out.println("Jumlah Buku dipinjam dari Perpustakaan: " + bukuDipinjam.totalBook());

//        dataBuku.welcomeMessage();
        Perpustakaan.welcomeMessage();
        System.out.println("__________________________");
        System.out.println("Admin Perpustakaan: " + dataBuku.adminPerpustakaan());
        System.out.println("__________________________");
//
//        // Implementation Two
        Perpustakaan obj;
        Perpustakaan objTwo;
//
        obj = dataBuku;
        objTwo = bukuDipinjam;
//
        System.out.println("Daftar Buku disumbangkan ke Perpustakaan: " + obj.listBook());
        System.out.println("Jumlah Buku disumbangkan ke Perpustakaan: " + obj.totalBook());
        System.out.println("__________________________");
        System.out.println("Daftar Buku dipinjam dari Perpustakaan: " + objTwo.listBook());
        System.out.println("Jumlah Buku dipinjam dari Perpustakaan: " + objTwo.totalBook());
    }
}
