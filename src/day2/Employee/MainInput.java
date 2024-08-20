import java.util.Scanner;

class ObjectEmployee {
    private String var1;
    private double var2;
    private int var3;

    // Constructor to initialize the object
    public ObjectEmployee(String var1, double var2, int var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    // Method to display the object's data
    public void displayData() {
        System.out.println("Name: " + var1);
        System.out.println("Salary: " + var2);
        System.out.println("Work Hours: " + var3);

    }
}

public class MainInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int numObjects = scanner.nextInt();

        ObjectEmployee[] objects = new ObjectEmployee[numObjects];

        for (int i = 0; i < numObjects; i++) {
            System.out.println("Enter details for object " + (i + 1) + ":");
            System.out.print("Nama: ");
            String var1 = scanner.next();

            System.out.print("Salary: ");
            double var2 = scanner.nextDouble();

            System.out.print("Work Hours: ");
            int var3 = Integer.parseInt(scanner.next());



            objects[i] = new ObjectEmployee(var1, var2, var3);
        }

        // Display data for all objects
        for (ObjectEmployee obj : objects) {
            System.out.println();
            obj.displayData();
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}