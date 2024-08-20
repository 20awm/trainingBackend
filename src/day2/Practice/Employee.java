package day2.Practice;

public class Employee {
    public static final String corporateName = "Alibaba";
    String name;
    double salary;
    int workHours;
    String role;

    public Employee() {
    }

    public void whatRole() {
        System.out.println("Name: " + name);
        if(salary >= 3000 && salary <= 5000) {
            role = "Admin";
            System.out.println("Role : " + role);
        }
        System.out.println("Work Hours: " + workHours);
        System.out.println("Perusahaan: " + corporateName);
    }
}
