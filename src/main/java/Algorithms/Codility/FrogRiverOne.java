package Algorithms.Codility;

/*  Problem :

A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.

Write an efficient algorithm for the following assumptions:

N and X are integers within the range [1..100,000];
each element of array A is an integer within the range [1..X].

*/

/*  Summary :

Are all the numbers full again

 */

/*  Solution :

 */

/*  Tests :

 */


import java.util.HashSet;

public class FrogRiverOne {

    public static void main(String[] args) {

        FrogRiverOne sl = new FrogRiverOne();
        int test1 = sl.solution_j(5, new int[]{1,3,1,4,2,3,5,4,3,2,1});
        int test2 = sl.solution_j(5, new int[]{1,3,1,4,2,3,5,4,1,2,3});

        int dave1 = sl.solution_d(5, new int[]{1,3,1,4,2,3,5,4});
        int dave2 = sl.solution_d(5, new int[]{1,3,1,4,2,3,5,4});


        int expected1 = 6;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 6;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";


    }


    public int solution_j(int x, int[] A) {
        int ans = 0;
        HashSet<Integer> nums  = new HashSet<>();
        for ( int i = 1; i<=x; i++) {
            nums.add(i);
        }

        for ( int a : A ) {
            nums.remove(Integer.valueOf(a));
            if (nums.size() == 0) {
                return ans;
            }
            ans++;
        }
        return -1;
    }

    public int solution_d(int x, int[] A) {

        int ans = 0;
        HashSet<Integer> nums  = new HashSet<>();
        for ( int i = 1; i<=x; i++) {
            nums.add(i);
        }

        for ( int a : A ) {
            nums.remove(Integer.valueOf(a));
            if (nums.size() == 0) {
                return ans;
            }
            ans++;
        }
        return -1;
    }

}









