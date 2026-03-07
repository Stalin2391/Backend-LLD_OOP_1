package OOPS.LLD1.streansandlambda;

public class Client {
    public static void main(String[] args) {
//        SampleInterface sampleInterface = new SampleInterface();
//        Runnable runnable = new HelloWorldPrinter();

//        Thread thread = new Thread(runnable);  or
        System.out.println("Main Thread : " + Thread.currentThread().getName());
        Thread thread = new Thread(new HelloWorldPrinter());
        thread.start();
        // Anonymous Class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World Runnable in Main Thread Name:" +  Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
