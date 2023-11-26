package Algorithms.Codility;

/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3

the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */


public class TapeEquilibrium {

    public static void main(String[] args) {

        TapeEquilibrium sl = new TapeEquilibrium();
        int test1 = sl.solution_perplexity(new int[]{3,1,2,4,3});
        int test2 = sl.solution_perplexity(new int[]{1000,-1000});

        int dave1 = sl.solution_d(new int[]{3,1,2,4,3});
        int dave2 = sl.solution_d(new int[]{1000,-1000});

        int expected1 = 1;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 1;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

    }


    public int solution_perplexity(int[] A) {

        long sumAllElements = 0;
        for(int i=0; i<A.length; i++) {
            sumAllElements += A[i];
        }
        int minDifference = Integer.MAX_VALUE;
        int currentDifference = Integer.MAX_VALUE;
        long sumFirstPart = 0;
        long sumSecondPart = 0;
        for(int p=0; p<A.length-1; p++) {
            sumFirstPart += A[p];
            sumSecondPart = sumAllElements - sumFirstPart;
            currentDifference = (int) Math.abs(sumFirstPart - sumSecondPart);
            minDifference = Math.min(currentDifference, minDifference);
        }
        return minDifference;

    }

    public int solution_d(int[] A) {

        int numbersOnRight = 0;

        for (int i = 0; i<A.length; i++){
            numbersOnRight += A[i] ;
        }

        int minDiff = Integer.MAX_VALUE;

        int numbersOnLeft = 0;
        for (int i = 0; i<A.length-1; i++) {
            numbersOnRight -= A[i];
            numbersOnLeft += A[i];

            if (Math.abs(numbersOnLeft - numbersOnRight) < minDiff) {
                minDiff = Math.abs(numbersOnLeft - numbersOnRight);
            }
        }
        return minDiff;
     }


}

