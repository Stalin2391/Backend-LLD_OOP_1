package OOPS.LLD1.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    private Queue<Object> store;
    private int maxSize;
    private String name;
    private Lock lock;
    Semaphore consumerS;
    Semaphore producerS;

    Producer(Queue<Object> store, int maxSize, String name, Semaphore producerS, Semaphore consumerS){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerS = producerS;
        this.consumerS = consumerS;
    }

    @Override
    public void run() {
        while(true){
            try {
                producerS.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + "Producing the shirt. Size of the shirt is " + store.size());
            store.add(new Object());
            consumerS.release();
        }
    }
}
