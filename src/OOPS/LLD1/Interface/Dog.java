package OOPS.LLD1.Interface;

public class Dog implements Animal{

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is waking");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
