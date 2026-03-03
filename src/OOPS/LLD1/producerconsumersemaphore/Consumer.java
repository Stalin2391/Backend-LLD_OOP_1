package OOPS.LLD1.producerconsumersemaphore;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{

    Queue<Object> store;
    int maxSize;
    String name;
    Semaphore consumerS;
    Semaphore producerS;

    Consumer(Queue<Object> store, int maxSize, String name, Semaphore producerS, Semaphore consumerS){
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
                consumerS.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + "Consuming the shirt. Size of the shirt is " + store.size());
            store.remove();
            producerS.release();
        }
    }
}
