package OOPS1.inheritancepolymorphism;

public class User {
    String name;
    int age;

    protected User(String name) {
        this.name = name;
        System.out.println("User Constructor called");
    }
    protected User(String name, int age){
        this.name = name;
        this.age = age;
    }
}
