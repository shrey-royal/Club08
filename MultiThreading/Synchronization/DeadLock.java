// DeadLock Problem
/*
public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "Car Keys";
        final String resource2 = "Driver Seat";

        Thread t1 = new Thread("Pratham") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource2);

                        // pratham will drive
                    }
                }
            }
        };

        Thread t2 = new Thread("Bapu") {
            public void run() {
                synchronized(resource2) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    synchronized(resource1) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource1);

                        // bapu will drive
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
*/

// DeadLock Solution
public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "Car Keys";
        final String resource2 = "Driver Seat";

        Thread t1 = new Thread("Pratham") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource2);

                        // pratham will drive
                    }
                }
            }
        };

        Thread t2 = new Thread("Bapu") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource1);

                        // bapu will drive
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
