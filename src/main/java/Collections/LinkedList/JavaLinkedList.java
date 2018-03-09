/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.LinkedList;

import java.util.LinkedList;

public class JavaLinkedList {

   public static void main(String[] args) {

      LinkedList<String> llist=new LinkedList<>();

      llist.add("purple");
      llist.add("red");
      llist.add("green");
      llist.add("blue");
      llist.add("green");
      llist.add("yellow");

      System.out.println("Size:"+llist.size());
      System.out.println("Contents of the link list "+llist);

      llist.addFirst("Black");
      llist.addLast("White");

      System.out.println("Size:"+llist.size());
      System.out.println("Contents of the link list "+llist);

      llist.removeLast();
      llist.remove(2);

      System.out.println("Size:"+llist.size());
      System.out.println("Contents of the link list "+llist);
   }

}