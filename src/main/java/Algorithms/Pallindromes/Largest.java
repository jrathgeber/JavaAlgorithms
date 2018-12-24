package Algorithms.Pallindromes;
/*

    Leet 479. Largest Palindrome Product

    Find the largest palindrome made from the product of two n-digit numbers.

    Since the result could be very large, you should return the largest palindrome mod 1337.

 */
public class Largest {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }


}
