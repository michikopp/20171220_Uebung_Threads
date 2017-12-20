package com.sabel.Uebung_Threads;

public class ThreadVererbung extends Thread {

    private String word;
    private int sleeptime;

    public ThreadVererbung(String word, int sleeptime) {
        this.word = word;
        this.sleeptime = sleeptime;
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName() + " " +  getPriority() + " " + word);
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
