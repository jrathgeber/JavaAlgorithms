package Algorithms.Array;

public class MissingNumber {

    // Function to find missing number
    // total of series metho
    static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;

        System.out.println("Total is : [" + total + "]");

        for ( i = 0; i< n; i++)
            total -= a[i];
        return total;
    }


    // Function to find missing number
    // Xor Method
    static int getMissingNumber (int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        /* For xor of all the elements
           in array */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        /* For xor of all the elements
           from 1 to n+1 */
        for (int i = 2; i <= n+1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }



    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6};
        int miss = getMissingNo(a,5);
        int miss2 = getMissingNumber(a,5);
        System.out.println("Missing is : [" + miss + "] [" + miss2 + "]");


        assert miss == miss2 : " Problem ";
        System.out.println("Test result " + "comming soon");




    }


}
