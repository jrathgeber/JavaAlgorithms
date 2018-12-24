package Algorithms.Pallindromes;
/*
    Leet 131. Palindrome Partitioning

    Given a string s, partition s such that every substring of the partition is a palindrome.

    Return all possible palindrome partitioning of s.

 */
public class Partition {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }

    //public List<List<String>> partition(String s) {
    //}


}
