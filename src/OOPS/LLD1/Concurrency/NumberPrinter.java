package OOPS.LLD1.Concurrency;

public class NumberPrinter implements Runnable {
    private int number;

    NumberPrinter(int number){
        this.number = number;
    }
    public void run(){
        System.out.println(this.number + " - " + Thread.currentThread().getName());
    }
}
