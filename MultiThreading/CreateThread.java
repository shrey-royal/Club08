
class Way1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread(Way1) is running...");
    }
}

class Way2 implements Runnable  {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread(Way2) is running...");
    }

    public String getState() {
        return Thread.currentThread().getState().toString();
    }
}


public class CreateThread {
    public static void main(String[] args) {
        // Way1 one = new Way1();
        // System.out.println(one.getState());
        // one.start();    //if we call start method then it will call run method automatically
        // System.out.println(one.getState());
        // System.out.println(one.getState());
        // one.run();  //this will give all its tasks to main method
        // System.out.println(one.getState());

        // Way2 too = new Way2();
        // System.out.println(too.getState());
        // too.run();
        // System.out.println(too.getState());

        Thread t = new Thread() {
            public void run() {
                System.out.println("Generic Thread is running...");
            };
        };

        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}
