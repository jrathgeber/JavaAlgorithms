package Threads;


public class Deadlock {

    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) {

        Thread threadA = new Thread(getRunnableA(), "Thread A");
        Thread threadB = new Thread(getRunnableB(), "Thread B");

        threadA.start();
        threadB.start();

    }

    private static Runnable getRunnableB() {

        return new Runnable() {
            public void run() {
                synchronized(lockA) {
                    try {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e) { }
                    synchronized(lockB) {
                        System.out.println("Retrieved lock B and lock A");
                    }
                }
            }
        };

    }

    private static Runnable getRunnableA() {

        return new Runnable() {

            public void run() {
                synchronized(lockB) {
                    try {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e) { }

                    synchronized(lockA) {
                        System.out.println("Retrieved lock A and lock B");
                    }
                }
            }
        };

    }
}