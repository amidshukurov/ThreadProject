package implementation;

class MyThread implements Runnable {
    Thread thrd;

    public MyThread(String thrdName) {
        thrd = new Thread(this,thrdName);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(1000);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }

        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
