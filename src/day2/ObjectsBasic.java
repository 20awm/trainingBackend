package day2;

import day2.Students.Student;


public class ObjectsBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ardi";
        s1.score = 80;

        s1.status();

        Student s2 = new Student();
        s2.name = "Ardi";
        s2.score = 80;
        s2.status();

        Student s3 = new Student();
        s3.name = "Doni";
        s3.status();

//        Student s2 = new Student(
//                "Rani", 65);
    }
}
