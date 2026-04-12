package OOPS1.inheritancepolymorphism;

public class Mentor extends User{
    String company;

    Mentor(String name, int age, String company) {
        super(name, age);
        this.company = company;
        System.out.println("Mentors Constructor called");
    }

}
