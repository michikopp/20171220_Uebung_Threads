package com.sabel.Uebung_Threads;

public class ThreadInterface implements Runnable {

    private String word;
    private int sleeptime;

    public ThreadInterface(String word, int sleeptime) {
        this.word = word;
        this.sleeptime = sleeptime;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println(word);
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
