package SOLID.LLD2.solidprinciples;

public class Client {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();


        // SOLID Principles
        // S - Single Responsibility Principle - There should be only single reason to change.
        // O - Open / Closed Principle - Our code base should open for extension and closed for modification.
        // L - Liskov's Substitution Principle.
        // I - Interface Segregation Principle.
        // D - Dependency Inversion Principle.

    }
}
