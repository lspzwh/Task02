package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test extends Thread{
//    private static Object lock = new Object();
    private static volatile int signal = 1;
    public static void main(String[] args) {
        Thread3 thread3=new Thread3();
        FutureTask<Integer> futureTask=new FutureTask<Integer>(thread3);
        Test test=new Test();
        Thread thread=new Thread(new Thread2());
        test.start();
        thread.start();
        new Thread(futureTask).start();
    }
    @Override
    public void run() {
        while(signal<150){
            if((signal+2)%3==0){
                System.out.println(signal);
                signal=signal+1;
            }
        }

    }
    static class Thread2 implements Runnable{

        @Override
        public void run() {
//            synchronized (lock){
//                for (int i = 2; i < 150; i+=3) {
//                    try {
//                        System.out.println(i);
//                        lock.notify();
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                lock.notify();
//            }
            while(signal<150){
                if((signal+1)%3==0){
                    System.out.println(signal);
                    signal=signal+1;
                }
            }
        }
    }
    static class Thread3 implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            while(signal<150){
                if((signal)%3==0){
                    System.out.println(signal);
                    signal=signal+1;
                }
            }
            return null;
        }
    }
}




