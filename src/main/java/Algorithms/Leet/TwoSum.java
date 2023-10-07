package Algorithms.Leet;

public class TwoSum
{

    // Given an int array and a number find the two elements


    public static void main (String...args){

        int nums[] = {2,7,11,15};
        int target = 3;

        int[] sol = twoSumBrute(nums, target);

        System.out.println(" " + sol[0] + " " +sol[1]);

    }


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


    public static int[] twoSumMap(int[] nums, int target) {

        // make map !


        for (int i=0 ; i < nums.length; i++) {


         //       if (nums[i] + nums[h] == target) {
         //           return new int[] {i,h};
         //       }


        }

        return new int[]{0,0};

    }



}
