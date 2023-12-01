package Algorithms.Codility;

/*
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

        { i : A ≤ i ≤ B, i mod K = 0 }

        For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

        Write an efficient algorithm for the following assumptions:

        A and B are integers within the range [0..2,000,000,000];
        K is an integer within the range [1..2,000,000,000];
        A ≤ B.

 */
public class CountDiv {

    public static void main(String[] args) {

        CountDiv sl = new CountDiv();
        int test1 = sl.solution_jason(6, 11, 2);
        int test2 = sl.solution_jason(5, 120, 3);
        int test3 = sl.solution_jason(1, 2, 3);

        int dave1 = sl.solution_dave(6, 11, 2);
        int dave2 = sl.solution_dave(5, 120, 3);
        int dave3= sl.solution_dave(1,2 ,3);

        int expected1 = 3;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 0;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 0;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }


    public int solution_jason(int a, int b, int k) {

        int ans = 0;

        for (int i = a; i <= b ; i++) {
            if (i % k == 0) {
                ans++;
            }
        }

        return ans;
    }


    public int solution_dave(int a, int b, int k) {

        int base = (int)Math.ceil((double)a/k);

        base  *= k;
        b -=base;

        int count = (int)Math.floor((double) b / k);
        count ++;

        return count;
    }

}
