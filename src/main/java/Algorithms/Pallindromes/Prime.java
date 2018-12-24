package Algorithms.Pallindromes;
/*
    Leet 866. Prime Palindrome

    Find the smallest prime palindrome greater than or equal to N.

    Recall that a number is prime if it's only divisors are 1 and itself, and it is greater than 1.

    For example, 2,3,5,7,11 and 13 are primes.
    Recall that a number is a palindrome if it reads the same from left to right as it does from right to left.

    For example, 12321 is a palindrome.

 */
public class Prime {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }

}
