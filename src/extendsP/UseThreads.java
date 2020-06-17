package extendsP;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("My thread is strarting");
        MyThread mt = new MyThread("Child# 1");

        MyThread mt2 = new MyThread("Child# 2");

        MyThread mt3 = new MyThread("Child# 3");
//        implementation.MyThread mt1 = new implementation.MyThread("Child# 2");
//        implementation.MyThread mt2= new implementation.MyThread("Child# 3");
//        implementation.MyThread mt3 = new implementation.MyThread("Child# 4");
//        implementation.MyThread mt4 = new implementation.MyThread("Child# 5");

        //Thread newThread = new Thread(mt);
//        Thread newThread1 = new Thread(mt1);
//        Thread newThread2 = new Thread(mt2);
//        Thread newThread3 = new Thread(mt3);
//        Thread newThread4 = new Thread(mt4);
        //newThread.start();
//        newThread1.start();
//        newThread2.start();
//        newThread3.start();
//        newThread4.start();

//        for(int i=0; i<50; i++) {
//            System.out.print("+");
//            try {
//                Thread.sleep(0);
//            }
//            catch(InterruptedException exc) {
//                System.out.println("Main thread interrupted.");
//            }
//        }

        do {
            System.out.print("+");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        while (mt.isAlive()||mt2.isAlive()||mt3.isAlive());
        System.out.println("Main thread ending.");
    }
}
