package Algorithms.Leet;

import Algorithms.Codility.MaxProductOfThree;

import java.util.Arrays;
import java.util.HashMap;

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

 */


public class TwoSum
{

    // First ever leet code
    // Given an int array and a number find the two elements that add to the target


    public static void main (String...args){

        TwoSum sl = new TwoSum();

        int test1[] = sl.twoSumBrute(new int[]{2,7,11,15}, 26);
        int test2[] = sl.twoSumBrute(new int[]{3,2,4,}, 6);
        int test3[] = sl.twoSumBrute(new int[]{3,3}, 6);

        int dave1[] = sl.twoSumMap(new int[]{2,7,11,15}, 26);
        int dave2[] = sl.twoSumMap(new int[]{3,2,4,}, 6);
        int dave3[]=  sl.twoSumMap(new int[]{3,3}, 6);


        int[] expected1 = new int[]{1,0};
        System.out.println(" Out1 [" + Arrays.toString(test1) + "] expected + [" + Arrays.toString(expected1) + "] dave + [" + Arrays.toString(dave1) + "]" );
        assert test1 == expected1 : "Error";

        int[] expected2 = new int[]{1,2};
        System.out.println(" Out2 [" + Arrays.toString(test2) + "] expected + [" + Arrays.toString(expected2) + "] dave + [" + Arrays.toString(dave2) + "]" );
        assert test2 == expected2 : "Error";

        int[] expected3 = new int[]{0,1};
        System.out.println(" Out3 [" + Arrays.toString(test3) + "] expected + [" + Arrays.toString(expected3) + "] dave + [" + Arrays.toString(dave3) + "]" );
        assert test3 == expected3 : "Error";

     }


    // brute for O2
    public int[] twoSumBrute(int[] nums, int target) {

        for (int i=0 ; i < nums.length; i++) {
            for (int h = i+1; h < nums.length; h++ ) {
                if (nums[i] + nums[h] == target) {
                    return new int[] {i,h};
                }
            }
        }

        return new int[]{0,0};

    }

    // Solution is to put the target in a map for each value int he array
    // ie target - current value, then when you come accross that you got it.

    public  int[] twoSumMap(int[] nums, int target) {

        HashMap <Integer, Integer> twoSum = new HashMap<Integer, Integer>();

        for (int i=0 ; i < nums.length; i++) {

            Integer ans = twoSum.get(nums[i]);

            if(ans != null) {
                return new int[]{i, ans};
            } else {
                twoSum.put(target - nums[i], i);
            }
        }
        return new int[]{0,0};
    }



}


