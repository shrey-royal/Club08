class MyThread extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread work");
        } else {
            System.out.println("User thread work");
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}
