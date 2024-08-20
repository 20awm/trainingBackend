package day3.Interfaces;

import java.util.LinkedList;

public interface Perpustakaan {

    int maxBookCapacity = 5;
    String errorMsg = "Total buku sudah melebihi kapasitas maksimum yaitu " + maxBookCapacity;

    int totalBook();
    LinkedList<String> listBook();

    static void welcomeMessage() {
        System.out.println("Selamat Datang di Perpustakaan");
        libraryLocation();

    }
    static void libraryLocation() {
        System.out.println("Lokasi: Jakarta, Indonesia");
    }
}
