package SOLID.LLD2.solidprinciples.solidbirddesign;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
//        sparrow.makeSound();
//        sparrow.fly();
//        sparrow.dance();

        List<Dancing> dancers = new ArrayList<>();
        dancers.add(new Penguin());
        dancers.add(new Sparrow());

        for(Dancing d : dancers) {
            d.dance();
        }


        List<Flyable> flyers = new ArrayList<>();
        flyers.add(new Sparrow());

        for(Flyable fly : flyers) {
            fly.fly();
        }



        // SOLID Principles
        // S - Single Responsibility Principle - There should be only single reason to change.
        // O - Open / Closed Principle - Our code base should open for extension and closed for modification.
        // L - Liskov's Substitution Principle.
        // I - Interface Segregation Principle.
        // D - Dependency Inversion Principle.
    }
}
