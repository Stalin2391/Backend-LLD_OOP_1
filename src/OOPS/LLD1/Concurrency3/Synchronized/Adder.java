package OOPS.LLD1.Concurrency3.Synchronized;

public class Adder implements Runnable {
    private Count count;


    Adder(Count count){
        this.count = count;
    }
    @Override
    public void run(){
        AddNumber();
    }

    public void AddNumber() {
        for (int i = 1; i <= 10000000; i++){
            synchronized (Count.class){ // Similar to lock()
                count.value += i;
            } // Similar to unlock()
        }
    }

}
