class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class JoiningThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("1");
        MyThread t2 = new MyThread("2");
        MyThread t3 = new MyThread("3");

        t1.start();
        try {
            t1.join(3000);  // now t2 will wait for 3 seconds then it will start its execution
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        t3.start();
    }
}
