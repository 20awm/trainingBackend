package day5.ScannerDemo;

public class Customer {
    private String uName;
    private String uPass;
    private String uAddress;

    public Customer() {
        // Constructor can be empty or used for initialization if needed
    }

    public String getuName() {
        return uName;
    }

    public String getuPass() {
        return uPass;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuName(String uName) {
        this.uName = uName;
        checkInput();
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    private void checkInput() {
        System.out.println("__________________________________");
        System.out.println("What happens in the background...");
        System.out.println("New Registered User: " + uName);
        // System.out.println("New Registered User's Password: " + uPass);
        System.out.println("__________________________________");
    }
}
