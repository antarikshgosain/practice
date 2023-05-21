package org.example.practice.lambda;

public class ThreadLambda {

    public static void main(String[] args) {

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 Running!");
            }
        };

        Thread t1 = new Thread(run1);
        t1.start();

        Runnable run2 = () -> {
            System.out.println("Thread 2 Running!");
        };

        Thread t2 = new Thread(run2);
        t2.start();

    }

}
