package OOPS.LLD1.Concurrency3;

import java.util.concurrent.ExecutionException;

public class Client {
    public static void main(String[] args) throws InterruptedException {
            Count count = new Count();
            Adder adder = new Adder(count);
            Subtractor subtractor = new Subtractor(count);

            Thread t1 = new Thread(adder);
            Thread t2 = new Thread(subtractor);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println(count.value);

            // # Synchronization:
            // When more threads are working on a shared data at the same time then it can lead to
            // Potentially wrong output.

            // # Critical Section:
            // Part of the code where shared data is getting updated. e.g...(count += i) <<<----t1 and t2.
            // When more than one threads are present inside the critical section at the same time.


            // # Race Condition:
            // When multiple threads are trying to enter inside the critical section at the same time
            // Then sync issue can happen

            // # Preemption:
            // CPU stops execution of a thread.
            // If a thread is preempted inside the critical section then synchronization issue can happen.



            // ---> Properties of good solution for synchronization problems.
            // <------------------------------------------------------------>

            // 1. Mutual Exclusion:
            // Only one thread should be allowed inside the critical section at a time.

            // 2. Progress:
            // Overall system should keep making the problems.
            // Means you should not stop all the threads.
            // If multiple threads are trying to enter in critical section then you should allow exactly one thread
            // Rest of the thread can keep outside the critical section.

            // 3. Bounded waiting:
            // No threads should wait infinitely.

            // 4. No busy waiting:

    }
}
