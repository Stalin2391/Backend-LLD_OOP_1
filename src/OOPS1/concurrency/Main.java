package OOPS1.concurrency;

public class Main {
    public static void main(String[] args) {
        // Thread.currentThread().getName() --> gives the name of the current thread.
        // Java by default creates a thread named "main" to run the main method.
        System.out.println("Hello World! printed by thread : " + Thread.currentThread().getName());
        HelloWorldPrinter printer = new HelloWorldPrinter();
        Thread t1 = new Thread(printer);
        t1.start();
        Thread t2 = new Thread(printer);
        t2.start();
        Thread t3 = new Thread(printer);
        t3.start();
        Thread t4 = new Thread(printer);
        t4.start();
        Thread t5 = new Thread(printer);
        t5.start();

        System.out.println("Hello World! printed by thread : " + Thread.currentThread().getName());
    }
}



// Task: Create a thread that prints "Hello World!" and also prints the name of the thread that is executing it.
// Steps :
/*
    (Create a task that you want to execute in a separate thread)
    (Create a thread)
    (Assign the task to the thread)
    (Start the thread)
 */
// 1. Create a class that extends the Thread class.
// 2. Override the run() method to print "Hello World!" and the name of the thread.
// 3. In the main method, create an instance of the thread class and start the thread.