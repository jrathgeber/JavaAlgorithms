package Algorithms.Pallindromes;
/*
    647. Palindromic Substrings

    Given a string, your task is to count how many palindromic substrings in this string.

    The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

 */
public class Substrings {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }

}
