package Structures;


/**
 *
 * @author jrathgeber
 */


class DoublyNode<NodeType>  implements Comparable<NodeType> {

    private DoublyNode<NodeType> prev;
    private NodeType info;
    private DoublyNode<NodeType> next;

    public DoublyNode(NodeType info) {
        super();
        this.info = info;
        this.next = null;
        this.prev = null;
    }

    public DoublyNode<NodeType> getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode<NodeType> prev) {
        this.prev = prev;
    }

    public NodeType getInfo() {
        return info;
    }

    public void setInfo(NodeType info) {
        this.info = info;
    }

    public DoublyNode<NodeType> getNext() {
        return next;
    }

    public void setNext(DoublyNode<NodeType> next) {
        this.next = next;
    }

    @Override
    public int compareTo(NodeType o) {
        return 0;
    }

}


public class MyListDoubly<NodeType> {

    private DoublyNode<NodeType> root;
    private int count;

    public MyListDoubly() {
        root = null;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void addAt(DoublyNode<NodeType> node, int position) {

        if (root == null) {
            node.setNext(node);
            node.setPrev(node);
            root = node;

            // inserts at the beginning of the list
        } else if (position <= 0) {
            DoublyNode<NodeType> tmpref = root;
            while (tmpref.getNext() != root)
                tmpref = tmpref.getNext();
            tmpref.setNext(node);
            node.setNext(root);
            node.setPrev(tmpref);
            root.setPrev(node);
            root = node;

            // adds at any position except in the beginning
        } else {
            position = position > count ? count : position;
            DoublyNode<NodeType> tmpref = root;
            for (int i = 0; i < position - 1; i++) {
                tmpref = tmpref.getNext();
            }
            node.setNext(tmpref.getNext());
            node.setPrev(tmpref);
            tmpref.getNext().setPrev(node);
            tmpref.setNext(node);
        }
        count++;
    }

    public void traverseClockwise() {
        if (root == null)
            return;
        DoublyNode<NodeType> tmpref = root;
        for (int i = 0; i < count; i++) {
            System.out.print("->" + tmpref.getInfo());
            tmpref = tmpref.getNext();
        }
        System.out.println();
    }

    public void traverseAnticlockwise() {
        if (root == null)
            return;
        DoublyNode<NodeType> tmpref = root.getPrev();
        for (int i = 0; i < count; i++) {
            System.out.print("->" + tmpref.getInfo());
            tmpref = tmpref.getPrev();
        }
        System.out.println();
    }

    public void removeAt(int position) {
        position = position > count ? count : position;
        if (root == null)
            return;
        else if (position <= 1) {
            root.getPrev().setNext(root.getNext());
            root.getNext().setPrev(root.getPrev());
            root = root.getNext();
        } else {
            DoublyNode<NodeType> tmpref = root;
            for (int i = 0; i < position - 1; i++) {
                tmpref = tmpref.getNext();
            }
            tmpref.setNext(tmpref.getNext().getNext());
            tmpref.getNext().setPrev(tmpref);
        }
        count--;
    }

    public static void main(String[] args) {
        MyListDoubly<Integer> llist = new MyListDoubly<>();
        llist.addAt(new DoublyNode<Integer>(11), 0);
        llist.addAt(new DoublyNode<Integer>(22), -3321);
        llist.addAt(new DoublyNode<Integer>(33), 2);
        llist.addAt(new DoublyNode<Integer>(44), 3);
        llist.addAt(new DoublyNode<Integer>(77), 88);
        llist.addAt(new DoublyNode<Integer>(99), 3);
        llist.addAt(new DoublyNode<Integer>(66), 2);
        llist.addAt(new DoublyNode<Integer>(00), 0);
        System.out.println("Count=" + llist.getCount());
        llist.traverseClockwise();
        llist.traverseAnticlockwise();
        System.out.println("------------------------------");
        llist.removeAt(-89);
        llist.traverseClockwise();
        llist.removeAt(1);
        llist.traverseClockwise();
        llist.removeAt(3);
        llist.traverseClockwise();
        llist.removeAt(754);
        llist.traverseClockwise();
    }

}