package Algorithms.Trees;

/*

    From: https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/

    Easy.

 */


// Simple Java program to find n'th node from end of linked list
class NthLastNode
{
    Node head; // head of the list. This all there is.

    /* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to get the nth node from the last of a linked list */
    void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;

        System.out.println("head : [" + head.data + "] ");


        // 1) count the number of nodes in Linked List
        while (temp != null)
        {
            temp = temp.next;
            len++;
        }

        System.out.println("Length : [" + len + "] [" + n + "]");

        //System.out.println("Temp : [" + temp.data + "]");

        // check if value of n is not more than length of
        // the linked list
        if (len < n)
            return;

        temp = head;

        System.out.println("Temp : [" + head.data + "]");
        System.out.println("Temp : [" + temp.data + "]");

        // 2) get the (len-n+1)th node from the begining
        for (int i = 1; i < len-n+1; i++) {
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println(temp.data);
        }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /*Drier program to test above methods */
    public static void main(String [] args)
    {
        NthLastNode llist = new NthLastNode();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
        llist.push(7);
        llist.push(11);
        llist.push(234);

        llist.printNthFromLast(2);
    }
}// This