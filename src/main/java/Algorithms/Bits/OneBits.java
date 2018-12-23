package Algorithms.Bits;

public class OneBits {

    public static void main(String... args) {

        OneBits a = new OneBits();

        int test1 = a.hammingWeight(00000000000000000000000000001011);
        int expected1 = 3;
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
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
