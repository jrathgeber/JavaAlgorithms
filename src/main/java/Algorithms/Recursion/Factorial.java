/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Recursion;

/**
 *
 * @author jrathgeber
 */
public class Factorial {
     
    public static long factorial(int n) {
        
        if (n==1) return 1;
        
        System.out.println(n);

        return n * factorial(n-1);
        
    }


    // A Java program to demonstrate working of Recursion
    // This code is contributed by Smitha Dinesh Semwal
        static void printFun(int test)
        {
            if (test < 1)
                return;
            else
            {
                System.out.printf("%d ",test);
                printFun(test-1); // statement 2
                System.out.printf("%d ",test);
                return;
            }
        }



    public static void main (String... args) {

        // Factorial
        long answer = factorial(10);
        System.out.println(answer);

        // Print It
        printFun(3);

    }
    
}
