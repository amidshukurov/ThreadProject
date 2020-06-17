package extendsP;

class MyThread extends Thread {

    public MyThread(String thrdName) {
        super(thrdName);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }

        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
