package OOPS.LLD1.Concurrency3.SynchronizedMethod;

public class Count {
    private int value;

    public synchronized void addValue(int x){
        this.value += x;
    }
    public synchronized void subtractValue(int x){
        this.value -= x;
    }
    public int getValue(){
        return value;
    }
}
