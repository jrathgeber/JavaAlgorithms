package Collections.Vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTesting {

    public static void main(String...args){


        int size = 1000000;

        List<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();
        for(int i=0;i<size;i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Added " + size + " elements to ArrayList " + (end -start) + " ms");

        start = System.currentTimeMillis();

        List<Integer> vector = new Vector<>();

        for(int i=0;i<size;i++) {
            vector.add(i);
        }

        end = System.currentTimeMillis();

        System.out.println("Added " + size + " elements to Vector " + (end -start) + " ms");


        start = System.currentTimeMillis();
        List<Integer> multiThreadedList = Collections.synchronizedList(new ArrayList<>());
        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<size;i++) {
                multiThreadedList.add(i);
            }
         });


        Thread t2 = new Thread(() -> {
            for(int i=0;i<size;i++) {
                multiThreadedList.add(i);
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to MultiList " + (end -start) + " ms");
        System.out.println("Size is: " + multiThreadedList.size());

        start = System.currentTimeMillis();
        List<Integer> multiThreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for(int i=0;i<size;i++) {
                multiThreadedVector.add(i);
            }
        });


        t2 = new Thread(() -> {
            for(int i=0;i<size;i++) {
                multiThreadedVector.add(i);
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to MultiVector " + (end -start) + " ms");
        System.out.println("Size is: " + multiThreadedVector.size());

    }

}
