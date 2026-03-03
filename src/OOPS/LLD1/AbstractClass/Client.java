package OOPS.LLD1.AbstractClass;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Dog("Husky", 5);
        Animal animal1 = new Dog("Tommy", 3);
        System.out.println(animal.age);
        System.out.println(animal.name);
        animal1.display();
        animal1.sound();
    }
}
