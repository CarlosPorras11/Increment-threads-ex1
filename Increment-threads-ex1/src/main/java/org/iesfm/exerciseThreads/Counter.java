package org.iesfm.exerciseThreads;

public class Counter {
    public int value;

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void inc() {
        value++;
    }

    public synchronized void dec(){
        value--;
    }
}

