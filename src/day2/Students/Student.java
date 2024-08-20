package day2.Students;

//public class Student {
//    public String name;
//    public int score;
//
//    public Student(String name, int score){
//        this.name = name;
//        this.score = score;
//        status(this.score);
//    }
//    public void status(int score) {
//        System.out.println();
//        System.out.println(score);
//        if (score > 70) {
//            System.out.println(name + " lulus.");
//        } else {
//            System.out.println(name + " belum lulus");
//        }
//    }
//}

public class Student {
    public static final String universityName =
            "Universitas Pamulang";
    public String name;
    public int score;

    public Student() {
        score = 5;
    }

    public void status() {
        System.out.println(
                name + " memiliki nilai " +score);
        System.out.println(universityName);
    }
}