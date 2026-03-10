package SOLID.LLD2.solidprinciples.solidbirddesign;

public class Sparrow extends Bird implements Flyable, Dancing{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is make sound");
    }

    @Override
    public void dance() {
        System.out.println("Sparrow is Dancing");
    }
}
