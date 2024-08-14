package com.hsbc.newfeaturesproject;
class MakeTea implements Runnable {
    @Override
    public void run() {
        System.out.println("Preparing Tea....");

    }
}
public class VThread_PThread_Demo {
    public static void main(String[] args) throws InterruptedException {
        long start_time = System.currentTimeMillis();
        for (var i = 0; i < 10000; i++) {
            Thread t = Thread.ofVirtual().start(new MakeTea());
          //    Thread t = new Thread(new MakeTea());
          //   t.start();
            t.join();
        }
        long end_time = System.currentTimeMillis();
        long difference = end_time-start_time;
        System.out.println("Time Diff: " + difference);
    }
}

