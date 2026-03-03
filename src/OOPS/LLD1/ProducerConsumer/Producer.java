package OOPS.LLD1.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    private Queue<Object> store;
    private int maxSize;
    private String name;
    private Lock lock;

    Producer(Queue<Object> store, int maxSize, String name, Lock lock) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                if (store.size() < maxSize) {
                    System.out.println(name + "Producing the shirt. Size of the shirt is " + store.size());
                    store.add(new Object());
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
