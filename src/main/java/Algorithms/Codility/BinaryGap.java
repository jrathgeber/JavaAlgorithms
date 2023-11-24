package Algorithms.Codility;

/*

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].

 */




public class BinaryGap {

    public static void main(String[] args) {


        BinaryGap bg = new BinaryGap();
        int test1 = bg.getGap(1041);
        int test2 = bg.getGap(15);
        int test3 = bg.getGap(32);
        int test4 = bg.getGap(9);

        int dave1 = bg.getGapDave(1041);
        int dave2 = bg.getGapDave(15);
        int dave3 = bg.getGapDave(32);
        int dave4 = bg.getGapDave(9);

        int expected1 = 5;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 0;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 0;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

        int expected4 = 2;
        System.out.println(" Out4 [" + test4 + "] expected + [" + expected4 + "] dave + [" + dave4 + "]" );
        assert test4 == expected4 : "Error";

    }


    public int getGap(int n) {

        int max = 0;
        int cur = 0;

        String s = Integer.toBinaryString(n);
        System.out.println ("S = " + s);

        boolean started = false;

        for (char c : s.toCharArray()) {
            if (c == '1'){
                if (started) {
                    if(cur > max) max = cur;
                }

                cur = 0;
                started = true;
            }

            if(c == '0') {
                cur ++;
            }

        }
        return max;
    }



    // https://www.youtube.com/watch?v=DKlu-KCQU3Q
    public int getGapDave(int n) {

        String bString = Integer.toString(n, 2);

        boolean started = false;

        int counter = 0;
        int maxCount = 0;

        for (int i=0; i< bString.length(); i++) {

            String c = bString.substring(i, i+1);
            if (c.equals("1")) {
                if(started) {
                    if (counter > maxCount) {
                        maxCount = counter ;
                    }
                }

                counter = 0;
                started = true;
            }

            if(c.equals("0")) {
                counter ++;
            }
        }

        return maxCount;

    }



    public int random_dude(int N) {
        String binaryNumber = Integer.toBinaryString(N);
        int n = binaryNumber.length();
        int maxGap =0;
        int gap =0;
        int leftInterval =0;
        int rightInterval =0;
        int i=0;

        // Find first 1
        while( i<n && binaryNumber.charAt(i)=='0') {
            i++;
        }
        // Find second 1
        if(binaryNumber.charAt(i) == '1') {
            rightInterval = i;
            i++;
            while( i<n ) {
                if(binaryNumber.charAt(i) == '1') {
                    rightInterval = i;
                    gap = rightInterval - leftInterval - 1;
                    if(gap>maxGap) {
                        maxGap = gap;
                    }
                    leftInterval = i;
                    rightInterval = i;
                }
                i++;
            }
        }
        return maxGap;
    }




}
