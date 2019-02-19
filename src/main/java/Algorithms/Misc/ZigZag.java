package Algorithms.Misc;

public class ZigZag {


    /*

        https://leetcode.com/articles/longest-substring-with-at-most-two-distinct-charac/#

        The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

        P   A   H   N
        A P L S I I G
        Y   I   R

        And then read line by line: "PAHNAPLSIIGYIR"

        Write the code that will take a string and make this conversion given a number of rows:


     */

    public static void main(String... args) {

        ZigZag a = new ZigZag();

        String test1 = a.convert("PAYPALISHIRING", 3);
        String expected1 = "PAHNAPLSIIGYIR";
        System.out.println(" Out " + test1);
        assert test1 == expected1 : "Error";

        String test2 = a.convert("PAYPALISHIRING", 4);
        String expected2 = "PINALSIGYAHRPI5";
        System.out.println(" Out " + test2);
        assert test2 == expected2 : "Error";


    }


    public String convert(String s, int numRows) {

        String ans = "";
        int lens = s.length();

        int c = -2;

        if(numRows== 1){return s;}


        for (int n = 0; n < numRows; n++) {

            int step = 2;

            step = (numRows-1)*2;

            c = c+2;

            for (int x = n; x< lens*3; x+=step) {

                if( x!=n && n!=0) {

                    if((x-c)<lens && (x-c)>1 && n!=numRows-1){
                        //System.out.println("c " + c + " x " + x + " n " + n + " char " + s.charAt(x-c));
                        ans  += s.charAt(x-c);
                    }
                }
                if(x<lens){
                    ans  += s.charAt(x);
                }
            }

        }

        return ans;

    }



}
