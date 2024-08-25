package day5.ScannerDemo;

public enum RegisteredCustomers {
    Bambang("111"),
    Bagus("222"),
    Bintang("333");

    final String userPass;

    RegisteredCustomers(String userPass) {
        this.userPass = userPass;
    }
}