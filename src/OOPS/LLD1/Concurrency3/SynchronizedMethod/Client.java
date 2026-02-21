package OOPS.LLD1.Concurrency3.SynchronizedMethod;

public class Client {
    public static void main(String[] args) throws InterruptedException {
            Count count = new Count();
            Adder adder = new Adder(count);
            Subtractor subtractor = new Subtractor(count);

            Thread t1 = new Thread(adder);
            Thread t2 = new Thread(subtractor);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println(count.getValue());

            // # Synchronized Method:
            // Only one synchronized method can be called on an object at a time.

    }
}
