package Algorithms.Codility;

/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

        The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

        Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

        For example, given

        A = [3, 8, 9, 7, 6]
        K = 3
        the function should return [9, 7, 6, 3, 8]. Three rotations were made:

        [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
        [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
        [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
        For another example, given

        A = [0, 0, 0]
        K = 1
        the function should return [0, 0, 0]

        Given

        A = [1, 2, 3, 4]
        K = 4
        the function should return [1, 2, 3, 4]

        Assume that:

        N and K are integers within the range [0..100];
        each element of array A is an integer within the range [−1,000..1,000].
        In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

 */

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {


        CyclicRotation cr = new CyclicRotation();
        int test1[] = cr.solution_j(new int[]{3,8,9,7,6}, 3 );
        int test2[] = cr.solution_j(new int[]{0,0,0 }, 1);
        int test3[] = cr.solution_j(new int[]{1,2,3,4}, 1 );

        int dave1[] = cr.solution_d(new int[]{3,8,9,7,6}, 3 );
        int dave2[] = cr.solution_d(new int[]{0,0,0 }, 1);
        int dave3[] = cr.solution_d(new int[]{1,2,3,4}, 1 );

        int yt1[] = cr.solution_yt(new int[]{3,8,9,7,6}, 3 );
        int yt2[] = cr.solution_yt(new int[]{0,0,0 }, 1);
        int yt3[] = cr.solution_yt(new int[]{1,2,3,4}, 1 );

        int expected1[] = {9, 7, 6, 3, 8};
        System.out.println(" Out1 [" + Arrays.toString(test1) + "] expected + [" + Arrays.toString(expected1) + "] dave + [" + Arrays.toString(dave1) + "]  yt + [" + Arrays.toString(yt1) + "]" );
        assert test1 == expected1 : "Error";

        int expected2[] = {0, 0, 0};
        System.out.println(" Out2 [" + Arrays.toString(test2) + "] expected + [" + Arrays.toString(expected2) + "] dave + [" + Arrays.toString(dave2) + "]  yt + [" + Arrays.toString(yt2) + "]" );
        assert test2 == expected2 : "Error";

        int expected3[] = {1, 2, 3, 4};
        System.out.println(" Out3 [" + Arrays.toString(test3) + "] expected + [" + Arrays.toString(expected3) + "] dave + [" + Arrays.toString(dave3) + "]  yt + [" + Arrays.toString(yt3) + "]" );
        assert test3 == expected3 : "Error";


    }



    public int[] solution_j_left(int[] A, int K) {

        int i, temp;

        for(int k=1; k<=K; k++) {

            // left rotate
            temp = A[0];
            for (i = 0; i < A.length - 1; i++)
                A[i] = A[i + 1];
            A[i] = temp;

        }

        return A;
    }

    public int[] solution_j(int[] A, int K) {

        int i, temp;

        for(int k=1; k<=K; k++) {

            // Right Rotate Array
            int lastValue = A[A.length-1];

            for (int j=A.length-2; j>=0; j--){
                A[j+1] = A[j];
            }

            A[0] = lastValue;

        }

        return A;
    }


    public int[] solution_d(int[] A, int K) {

        for(int i=0; i<K; i++) {
            int lastValue = A[A.length-1];

            for (int j=A.length-2; j>=0; j--){
                A[j+1] = A[j];
            }
            A[0] = lastValue;

        }

        return A;
    }

    public int[] solution_yt (int[] nums, int k) {

        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k,  nums.length-1);

        return nums;

    }

    public void reverse (int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }


}
