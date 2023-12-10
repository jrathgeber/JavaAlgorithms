package Algorithms.Leet;

import Algorithms.Codility.zTemplate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<List<Integer>> dave1 = sl.threeSum_nick(new int[]{-1,0,1,2,-1,-4});
        List<List<Integer>> dave2 = sl.threeSum_nick(new int[]{-1,0,1,2,-1,-4});
        List<List<Integer>> dave3 = sl.threeSum_nick(new int[]{-1,0,1,2,-1,-4});


        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(-1);
        first.add(-1);
        first.add(2);

        ArrayList<Integer> second
                = Stream.of(-1, 0, 1)
                .collect(Collectors.toCollection(
                        ArrayList::new));

        ArrayList<ArrayList<Integer>> expected1 = new ArrayList<ArrayList<Integer>>();
        expected1.add(first);
        expected1.add(second);

        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1.get(1) == expected1.get(1) : "Error";

        ArrayList<ArrayList<Integer>> expected2 = new ArrayList<>(List.of(first, second));

        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test1.get(2) == expected1.get(2) : "Error";

        ArrayList<ArrayList<Integer>> expected3 = new ArrayList<>(List.of(first, second));
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test1.get(3) == expected1.get(3) : "Error";

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

    public List<List<Integer>> threeSum_nick(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> output_arr = new LinkedList();

        for (int i=0; i<nums.length-2; i++){

            if( i == 0 || (i > 0 && nums[i] != nums[i-1])){

                int low = i+1;
                int high = nums.length-1;
                int sum = 0-nums[i];

                while (low < high) {
                    if(nums[low] + nums[high] ==sum) {

                        output_arr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high++;
                        low++;
                        high--;

                    } else if(nums[low] + nums[high] < sum) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }

        return output_arr;

    }

}
