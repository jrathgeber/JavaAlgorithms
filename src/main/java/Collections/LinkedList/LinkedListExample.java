package Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main (String...args) {

        // Java Linked List
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Jason");

        try {
            System.out.println(namesLinkedList.get(2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finnaly");
        }

        // Java Array List
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Jason");

        // Normal Array
        String[] names = new String[4];
        names[0] = "Jason";


    }




}
