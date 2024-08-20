package day2.Employee;

public class Employee {
    private String name;


    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
        present();
    }

    public void present() {
        System.out.println(name + " hadir.");
    }
}
