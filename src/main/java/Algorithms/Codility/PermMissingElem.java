package Algorithms.Codility;

/* Problem

An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

        Your goal is to find that missing element.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

        For example, given array A such that:

        A[0] = 2
        A[1] = 3
        A[2] = 1
        A[3] = 5
        the function should return 4, as it is the missing element.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].

 */

/*  Summary :

Find missing element again

 */

/*  Solution :

Using a list is slow so use a hash set.

 */


import java.util.HashSet;

public class PermMissingElem {

    public static void main(String[] args) {

        PermMissingElem sl = new PermMissingElem();
        int test1 = sl.solution(new int[]{2,3,1,5});
        int test2 = sl.solution(new int[]{1,2,4,5,6});
        int test3 = sl.solution(new int[]{1,2,4,5,6});

        int dave1 = sl.solution(new int[]{2,3,1,5});
        int dave2 = sl.solution(new int[]{1,2,4,5,6});
        int dave3 = sl.solution(new int[]{1,2,4,5,6});

        int expected1 = 5;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 0;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 0;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }

    public int solution (int[] A) {

        HashSet<Integer> nums  = new HashSet<>();

        for ( int i = 1; i< A.length+1; i++) {
            nums.add(i);
        }

        for ( int a : A ) {
            nums.remove(Integer.valueOf(a));
        }

        return nums.iterator().next();

    }


}
