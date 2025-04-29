package ro.ase.pmj.models;

import java.util.Random;

public class MyThread extends Thread{
    private static Random rand = new Random();
    static int x=0;
    static int y=0;

    public void myMethod(){
        System.out.print("x=" + this.x);
        System.out.print("y="+this.y + "\n");
        x++;
        try {
            Thread.sleep(rand.nextInt(3000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        y++;

    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<6;i++) {
            myMethod();
        }
    }
}
