package Threads;

public class Stats {

    public static void main(String[] args) {


        System.out.println(Thread.activeCount());

        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getThreadGroup());

        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

        for (int i=3; i>0;i--){

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        myThread thread2 = new myThread();
        thread2.start();
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());
        thread2.setName("Jason Thread");
        System.out.println(thread2.getName());

        System.out.println("Count : " + Thread.activeCount());

    }

}



class myThread extends Thread {

    public void run() {

        System.out.println("This thread is running");

    }


}
