package Structures;

/*
    A signly linked list like in JJ

    Taken From :

    https://github.com/accesscode-2-1/unit-4/blob/master/exercises/16_LinkedLists/SinglyNode.java

 */

// The usual Node
class ListNode {

    ListNode next;
    String data;

    public ListNode(String data) {
        this.data = data;
    }

}

public class MyList {

    // The whole list is right here!
    ListNode head;

    // Adds a new not to the begining
    public void addToHead(String data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Add to tail
    public void addToTail(String data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // Nicely
    public void insertAfter(String prevData, String newData) {
        ListNode current = head;
        // traverse through list
        while(current != null && !current.data.equals(prevData)) {
            current = current.next;
        }
        if(current != null) {
            // then we know current is pointing to the node after
            // which we add 'newData'
            ListNode newNode = new ListNode(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Ok
    public void update(String oldData, String newData) {
        ListNode current = head;
        while (current != null && !current.data.equals(oldData)) {
            current = current.next;
        }
        if (current != null) {
            current.data = newData;
        }
    }

    // Delete
    public void delete(String data) {
        if(head == null) {
            return;
        }
        if(head.data.equals(data)) {
            head = head.next;
        }
        ListNode prevNode = head;
        while (prevNode.next != null && !prevNode.next.data.equals(data)) {
            prevNode = prevNode.next;
        }
        if(prevNode.next != null) {
            prevNode.next = prevNode.next.next;
        }
    }

    public void print() {
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }
}

class SinglyMain {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.print();
        list.addToHead("testing123");
        list.print();
        list.addToHead("one");
        list.print();
        list.addToTail("tail");
        list.print();
        list.addToTail("tail2");
        list.print();
        list.update("tail4", "tail3");
        list.print();
        list.update("tail2", "tail3");
        list.print();
        list.update("testing123", "testing456");
        list.print();

        list.delete("one");
        list.print();

    }
}