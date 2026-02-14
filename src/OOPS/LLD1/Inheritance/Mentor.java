package OOPS.LLD1.Inheritance;

public class Mentor extends User {
    int mentorId;
    Mentor(String name, String password, String email, int mentorId){
        super(name, password, email);
        this.mentorId = mentorId;
    }
}
