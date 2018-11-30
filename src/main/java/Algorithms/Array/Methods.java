package Algorithms.Array;

import java.util.Arrays;

public class Methods {

    public static void main (String ...args) {

        String test = "my string test";
        int data[] ;
        data = new int[] {10,20,30, 50, 70};

        char[] charArray = test.toCharArray();      // get char array of a String
        char x = test.charAt(1);                    // get a char at the specific index
        int s = test.length();                      // string length
        int y = data.length;                        // array size
        String hello = test.substring(1);
        String datay = test.substring(1, 2);
        int i = Integer.valueOf("10");              //string to integer
        String funny = String.valueOf(10);          //integer to string
        Arrays.sort(data);                          //sort an array
        Arrays.toString(charArray);                 //convert to string


        // java.util.Arrays.copyOf() method is in java.util.Arrays class.
        // It copies the specified array, truncating or padding with false (if necessary) so the copy has the specified length.
        int[] copy = Arrays.copyOf(data, 2);

        // int[] newArray
        int[] newArray2 = new int[10];
        System.arraycopy(data, 1, newArray2, 1, 2);


    }


}
