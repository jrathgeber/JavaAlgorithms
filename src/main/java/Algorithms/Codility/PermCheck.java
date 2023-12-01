package Algorithms.Codility;

/*

A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].

 */


import java.util.Arrays;
import java.util.HashSet;

public class PermCheck {


    public static void main(String[] args) {

        PermCheck sl = new PermCheck();
        int test1 = sl.solution_jason(new int[]{4,1,3,2});
        int test2 = sl.solution_jason(new int[]{4,1,3});
        int test3 = sl.solution_jason(new int[]{1,2,4,5,6});

        int dave1 = sl.solution_dave(new int[]{4,1,3,2});
        int dave2 = sl.solution_dave(new int[]{4,1,3});
        int dave3= sl.solution_dave(new int[]{1,2,4,5,6});

        int expected1 = 1;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 0;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 0;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }


    public int solution_jason(int[] A) {

        Arrays.sort(A);

        for (int i = 1 ; i < A.length ; i++) {

            if (A[i-1]+1 != A[i] ) {
                return 0;
            }
        }

        return 1;

    }

    public int solution_dave(int[] A) {

        HashSet<Integer> nums  = new HashSet<>();
        for ( int i = 1; i<=A.length; i++) {
            nums.add(i);
        }

       // System.out.println(nums.toString());

        for ( int a : A ) {
            if (!nums.contains(Integer.valueOf(a))) {
                System.out.println(nums.toString() + ":" + a);

                return 0;
            }
        }

        return 1;
    }

}
