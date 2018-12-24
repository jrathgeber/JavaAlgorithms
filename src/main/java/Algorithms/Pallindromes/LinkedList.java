package Algorithms.Pallindromes;
/*

    Leet 234. Palindrome Linked List

    Given an integer n, find the closest integer (not including itself), which is a palindrome.
    The 'closest' is defined as absolute difference minimized between two integers.


 */
public class LinkedList {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }


}
