package day3.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> mobil = new LinkedList<>();
        mobil.add("Mercedes-Benz G-Class");
        mobil.add("BMW M3");
        System.out.println("Mobil saya: " + mobil);

        ArrayList<String> motor = new ArrayList<>();
        motor.add("Honda CBR");
        motor.add("Yamaha NMAX");
        System.out.println("Motor Saya: " + motor);
    }
}

