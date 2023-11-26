package Algorithms.Codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

        For example, in array A such that:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

        For example, given array A such that:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the function should return 7, as explained in the example above.

        Write an efficient algorithm for the following assumptions:

        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.

 */
public class OddOccurrencesInArray {

    public static void main(String[] args) {

        OddOccurrencesInArray sl = new OddOccurrencesInArray();
        int test1 = sl.solution_j(new int[]{9,3,9,3,9,7,9});
        int test2 = sl.solution_j(new int[]{9,3,9,3,9,7,9});
        int test3 = sl.solution_j(new int[]{9,3,9,3,9,7,9});

        int dave1 = sl.solution_d(new int[]{9,3,9,3,9,7,9});
        int dave2 = sl.solution_d(new int[]{9,3,9,3,9,7,9});
        int dave3 = sl.solution_d(new int[]{9,3,9,3,9,7,9});

        int expected1 = 7;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 7;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 7;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }


    public int solution_j(int[] A) {

        int ans = -1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i<A.length; i++){
            if (hs.contains(A[i])) {
                hs.remove(A[i]);
            } else {
                hs.add(A[i]);
            }
        }

        // the only one
        return hs.iterator().next();
    }

    public int solution_d(int[] A) {

        List<Integer> aList = new ArrayList<Integer> ();

        for (int i = 0; i<A.length; i++){
            int a = A[i];
            if(aList.contains(a)) {
                aList.remove(Integer.valueOf(a));
            } else {
                aList.add(a);
            }

        }
        return aList.get(0);
    }

}
