package OOPS.LLD1.Concurrency3.Mutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

    Subtractor(Count count, Lock lock){

        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        SubtractNUmber();
    }

    public void SubtractNUmber(){
        for(int i = 1; i<= 100; i++){
            lock.lock();
            count.value -= i; //Critical Section
            lock.unlock();
        }
    }
}
