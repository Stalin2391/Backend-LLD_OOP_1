package OOPS.LLD1.Inheritance;

public class Student extends User {

    int studentId;

    Student(String name, String password, String email, int studentId){
        super(name,password,email);
        this.studentId = studentId;
    }
}
