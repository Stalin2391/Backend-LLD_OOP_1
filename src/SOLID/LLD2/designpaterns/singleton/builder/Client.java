package SOLID.LLD2.designpaterns.singleton.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Stalin")
                .setAge(35)
                .setBatch("LLD 2 Design Pattern")
                .setPsp(97.5)
                .setGradYear(2014)
                .build();

        System.out.println("DEBUG");
    }
}