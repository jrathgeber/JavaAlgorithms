package Algorithms.Pallindromes;

public class Valid {


    public static void main(String... args) {

        Valid a = new Valid();

        boolean test1 = a.isPalindrome("aba");
        boolean expected1 = true;
        System.out.println(" Out " + test1 );
        assert test1 == expected1 : "Error";

        boolean test2 = a.isPalindrome("cabacd");
        boolean expected2 = false;
        System.out.println(" Out " + test2 );
        assert test2 == expected2 : "Error";

        boolean test3 = a.isPalindrome("dcabacd");
        boolean expected3 = true;
        System.out.println(" Out " + test3 );
        assert test3 == expected3 : "Error";


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
