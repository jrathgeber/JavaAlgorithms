package Algorithms.Array;

public class Atoi {

    /*
    *   Planned submition by to me leet code on December 14th, 2018
    *   Codeed up day after christmas party
    *
    *   Implement atoi which converts a string to an integer.
    *   The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
    *   The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
    *   If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
    *   If no valid conversion could be performed, a zero value is returned.
    */


    public static void main(String... args) {

        Atoi a = new Atoi();

        int test1 = a.myAtoi("42");
        int expected1 = 42;
        System.out.println(" Out " + test1 );
        assert test1 == expected1 : "Error";

        int test2 = a.myAtoi("   -42");
        int expected2 = -42;
        System.out.println(" Out " + test2 );
        assert test2 == expected2 : "Error";

        int test3 = a.myAtoi("4193 with words");
        int expected3 = 4193;
        System.out.println(" Out " + test3 );
        assert test3 == expected3;

        int test4 = a.myAtoi("words and 987");
        int expected4 = 0;
        System.out.println(" Out " + test4 );
        assert test4 == expected4;

        int test5 = a.myAtoi("+-2");
        int expected5 = 0;
        System.out.println(" Out " + test5 );
        assert test5 == expected4;

        int test6 = a.myAtoi("-91283472332");
        int expected6 = -2147483648;
        System.out.println(" Out " + test6 );
        assert test6 == expected6;

        int test7 = a.myAtoi("   -115579378e25");
        int expected7 = -115579378;
        System.out.println(" Out " + test7 );
        assert test7 == expected7;


    }

    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }


    /*
    * My Atoi
    */
    public int myAtoi(String str) {

        int x = 0;
        System.out.print(" In " + str );
        int ans =0;
        int end = 0;

        boolean numericpart = false;

        for (int i = 1; i <= str.length(); i++) {

               if(isNumeric(str.substring(0,i))){
                   end = i;
                   numericpart = true;
               } else {
                   if(numericpart) {
                       break;
                   }
               }
        }


        double  xd = 0.0;

        if(end>0) {
            xd = Double.parseDouble(str.substring(0, end));
        }

        // look out for a smaller number being reversed and getting bigger
        if (xd <= Integer.MAX_VALUE && xd >= -Integer.MIN_VALUE) {

            ans = (int) xd;
            return Integer.valueOf(ans);
        }
        else if (xd <= Integer.MIN_VALUE) {

            return Integer.MIN_VALUE;

        }
        else if (xd >= Integer.MAX_VALUE) {

            return Integer.MAX_VALUE;

        } else {
            return 0;
        }

    }

}
