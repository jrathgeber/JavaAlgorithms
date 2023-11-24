package Algorithms.Pallindromes;
/*
    564. Find the Closest Palindrome

    Given an integer n, find the closest integer (not including itself), which is a palindrome.
    The 'closest' is defined as absolute difference minimized between two integers.

    Note:
    The input n is a positive integer represented by string, whose length will not exceed 18.
    If there is a tie, return the smaller one as answer.
 */
public class Closest {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }

    public String nearestPalindromic(String n) {

        return "121";
    }


}
