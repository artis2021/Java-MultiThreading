import java.util.concurrent.ArrayBlockingQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Starting of main");
//        Thread1 t1= new Thread1();
//        Thread1 t1 = new Thread1("arti");
//        t1.setDaemon(true);
//        t1.start();
//        System.out.println("Ending of main");

//        Thread2 t2 = new Thread2();
//        Thread t1 = new Thread(t2);
//        t1.start();

//        Stack stack = new Stack(5);
//
//        new Thread(() -> {
//            int ct=0;
//            while(++ct<10){
//                System.out.println("PUSHED: "+ stack.push(100));
//            }
//        }, "Pusher").start();
//
//        new Thread(() -> {
//            int ct=0;
//            while(++ct<10){
//                System.out.println("POPED: "+ stack.pop());
//            }
//        }, "Popper").start();
//
//        System.out.println("Main is exiting");

//        TVSet tvSet = new TVSet();
//        TVSet tvSet1 = new TVSet();
//        tvSet.GetInstance();

//        BlockingQueue blockingQueue = new BlockingQueue(5);
//        for(int i = 0; i < 5; i++){
//            blockingQueue.add(i);
//        }
//        for (int i = 0; i < 5; i++) {
//            blockingQueue.remove();
//        }

//        Thread thread3 = new Thread(() -> {
//            try{
//                Thread.sleep(1);
//                for(int i=0; i<1; i++);
//            } catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        });
//
//        thread3.start();
//
//        while(true){
//            Thread.State state = thread3.getState();
//            System.out.println(state);
//            if(state == Thread.State.TERMINATED){
//                break;
//            }
//
//        }

//        System.out.println("Main is starting");
//
//        Thread thread = new Thread(() -> {
//            System.out.println(Thread.currentThread());
//        }, "My thread");
//
//        thread.start();
//
//        try{
//            thread.join(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Main is exiting.");
//        System.out.println(thread.isAlive());
//        thread.setPriority(2);
//        System.out.println(thread.getPriority());

        String lock1= "lock1";
        String lock2= "lock2";

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Lock is acquired");
                }
            }
        } , "thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock1) {
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Lock is released");
                }
            }
        }, "thread2");



        thread2.start();
        thread1.start();
//        try{
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }








    }
}