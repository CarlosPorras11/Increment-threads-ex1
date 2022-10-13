package org.iesfm.exerciseThreads.Tasks;

import org.iesfm.exerciseThreads.Counter;

public class DecTask implements Runnable{

    public Counter counter;
    public int decTimes;

    public DecTask(Counter counter, int decTimes) {
        this.counter = counter;
        this.decTimes = decTimes;
    }

    @Override
    public void run() {
        for (int i = 0; i < decTimes; i++) {
            counter.dec();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
