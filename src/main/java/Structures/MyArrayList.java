package Structures;

import java.util.Arrays;

public class MyArrayList<E> {

    // Size and Capacity
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    // The Array
    private Object elements[];

    // Contractor
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Add an Element
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }


    // Resize array
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Return by index a bit decorated
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }


    public static void main(String ...args) {

        MyArrayList<Integer> list = new MyArrayList<Integer>();
                list.add(1);
                list.add(4);
                list.add(3);
                list.add(9);


        String s = "Hello";

        s.startsWith()

    }


}