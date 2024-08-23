package day4.Equals;

public class EqualsDemo {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        if (a == b) {
            System.out.println("Kedua angka bernilai sama");
        } else {
            System.out.println("Kedua angka bernilai berbeda");
        }

        String s1 = new String("Manusia");
        String s2 = new String("Manusia");


        if (s1 == s2) {
            System.out.println("Kedua string sama");
        } else {
            System.out.println("Kedua string berbeda");
        }

    }
}
