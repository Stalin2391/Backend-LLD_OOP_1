package OOPS.LLD1.ProducerConsumer;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{

    Queue<Object> store;
    int maxSize;
    String name;
    Lock lock;

    Consumer(Queue<Object> store, int maxSize, String name, Lock lock){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        while(true){
            lock.lock();
            try{
                if(store.size() > 0){
                    System.out.println(name + "Consuming the shirt. Size of the shirt is " + store.size());
                    store.remove();
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
