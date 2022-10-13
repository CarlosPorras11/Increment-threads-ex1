package org.iesfm.exerciseThreads.Tasks;

import org.iesfm.exerciseThreads.Counter;

public class IncTask implements Runnable {

    public Counter counter;
    public int incTimes;

    public IncTask(Counter counter, int incTimes) {
        this.counter = counter;
        this.incTimes = incTimes;
    }

    @Override
    public void run() {
        for (int i = 0; i < incTimes; i++) {
            counter.inc();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
