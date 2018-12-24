package Algorithms.Pallindromes;
/*
    214. Shortest Palindrome

    Given a string s, you are allowed to convert it to a palindrome by adding characters in front of it.
    Find and return the shortest palindrome you can find by performing this transformation.

 */
public class Shortest {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }

}
