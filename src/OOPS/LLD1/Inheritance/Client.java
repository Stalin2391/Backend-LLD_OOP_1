package OOPS.LLD1.Inheritance;

public class Client {
    public static void main(String[] args) {
        // A Child Cass is Inherit properties & Behaviours from Parent Class
        // IS A Relationship
        // Code Reusability

        Student student = new Student("Student","password", "student@email.com", 344);
        TA ta = new TA("TA","password", "ta@email.com", 73);
        Mentor mentor = new Mentor("Mentor","password", "mentor@email.com", 33);
        student.login();
        ta.login();
        mentor.login();
    }
}
