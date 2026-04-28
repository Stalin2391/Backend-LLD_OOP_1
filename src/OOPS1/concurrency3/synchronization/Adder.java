package OOPS1.concurrency3.synchronization;

public class Adder implements Runnable{
    Counter counter;

    Adder(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 100; i++){
            counter.count += i;
        }
    }
}
