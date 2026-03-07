package OOPS.LLD1.streansandlambda;

public class Client {
    public static void main(String[] args) {
//        SampleInterface sampleInterface = new SampleInterface();
//        Runnable runnable = new HelloWorldPrinter();

//        Thread thread = new Thread(runnable);  or
        System.out.println("Main Thread : " + Thread.currentThread().getName());
        Thread thread = new Thread(new HelloWorldPrinter());
        thread.start();
    }
}
