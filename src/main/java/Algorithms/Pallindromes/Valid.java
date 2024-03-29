package Algorithms.Pallindromes;
/*
    Leet 125. Valid Palindrome
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.

 */
public class Valid {


    public static void main(String... args) {

        Valid a = new Valid();

        boolean test1 = a.isPalindrome("dabadx");
        boolean expected1 = true;
        System.out.println(" Out " + test1 );
        assert test1 == expected1 : "Error";

    }


    private boolean isPalindromeString(String ss) {

        boolean result = false ;
        int len = ss.length() ;
        for (int x = 0; x < len+1/2; x++) {

            if ( ss.charAt(x) - ss.charAt(len-1-x) != 0) {
                result = false;
                return result;
            } else {
                result = true;
            }
        }

        return result;
    }

    public boolean isPalindrome(String s) {

        boolean result;

        String snew = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        System.out.println(snew);

        if (isPalindromeString(snew) || snew.equals("")) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }


}
