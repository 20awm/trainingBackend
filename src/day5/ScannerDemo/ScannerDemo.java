package day5.ScannerDemo;
import day5.ScannerDemo.HomePage.HomePage;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RegisteredCustomers[] registeredCustomers = RegisteredCustomers.values();
        System.out.println("The following are registered customers data: " + Arrays.toString(registeredCustomers));

        System.out.print("Enter your username: ");
        String userName = sc.next();
        boolean isRegistered = false;
        String correctPassword = "";

        for (RegisteredCustomers regUser : registeredCustomers) {
            if (userName.equals(regUser.name())) {
                isRegistered = true;
                correctPassword = regUser.userPass;
                break;
            }
        }

        LoginSample.getCustomer().setuName(userName);

        if (isRegistered) {
            while (true) {
                System.out.print("Enter your password: ");
                String userPass = sc.next();
                if (userPass.equals(correctPassword)) {
                    LoginSample.getCustomer().setuPass(userPass);
                    System.out.println("Login successful!");
                    break;
                } else {
                    System.out.println("Incorrect password. Please try again.");
                }
            }
        } else {
            System.out.print("Enter your password: ");
            String userPass = sc.next();
            LoginSample.getCustomer().setuPass(userPass);

            System.out.print("Enter your address: ");
            String userAddress = sc.next();
            LoginSample.getCustomer().setuAddress(userAddress);
        }

        validateComplete();
    }

    public static void validateComplete() {
        String currentUser = LoginSample.getCustomer().getuName();
        System.out.println("\nWelcome to Tokobagus, " + currentUser + "!\nHappy Shopping!");
        HomePage.main();
    }
}