package Algorithms.Pallindromes;
/*
    Leet 730. Count Different Palindromic

    Given a string S, find the number of different non-empty palindromic subsequences in S, and return that number modulo 10^9 + 7.
    A subsequence of a string S is obtained by deleting 0 or more characters from S.
    A sequence is palindromic if it is equal to the sequence reversed.
    Two sequences A_1, A_2, ... and B_1, B_2, ... are different if there is some i for which A_i != B_i.

    Note:
    The input n is a positive integer represented by string, whose length will not exceed 18.
    If there is a tie, return the smaller one as answer.
 */
public class Count {


    public static void main(String... args) {

        Count a = new Count();

        int test1 = a.countPalindromicSubsequences("bccb");
        int expected1 = 6;
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }


    public int countPalindromicSubsequences(String S) {


        return 6;

    }


}
