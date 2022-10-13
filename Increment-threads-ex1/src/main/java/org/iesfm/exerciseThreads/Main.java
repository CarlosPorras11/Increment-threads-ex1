package org.iesfm.exerciseThreads;

import org.iesfm.exerciseThreads.Tasks.DecTask;
import org.iesfm.exerciseThreads.Tasks.IncTask;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter(0);
        List<Thread> threads = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            //Incremento
            IncTask inc = new IncTask(c, 1000);
            Thread incThread = new Thread(inc);
            incThread.start();
            threads.add(incThread);
            //Decremento
            DecTask dec = new DecTask(c, 1000);
            Thread decThread = new Thread(dec);
            decThread.start();
            threads.add(decThread);

        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(c.getValue());
    }
}