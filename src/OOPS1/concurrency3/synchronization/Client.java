package OOPS1.concurrency3.synchronization;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Substractor substractor = new Substractor(counter);
        Adder adder = new Adder(counter);

        Thread t1 = new Thread(substractor);
        Thread t2 = new Thread(adder);

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println("The count value is: " + counter.count);
    }
}
