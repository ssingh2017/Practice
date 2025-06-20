package org.java.concept.program.multiThreading;

public class WaitMethodProgram {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Thread t1 = new Thread(()->{
            shared.waitMethod();
        });
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shared.notifyMethod();
        });

        t1.start();
        t2.start();
    }
}

class Shared{
    synchronized void waitMethod() {
        try {
            System.out.println("Thread is waiting");
            wait();  // release lock and wait..
            System.out.println("Thread is resumed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyMethod(){
        System.out.println("Notifying thread ... ");
        notify(); // wakes up one waiting thread.
    }
}
