package org.java.concept.program.multiThreading;

public class AlternatingThreadExecution {
    public static boolean threadTurn = true;
    public static final Object lock = new Object();
    public static void main(String[] args) {
        Thread numberThread = new Thread(()->{
           for(int i=1;i<=5;i++){
               synchronized (lock){
                   while(!threadTurn){
                       try {
                           lock.wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
                   System.out.print(i+" ");
                   threadTurn = false;
                   lock.notifyAll();
               }
           }
        });


        Thread letterThread = new Thread(()->{
            for(char c ='A';c<='E';c++){
                synchronized (lock){
                    while(threadTurn){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(c+" ");
                    threadTurn = true;
                    lock.notifyAll();
                }
            }
        });

        numberThread.start();
        letterThread.start();
    }

}