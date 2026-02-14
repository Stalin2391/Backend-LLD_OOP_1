package OOPS.LLD1.Thread;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        printer();
    }

    void printer(){
        System.out.println("Hello World, This is printed by :" + Thread.currentThread().getName());
    }
}
