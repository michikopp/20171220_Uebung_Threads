package com.sabel.Uebung_Threads;

import java.util.Scanner;

public class Threadverwalter implements Runnable {

    private Thread thread;
    private int couter;

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Expecption geworfen!");
                break;
            }
        }
        System.out.println("Thread beendet!");
    }

    public void start() {
        if (this.thread == null) {
            this.thread = new Thread(this, "Thread Nummer: " + ++couter);
            this.thread.start();
        }

    }

    public void stop() {
            if (this.thread != null) {
                this.thread.interrupt();
            }
            this.thread = null;
    }

    public static void main(String[] args) {
        Threadverwalter threadverwalter = new Threadverwalter();
        String eingabe;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            eingabe = scanner.nextLine();
            switch (eingabe) {
                case "s":
                    threadverwalter.start();
                    break;
                case "b" :
                    threadverwalter.stop();
                    break;
                case "q" :
                    threadverwalter.stop();
                    System.exit(0);
                    break;
            }
        }

    }
}
