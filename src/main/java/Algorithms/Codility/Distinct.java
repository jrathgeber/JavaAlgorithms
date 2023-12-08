package Algorithms.Codility;

/*

Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1

the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];

each element of array A is an integer within the range [−1,000,000..1,000,000].

 */

import java.util.HashSet;

public class Distinct {


    public static void main(String[] args) {

        Distinct sl = new Distinct();

        int test1 = sl.solution(new int[]{2,1,1,2,3,1});
        int test2 = sl.solution(new int[]{2,1,1,2,3,1});
        int test3 = sl.solution(new int[]{2,1,1,2,3,1});

        int dave1 = sl.solution(new int[]{2,1,1,2,3,1});
        int dave2 = sl.solution(new int[]{2,1,1,2,3,1});
        int dave3=  sl.solution(new int[]{2,1,1,2,3,1});

        int expected1 = 3;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 3;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 3;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }

    public int solution(int[] A) {

         HashSet<Integer> hs  = new HashSet<>();
        for (int a : A) {

            hs.add(a);

        }

        return hs.size();

    }

}
