package OOPS.LLD1.Inheritance;

public class User {
    String name;
    String password;
    String email;

//    User(){
//
//    }
    User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }
    void login(){
        System.out.println(name + " LoggedIn Successfully");
    }
}
