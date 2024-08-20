package day3.Interfaces;

import java.util.LinkedList;

public class BukuDipinjam implements Perpustakaan {

    LinkedList<String> buku;

    public BukuDipinjam() {
        buku = new LinkedList<>();
    }

    @Override
    public LinkedList<String> listBook() {
        buku.add("Game of Thrones");
        buku.add("Sword Art Online");
        return buku;
    }

    @Override
    public int totalBook() {
        return buku.size();
    }
}
