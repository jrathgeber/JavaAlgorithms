package Collections.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

import java.util.*;
import java.util.concurrent.TimeUnit;

/*
 *
 * From : https://www.codejava.net/java-core/concurrency/java-arrayblockingqueue-examples.
 *
 * A concurrent collection
 *
 * Remember the put() method will block if the queue is full, waiting for space becomes available.
 *
 *
*/

public class ArrayBlocking {


    BlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
    BlockingQueue<Integer> queue2 = new ArrayBlockingQueue<>(50, true);

    BlockingQueue<String> queue3 ;


public void makeThem () {

    List<String> list = Arrays.asList("One", "Two", "Three");
    queue3 = new ArrayBlockingQueue<>(50, true, list);

}


public void loadThem () {

    // First
    try {
        queue.put("Four");
    } catch (InterruptedException ie) {
        ie.printStackTrace();
    }

    // Time out
    try {
        long timeout = 1000;
        boolean success = queue.offer("Five", timeout, TimeUnit.MILLISECONDS);

        if (!success) {
            System.out.println("Queue is full and timeout elapsed");
        }

    } catch (InterruptedException ie) {
        ie.printStackTrace();
    }


    // Ret
    try {
        String head = queue.take();
        System.out.println("Head element: " + head);

    } catch (InterruptedException ie) {
        ie.printStackTrace();
    }


    // Time out
    try {
        long timeout = 1000;
        String head = queue.poll(timeout, TimeUnit.MILLISECONDS);
        System.out.println("Head element: " + head);

    } catch (InterruptedException ie) {
        ie.printStackTrace();
    }

    // Drain to list
    List<String> list = new ArrayList<>();
    queue.drainTo(list);


}



public static void main (String ... args ) {

    ArrayBlocking ab = new ArrayBlocking();
    ab.makeThem();
    ab.loadThem();


    }

}
