package Algorithms.Leet;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {


    static String input = "abcabcbb";
    static String input2 = "aabcdefgegg";


    public static void main (String...args){

        int ans = lengthOfLongestSubstringBF(input2);
        System.out.println("Ans [" + ans + "]");

        int ans2 = lengthOfLongestSubstringMW(input2);
        System.out.println("Ans [" + ans2 + "]");

        int ans3 = lengthOfLongestSubstringIO(input2);
        System.out.println("Ans [" + ans3 + "]");

    }

    // Brute force
    public static int lengthOfLongestSubstringBF (String str) {

        int maxLength = 0;

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                if(currentSubstring.indexOf(String.valueOf(str.charAt(j))) != -1){
                    break;
                }
                currentSubstring.append(str.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }
        return maxLength;
    }


    // moving window
    public static int lengthOfLongestSubstringMW (String str) {

        int maxLength = 0;

        Map<Character, Integer> visitedCharacters = new HashMap<>();

        // Traverse the string
        for (int right = 0, left =0; right < str.length(); right++) {

            char currentCharacter = str.charAt(right);

            if(visitedCharacters.containsKey(currentCharacter) && visitedCharacters.get(currentCharacter) >= left) {

                left = visitedCharacters.get(currentCharacter) + 1;

            }

            maxLength = Math.max(maxLength, right - left +1);
            visitedCharacters.put(currentCharacter, right);

        }
        return maxLength;
    }


    // TODO !!!

    public static int lengthOfLongestSubstringIO (String str) {

        int maxLength = 0;


        // Traverse the string
        for (int right = 0, left =0; right < str.length(); right++) {

            int indexOfFirstAppearanceInSubstring = str.indexOf(str.charAt(right), left);

            if(indexOfFirstAppearanceInSubstring != right) {

                left = indexOfFirstAppearanceInSubstring + 1;

            }

            maxLength = Math.max(maxLength, right - left +1);


        }
        return maxLength;
    }







}
