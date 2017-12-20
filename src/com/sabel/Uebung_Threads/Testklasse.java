package com.sabel.Uebung_Threads;

public class Testklasse {
    public static void main(String[] args) {
        ThreadVererbung threadVererbung = new ThreadVererbung("HIP", 1000);
        ThreadVererbung threadVererbung1 = new ThreadVererbung("HOP", 500);
//        threadVererbung.start();
//        threadVererbung1.start();


        Thread thread = new Thread(new ThreadInterface("Hip", 1000));
        Thread thread1 = new Thread(new ThreadInterface("Hop", 500));

        System.out.println(thread.getName());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread1.getName());
        System.out.println(thread1.getPriority());

        thread.start();
        thread1.start();






    }
}
