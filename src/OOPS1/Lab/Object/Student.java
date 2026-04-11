package OOPS1.Lab.Object;

public class Student {
    private String name;
    private int age;
    private double psp;
    private double avgPsp;
    Student(){}

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.avgPsp = student.avgPsp;
    }

}
