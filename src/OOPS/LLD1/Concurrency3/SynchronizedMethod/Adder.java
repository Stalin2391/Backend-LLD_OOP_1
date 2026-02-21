package OOPS.LLD1.Concurrency3.SynchronizedMethod;

public class Adder implements Runnable{

    private Count count;

    Adder(Count count){
        this.count = count;
    }

    @Override
    public void run(){
        AddNumber();
    }

    public void AddNumber(){
        for(int i = 1; i <= 100; i++){
            count.addValue(i);
        }
    }
}
