package Algorithms.Pallindromes;
/*
    906. Super Palindromes

    Let's say a positive integer is a superpalindrome if it is a palindrome, and it is also the square of a palindrome.

    Now, given two positive integers L and R (represented as strings),
    return the number of superpalindromes in the inclusive range [L, R].

 */
public class Super {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }

}
