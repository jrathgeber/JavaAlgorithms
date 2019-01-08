package Structures;

import java.util.EmptyStackException;

/*
 * take from CTCI
 *
 *
 */

public class MyStack<T> {

    private static class StackNode<T> {

        // Data and Next
        private T data;
        private StackNode<T> next;

        // Contructor
        public StackNode(T data) {
            this.data = data;
        }

        // top pointer
        private StackNode<T> top;

        // Pop
        public T pop() {

            if (top == null) throw new EmptyStackException();
            T item = top.data;

            top = top.next;
            return item;
        }

        // Push
        public void push(T item) {

            StackNode<T> t = new StackNode<T>(item);
            t.next = top;
            top = t;

        }

        // peek
        public T peek() {
            if (top == null) throw new EmptyStackException();
            return top.data;

        }

        // isEmpty
        public boolean isEmpty() {

            return top == null;

        }

    }

    public static void main (String ...args ) {

        StackNode<String> sn = new StackNode("hello");

        sn.push("Voila");

        System.out.println("Test : " + sn.peek());

    }


}
