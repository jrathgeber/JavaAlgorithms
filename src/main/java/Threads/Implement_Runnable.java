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
class CodeRunner implements Runnable {

    @Override
    public void run() {
        // Loop for ten iterations.
        
        for(int i=0; i<10; i++) {
            System.out.println(i + " looping ...");
            
            // Sleep for a while
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                break;
            }
        }       
    }
    
}

public class Implement_Runnable {

    
    public static void main(String[] args) {
        
        CodeRunner runner = new CodeRunner();
        
        Thread thread = new Thread(runner);
        thread.start();
    }
    
}
