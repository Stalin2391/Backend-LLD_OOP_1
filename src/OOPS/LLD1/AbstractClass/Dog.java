package OOPS.LLD1.AbstractClass;

public class Dog extends Animal{

    Dog(String name, int age){
        super(name, age);
    }
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
