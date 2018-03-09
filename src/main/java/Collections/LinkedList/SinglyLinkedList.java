/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.LinkedList;

/**
 *
 * @author jrathgeber
 * @param <NodeType>
 */

public class SinglyLinkedList<NodeType> {

   private SinglyNode<NodeType> root;
   private int count;

   public SinglyLinkedList() {
      root = null;
      count = 0;
   }

   /*
    if position is <=0 then inserts at first,
    position>=COUNT inserts at last, else
    inserts at the right position location
   */

   public int getCount() {
      return count;
   }

   public void addAt(SinglyNode<NodeType> node,
      int position) {

      if (root == null) {
         root = node;

      // inserts at the beginning of the list
      } else if (position <= 0) {
         SinglyNode<NodeType> tmpref = root;
        root = node;
         root.setNext(tmpref);

      } else {   // inserts at the end or right position
         position = position > count ? count : position;
         SinglyNode<NodeType> tmpref = root;
         for (int i = 0; i < position - 1; i++) {
            tmpref = tmpref.getNext();
         }
         node.setNext(tmpref.getNext());
         tmpref.setNext(node);
      }
      count++;
   }

   public void showAll() {
      SinglyNode<NodeType> tmpref = root;
      while (tmpref != null) {
         System.out.print("->" + tmpref.getInfo());
         tmpref = tmpref.getNext();
      }
      System.out.println();
   }

   public void removeAt(int position) {
      position = position > count ? count : position;
      if (root == null)
         return;
      else if (position <= 1) {
         root = root.getNext();
      } else {
         SinglyNode<NodeType> tmpref = root;
         for (int i = 0; i < position - 1; i++) {
            tmpref = tmpref.getNext();
         }
         tmpref.setNext(tmpref.getNext().getNext());
      }
      count--;
   }

   public static void main(String[] args) {
      SinglyLinkedList<Integer> llist =
         new SinglyLinkedList<>();
      llist.addAt(new SinglyNode<>(11), 0);
      llist.addAt(new SinglyNode<>(22), -3321);
      llist.addAt(new SinglyNode<>(33), 2);
      llist.addAt(new SinglyNode<>(44), 3);
      llist.addAt(new SinglyNode<>(77), 88);
      llist.addAt(new SinglyNode<>(99), 3);
      System.out.println("Count=" + llist.getCount());
      llist.showAll();
      llist.removeAt(-89);
      llist.showAll();
      llist.removeAt(1);
      llist.showAll();
      llist.removeAt(3);
      llist.showAll();

   }

}