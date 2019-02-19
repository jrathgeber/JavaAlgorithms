package Algorithms.Misc;

import java.util.HashMap;
import java.util.Collections;

public class LongString {

    /*

        Leet : 159. Longest Substring with at Most Two Distinct Characters

        Given a string s , find the length of the longest substring t  that contains at most 2 distinct characters.

        Approach 1: Sliding Window

        https://leetcode.com/articles/longest-substring-with-at-most-two-distinct-charac/#

     */


    public static void main(String... args) {

        LongString a = new LongString();

        int test1 = a.lengthOfLongestSubstringTwoDistinct("eceba");
        int expected1 = 3;
        System.out.println(" Out " + test1);
        assert test1 == expected1 : "Error";

        int test2 = a.lengthOfLongestSubstringTwoDistinct("ccaabbb");
        int expected2 = 5;
        System.out.println(" Out " + test2);
        assert test1 == expected2 : "Error";


    }



        public int lengthOfLongestSubstringTwoDistinct(String s) {
            int n = s.length();
            if (n < 3) return n;

            // sliding window left and right pointers
            int left = 0;
            int right = 0;
            // hashmap character -> its rightmost position
            // in the sliding window
            HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

            int max_len = 2;

            while (right < n) {
                // slidewindow contains less than 3 characters
                if (hashmap.size() < 3)
                    hashmap.put(s.charAt(right), right++);

                // slidewindow contains 3 characters
                if (hashmap.size() == 3) {
                    // delete the leftmost character
                    int del_idx = Collections.min(hashmap.values());
                    hashmap.remove(s.charAt(del_idx));
                    // move left pointer of the slidewindow
                    left = del_idx + 1;
                }

                max_len = Math.max(max_len, right - left);
            }
            return max_len;
        }





}
