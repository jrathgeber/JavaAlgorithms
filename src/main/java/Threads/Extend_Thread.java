/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author jrathgeber
 */
class Worker extends Thread {

    private static Deadlock dd  = new Deadlock();

    @Override
    public void run() {
        
        // Loop for ten iterations.
        
        for(int i=0; i<10; i++) {
            System.out.println(i + " looping ...");

            dd.leftRight();


            // Sleep for a while
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // Interrupted exception will occur if
                // the Worker object's interrupt() method
                // is called. interrupt() is inherited
                // from the Thread class.
                break;
            }

            dd.rightLeft();

        }
    }

}


public class Extend_Thread {
    
    public static void main(String[] args) {
        
        Worker worker1 = new Worker();
        worker1.start();
        
        Worker worker2 = new Worker();
        worker2.start();
        
        // You can call interrupt() if you want
        // to interrupt a thread. The thread itself
        // decides how to handle interrupts.
         worker1.interrupt();
    }
    
}

