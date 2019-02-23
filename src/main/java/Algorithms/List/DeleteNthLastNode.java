package Algorithms.List;


// Simple Java program to find n'th node from end of linked list
public class DeleteNthLastNode
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


    /*
        My Solution
     */
    public Node removeNthFromEnd(Node head, int n) {

        int c = 1;
        Node curr = head;

        // Get Last nth node position
        while (curr.next != null){
            curr = curr.next;
            c++;
        }

        // Get nth
        int nth = c-n;

        // Reset and reuse
        c=1;
        curr = head;

        // Remove last node
        if (n==1 ) {
            for (curr = head; curr.next.next != null;curr = curr.next) { }
            curr.next = null;
            return head;
        }

        // Remove First Node
        if(nth==0 ){
            head = head.next;
            return head;
        }

        // Easy delete of the node!
        while (curr.next != null) {
            if (nth == c) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
            c++;
        }
        // Just return head node !!
        return head;
    }


    /*
    Leet code solution two pointer
     */
    public Node removeNthFromEndTwoPointer(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
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
        PrintNthLastNode llist = new PrintNthLastNode();
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