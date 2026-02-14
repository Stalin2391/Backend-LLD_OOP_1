package OOPS.LLD1.Thread;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World, This is printed by :" + Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();
        Thread t2 = new Thread(helloWorldPrinter);
        t2.start();
        Thread t3 = new Thread(helloWorldPrinter);
        t3.start();
        Thread t4 = new Thread(helloWorldPrinter);
        t4.start();
        Thread t5 = new Thread(helloWorldPrinter);
        t5.start();

        System.out.println("hello " + Thread.currentThread().getName());

    }
}
