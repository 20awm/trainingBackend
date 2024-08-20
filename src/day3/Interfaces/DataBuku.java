package day3.Interfaces;

import java.util.LinkedList;

public class DataBuku implements Perpustakaan {
    LinkedList<String> buku;

    public DataBuku() {
        buku = new LinkedList<>();
    }

    @Override
    public LinkedList<String> listBook() {
        buku.add("Harry Potter 1");
        buku.add("Harry Potter 2");
        buku.add("Harry Potter 3");
        buku.add("Harry Potter 4");
        buku.add("Harry Potter 5");
        buku.add("Harry Potter 6");
        return buku;
    }

    @Override
    public int totalBook() {
        if (buku.size() > maxBookCapacity) {
            System.out.println(errorMsg);
        }
        return buku.size();
    }

    public String adminPerpustakaan() {
        String admin = "Alif Wisesa";
        return admin;
    }
}

