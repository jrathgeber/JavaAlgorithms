package Algorithms.Pallindromes;
import java.util.List;
import java.util.ArrayList;
/*
    Leet 336. Palindrome Pairs

    Given a list of unique words,
    find all pairs of distinct indices (i, j) in the given list,
    so that the concatenation of the two words, i.e. words[i] + words[j] is a palindrome.

 */
public class Pairs {

    public static void main(String... args) {

        Closest a = new Closest();

        String test1 = a.nearestPalindromic("123");
        String expected1 = "121";
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

    }


    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> x = new ArrayList<List<Integer>>();

        return x;

    }

}
