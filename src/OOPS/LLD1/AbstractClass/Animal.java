package OOPS.LLD1.AbstractClass;

public abstract class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract void eat();
    void walk() {
        System.out.println("Animal is Walking");
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    abstract void sound();

}
