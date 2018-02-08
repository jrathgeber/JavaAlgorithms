package Threads;

/**
 * LeftRightDeadlock
 *
 * Simple lock-ordering deadlock
 *
 * @author Brian Goetz and Tim Peierls
 */
public class Deadlock {
    
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() {
        synchronized (left) {
            synchronized (right) {
                doSomething();
            }
        }
    }

    public void rightLeft() {
        synchronized (right) {
            synchronized (left) {
                doSomethingElse();
            }
        }
    }

    void doSomething() {
        
        System.out.println("Left");
        
    }

    void doSomethingElse() {
        
         System.out.println("Right");
    }
    
    
    
    public static void main(String... args) {
        
        
        Deadlock dl = new Deadlock();
        
        dl.leftRight();
        dl.rightLeft();
        
        
    }
    
    
}