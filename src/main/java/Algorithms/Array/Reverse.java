package Algorithms.Array;

public class Reverse {

    /*
    *   Submitted by to me leet code on December 13th, 2018
    *
    *
    */

    public static void main(String... args) {

        Reverse r = new Reverse();

        System.out.println(r.reverse(964632435));
        System.out.println(r.reverse(1534236469));
        System.out.println(r.reverse(-2147483468));

    }



    /*
     * My reverse
     */
    public int reverse(int x) {

        System.out.print(" In " + x + " ");

        if (x >= 2147483647 || x <= -2147483468) {
            return 0;
        }

        int sign = 1;

        if (x < 0) {
            sign = -1;
        }
        int ans = 0;

        int l = String.valueOf(Math.abs(x)).length();

        char[] charArrayIn = String.valueOf(Math.abs(x)).toCharArray();
        char[] newArray = new char[l];
        int c = l-1;

        for (int z = 0; z<l;  z++ )
        {
            newArray[z] = charArrayIn[c];
            c--;
        }
        String answer = new String(newArray);

        double  ansd = Double.parseDouble(answer);

        // look out for a smaller number being reversed and getting bigger
        if (ansd <= 2147483647) {

            ans = (int) ansd;
            return Integer.valueOf(ans) * sign ;

        } else {
            return 0;
        }
    }

    // Solution from leet
    public int reverseLeetSolution(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                rev = rev * 10 + pop;
            }
            return rev;
        }


     // Good one from the comments
     public int reverseFromComments(int x)
     {
         int result = 0;

         while (x != 0)
         {
             int tail = x % 10;
             int newResult = result * 10 + tail;
             if ((newResult - tail) / 10 != result)
             { return 0; }
             result = newResult;
             x = x / 10;
         }

         return result;
     }


}
