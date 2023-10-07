package Algorithms.Leet;

import java.util.HashMap;

public class TwoSum
{

    // First ever leet code
    // Given an int array and a number find the two elements that add to the target


    public static void main (String...args){

        int nums[] = {2,7,11,15};
        int target = 26;

        int[] sol = twoSumBrute(nums, target);
        int[] sol2 = twoSumMap(nums, target);

        System.out.println("Brute " + sol[0] + " " +sol[1]);
        System.out.println("Map " + sol[0] + " " +sol[1]);

    }


    // brute for O2
    public static int[] twoSumBrute(int[] nums, int target) {

        for (int i=0 ; i < nums.length; i++) {
            for (int h = i+1; h < nums.length; h++ ) {
                if (nums[i] + nums[h] == target) {
                    return new int[] {i,h};
                }
            }
        }

        return new int[]{0,0};

    }

    private static HashMap <Integer, Integer> twoSum = new HashMap<Integer, Integer>();

    public static int[] twoSumMap(int[] nums, int target) {


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
