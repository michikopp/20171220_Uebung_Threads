package com.sabel.Uebung_Threads;

public class Aufgabe2 extends Thread {

    public Aufgabe2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Ausgabe");
    }

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println("Priority: " + thread.getPriority());

        Aufgabe2 aufgabe2 = new Aufgabe2("Thread2");
        System.out.println(aufgabe2.getName());
        System.out.println("Priority: " + aufgabe2.getPriority());
        aufgabe2.setName("neuerName");
        System.out.println(aufgabe2.getName());

    }
}
