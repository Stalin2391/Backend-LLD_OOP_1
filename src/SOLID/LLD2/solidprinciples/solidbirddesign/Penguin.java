package SOLID.LLD2.solidprinciples.solidbirddesign;

public class Penguin extends Bird implements Dancing{
    @Override
    void makeSound() {
        System.out.println("Penguin is make Sound");
    }

    @Override
    public void dance() {
        System.out.println("Penguin is Dancing");
    }
}
