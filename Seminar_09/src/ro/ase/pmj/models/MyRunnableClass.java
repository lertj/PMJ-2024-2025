package ro.ase.pmj.models;

import java.util.Random;

public class MyRunnableClass implements Runnable{
    private static Random rand = new Random();
    static int x=0;
    static int y=0;
    String threadName;
    static Object mutex = new Object();

    public MyRunnableClass(String threadName) {
        this.threadName = threadName;
    }

    public synchronized void myMethod(){
        synchronized (mutex) {
            System.out.print(this.threadName + " ");
            System.out.print("x=" + this.x);
            System.out.print("y=" + this.y + "\n");
//            if(x == 6){
//                throw new UnsupportedOperationException();
//            }
            x++;
            try {
                Thread.sleep(rand.nextInt(3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            y++;
        }

    }

    @Override
    public void run() {
        for(int i=0;i<6;i++) {
            myMethod();
        }
    }
}
