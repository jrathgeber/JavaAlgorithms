/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author jrathgeber
 */
public class Recursion {
     
    public static long factorial(int n) {
        
        if (n==1) return 1;
        
        System.out.println(n);
                
        return n * factorial(n-1);
        
    }
    
         
    public static void main (String... args) {
          
        long answer = factorial(10);
        
        System.out.println(answer);
        
    }
    
}
