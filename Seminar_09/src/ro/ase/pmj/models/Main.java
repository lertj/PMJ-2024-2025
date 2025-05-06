package ro.ase.pmj.models;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//
//        t1.start();
//
//        MyThread t2 = new MyThread();
//        Thread t = new Thread(t2);
//        t.start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("test");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }).start();
//
//
//
//        System.out.println("*******");

        MyRunnableClass c1 = new MyRunnableClass("t1");
        MyRunnableClass c2 = new MyRunnableClass("t2");
        new Thread(c1).start();
        new Thread(c2).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("test");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }).start();

//        Runnable r = () -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("test");
//        };
//        new Thread(r).start();
//
//        new Thread(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("test");
//        }).start();
        System.out.println("End of main");

    }
}
