package OOPS.LLD1.Concurrency3;

public class Subtractor implements Runnable {
    private Count count;

    Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        SubtractNUmber();
    }

    public void SubtractNUmber(){
        for(int i = 1; i<= 100; i++){
            count.value -= i;
        }
    }
}
