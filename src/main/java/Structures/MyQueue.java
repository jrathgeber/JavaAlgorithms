package Structures;

import java.util.NoSuchElementException;


/*

    My Queue for CTJJI

    0. Make a node
    1. first, last pointers
    2. add and rotate
    3. remove
    4. peek

 */


public class MyQueue<T> {

    // Object for node
    private static class QueueNode<T> {

        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }

    }

    // Pointers First and Last
    private QueueNode<T> first;
    private QueueNode<T> last;

    // Add an elememt to queue
    public void add(T item) {

        QueueNode<T> t = new QueueNode<T>(item);

        // if has an element
        if(last != null){
            last.next = t;
        }
        // set the element
        last = t;
        // set first in queue
        if(first == null) {
            first = last;
        }

    }

    // Remove Element
    public T remove() {

        if (first == null) throw new NoSuchElementException();

        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }

        return data;

    }

    // Get really
    public T peek() {

        if (first == null) throw new NoSuchElementException();
        return first.data;

    }

    // no first its empty
    public boolean isEmpty() {
         return first == null;
    }



    // Main
    public static void main (String ... args) {

        MyQueue<String> qt = new MyQueue<String>();

        qt.add("Hello");

    }


}
