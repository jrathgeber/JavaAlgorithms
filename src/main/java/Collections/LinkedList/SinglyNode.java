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
public class SinglyNode<NodeType> implements
   Comparable<NodeType> {

   private NodeType info;
   private SinglyNode<NodeType> next;

   public SinglyNode(NodeType info) {
      super();
      this.info = info;
      this.next = null;
   }

   public NodeType getInfo() {
      return info;
   }

   public void setInfo(NodeType info) {
      this.info = info;
   }

   public SinglyNode<NodeType> getNext() {
      return next;
   }

   public void setNext(SinglyNode<NodeType> next) {
      this.next = next;
   }

   @Override
   public int compareTo(NodeType obj) {
      if (info == obj)
         return 1;
      else
         return 0;
   }

}