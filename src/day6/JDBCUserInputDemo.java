package day6;

import java.sql.*;
import java.util.Scanner;

public class JDBCUserInputDemo {
    String url = "jdbc:postgresql://localhost:5432/bootcamp";
    String username = "postgres";
    String password = "manage";

    public void addData() {
        String addSql = "INSERT INTO car_models (car_name, car_price, category, quantity) VALUES (?, ?, ?, ?)";
        Scanner scanner = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(addSql)) {

            System.out.println("Enter car name:");
            String carName = scanner.nextLine();
            System.out.println("Enter car price:");
            int carPrice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter car category:");
            String category = scanner.nextLine();
            System.out.println("Enter car quantity:");
            int quantity = scanner.nextInt();

            pst.setString(1, carName);
            pst.setInt(2, carPrice);
            pst.setString(3, category);
            pst.setInt(4, quantity);
            pst.executeUpdate();

            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateData() {
        String updateSql = "UPDATE car_models SET car_price = ?, quantity = ? WHERE car_name = ?";
        Scanner scanner = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(updateSql)) {

            System.out.println("Enter car name to update:");
            String carName = scanner.nextLine();
            System.out.println("Enter new car price:");
            int carPrice = scanner.nextInt();
            System.out.println("Enter new car quantity:");
            int quantity = scanner.nextInt();

            pst.setInt(1, carPrice);
            pst.setInt(2, quantity);
            pst.setString(3, carName);
            pst.executeUpdate();

            System.out.println("Data updated successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteData() {
        String deleteSql = "DELETE FROM car_models WHERE car_name = ?";
        Scanner scanner = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(deleteSql)) {

            System.out.println("Enter car name to delete:");
            String carName = scanner.nextLine();

            pst.setString(1, carName);
            pst.executeUpdate();

            System.out.println("Data deleted successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        JDBCUserInputDemo demo = new JDBCUserInputDemo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: \n1. Add Data \n2. Update Data \n3. Delete Data \n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    demo.addData();
                    break;
                case 2:
                    demo.updateData();
                    break;
                case 3:
                    demo.deleteData();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
