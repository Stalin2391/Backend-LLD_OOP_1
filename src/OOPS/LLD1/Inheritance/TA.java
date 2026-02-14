package OOPS.LLD1.Inheritance;

public class TA extends User {
    int taId;
    TA(String name, String password, String email, int taId){
        super(name, password, email);
        this.taId = taId;
    }
}
