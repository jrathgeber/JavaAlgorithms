package Algorithms.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MissingKth {

    static int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }


    static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }

        return q.peek();
    }



    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6};
        int larg = findKthLargest1(a,1);
        int larg2 = findKthLargest2(a,1);
        System.out.println("Missing is : [" + larg + "] [" + larg2 + "]");

        assert larg == larg2 : " Problem ";
        System.out.println("Test result " + "comming soon");

    }

}
