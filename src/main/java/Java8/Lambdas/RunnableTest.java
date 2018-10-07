/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8.Lambdas;

/**
 *
 * @author jrathgeber
 */
public class RunnableTest {
    
    public static void main(String[] args) {
     
     System.out.println("=== RunnableTest ===");
     
     // Anonymous Runnable
     Runnable r1 = new Runnable(){
       
       @Override
       public void run(){
         System.out.println("Hello world one!");
       }
     };
     
     // Lambda Runnable
     Runnable r2 = () -> System.out.println("Hello world two!");
     
     // Run em!
     r1.run();
     r2.run();
     
   }
}
