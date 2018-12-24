package Algorithms.Pallindromes;
/*
    Leet 516. Longest Palindromic Subsequence

    Given a string s, find the longest palindromic subsequence's length in s.
    You may assume that the maximum length of s is 1000.

 */
public class LongestSubsequence {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }


}
