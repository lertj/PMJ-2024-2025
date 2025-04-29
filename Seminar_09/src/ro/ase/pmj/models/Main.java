package ro.ase.pmj.models;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.start();

        MyThread t2 = new MyThread();
        Thread t = new Thread(t2);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("test");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();



        System.out.println("*******");

        System.out.println("End of main");


    }
}
