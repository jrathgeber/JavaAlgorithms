package Algorithms.Bits;
/*
    717. 1-bit and 2-bit Characters

    We have two special characters.
    The first character can be represented by one bit 0.
    The second character can be represented by two bits (10 or 11).

    Now given a string represented by several bits.
    Return whether the last character must be a one-bit character or not.
    The given string will always end with a zero.

    Note:
    1 <= len(bits) <= 1000.
    bits[i] is always 0 or 1.

 */
public class OneTwoBits {

    public static void main(String... args) {

        OneTwoBits a = new OneTwoBits();

        boolean test1 = a.isOneBitCharacter(new int[]{1, 0, 0});
        boolean expected1 = true;
        System.out.println(" Out [" + test1 + "] expected + [" + expected1 + "]" );
        assert test1 == expected1 : "Error";

        boolean test2 = a.isOneBitCharacter(new int[]{1, 1, 1, 0});
        boolean expected2 = false;
        System.out.println(" Out [" + test2 + "] expected + [" + expected2 + "]" );
        assert test1 == expected1 : "Error";

    }



    // you need to treat n as an unsigned value
    public boolean isOneBitCharacter(int[] bits) {

        int i = 0;

        while (i < bits.length -1) {
            i = (bits[i] == 1) ? i + 2 : i + 1;
        }

        return i == bits.length -1;

    }
}
