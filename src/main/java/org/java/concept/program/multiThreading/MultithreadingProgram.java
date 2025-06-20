package org.java.concept.program.multiThreading;

public class MultithreadingProgram {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();

        t2.start();
    }

}

class Thread1 extends Thread{
    public void run(){
        int i=1;
        while(i<=5){
            System.out.print(i+" ");
            i++;
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        while(i<=5){
            System.out.print((char) (i+97) +" ");
            i++;
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
