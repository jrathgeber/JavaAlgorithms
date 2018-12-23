package Algorithms.Pallindromes;

/*

    409. Longest Palindrome

    Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

    This is case sensitive, for example "Aa" is not considered a palindrome here.

    Note:
    Assume the length of given string will not exceed 1,010.

 */


public class Longest {



    public static void main(String... args) {

        Longest a = new Longest();

        int test1 = a.longestPalindrome("abccccdd");
        int expected1 = 7;
        System.out.println(" Out [" + test1 + "] expected + [" + expected1 + "]" );
        assert test1 == expected1 : "Error";
    }



    public int longestPalindrome(String s) {


        return 6;


    }


}
