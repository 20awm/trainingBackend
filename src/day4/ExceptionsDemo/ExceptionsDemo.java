package day4.ExceptionsDemo;

class IndexSample {
    int[] a = new int[3];
}
public class ExceptionsDemo {
    public static void main(String[] args) {

//        int[] a = new int[3];

        IndexSample idx = new IndexSample();

//        System.out.println("Index Sample A: " + idx.a[2]);

        String b = "Eksekusi Berlanjut";
        int c = 3;

        try {
            cekMaxIndex(idx.a, 3);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            throw new ArrayIndexOutOfBoundsException("Index melebihi batas maksimum");
        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        try {
            setBalance(-3);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
//            throw new IllegalArgumentException("Balance cannot be negative");
        }

        System.out.println(b);
    }

    public static void cekMaxIndex(int[] array, int index) {
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index melebihi batas maksimum: " + index);
        }
    }

    public static void setBalance(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative: " + balance);
        }
        System.out.println("Balance is set to: " + balance);
    }

}
