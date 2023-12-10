package Algorithms.Leet;

import Algorithms.Codility.zTemplate;

import java.util.*;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.


Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

public class ThreeSum {

    public static void main(String[] args) {

        ThreeSum sl = new ThreeSum();
        List<List<Integer>> test1 = sl.threeSum(new int[]{-1,0,1,2,-1,-4});
        List<List<Integer>> test2 = sl.threeSum(new int[]{-1,0,1,2,-1,-4});
        List<List<Integer>> test3 = sl.threeSum(new int[]{-1,0,1,2,-1,-4});

        List<List<Integer>> dave1 = sl.threeSum(new int[]{-1,0,1,2,-1,-4});
        List<List<Integer>> dave2 = sl.threeSum(new int[]{-1,0,1,2,-1,-4});
        List<List<Integer>> dave3 = sl.threeSum(new int[]{-1,0,1,2,-1,-4});

        ArrayList<ArrayList<Integer>> expected1 = new ArrayList<ArrayList<Integer>>();
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        //assert test1 == expected1 : "Error";

        int expected2 = 0;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        //assert test2 == expected2 : "Error";

        int expected3 = 0;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        //assert test3 == expected3 : "Error";

    }

    // This is a nice little method !

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> list = new HashSet<>();

        Arrays.sort(nums);

        for (int left=0; left< nums.length -2; left++) {

            int center = left +1;
            int right = nums.length - 1;

            while (center < right) {

                int sum = nums[left] + nums[center] + nums[right];

                if (sum == 0) list.add(Arrays.asList(nums[left], nums[center], nums[right]));
                if (sum <= 0 && center < right) center++;
                if (sum >= 0 && center < right) right--;


            }
        }

        return new ArrayList<List<Integer>>(list);

    }


}
