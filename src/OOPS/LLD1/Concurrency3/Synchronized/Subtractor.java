package OOPS.LLD1.Concurrency3.Synchronized;

public class Subtractor implements Runnable{
    private Count count;

    Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run(){
        SubtractNumber();
    }

    public void SubtractNumber() {
        for (int i = 1; i <= 10000000; i++){
            synchronized (Count.class){ // ONE lock for entire class
                count.value -= i;
            }
            //or
//           synchronized (count){ // count Object
//               count.value -= i;
//           }

            // Either you can use based on your requirements.
        }
    }
}
