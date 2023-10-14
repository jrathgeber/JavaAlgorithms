package Algorithms.Bits;
/*
    191. Number of 1 Bits

    Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).

 */
public class OneBits {

    public static void main(String... args) {

        OneBits a = new OneBits();

        int test1 = a.hammingWeight(0000000000000000000010000001011);
        int expected1 = 3;
        System.out.println(" Out [" + test1 + "] expected + [" + expected1 + "]" );
        assert test1 == expected1 : "Error";
    }



    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);

        int ans  = 0;

        for(char c : s.toCharArray()) {
            if (c == '1') ans ++;
        }

        return ans;

    }



}
