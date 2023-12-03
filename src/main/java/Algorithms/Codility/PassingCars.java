package Algorithms.Codility;

/*

A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.

        Array A contains only 0s and/or 1s:

        0 represents a car traveling east,
        1 represents a car traveling west.
        The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

        For example, consider array A such that:

        A[0] = 0
        A[1] = 1
        A[2] = 0
        A[3] = 1
        A[4] = 1
        We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

        Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

        The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

        For example, given:

        A[0] = 0
        A[1] = 1
        A[2] = 0
        A[3] = 1
        A[4] = 1
        the function should return 5, as explained above.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer that can have one of the following values: 0, 1.

 */

public class PassingCars {


    public static void main(String[] args) {

        PassingCars sl = new PassingCars();
        int test1 = sl.solution_1(new int[]{0,1,0,1,1});
        int test2 = sl.solution_1(new int[]{0,0,0,0});
        int test3 = sl.solution_1(new int[]{1,0,1,1});

        int dave1 = sl.solution_2(new int[]{0,1,0,1,1});
        int dave2 = sl.solution_2(new int[]{0,0,0,0,0});
        int dave3 = sl.solution_2(new int[]{1,0,1,1});

        int expected1 = 5;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 0;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 2;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }

    public int solution_1(int[] A) {

        int ans=0;
        int i = 0;

        for (int a : A) {

            if (a==0) {
                for (int b=i+1;b<A.length;b++){
                    if(A[b]==1) {
                        ans++;
                    }
                }
            }
            i++;
        }
        return ans;
    }


    public int solution_2(int[] A) {

        int zeros = 0;
        int passed = 0;

        for (int a : A) {

            if (a==0) {
                zeros ++;
            } else {
                passed = passed + (1 * zeros);
                System.out.println(zeros + " " +  passed);
            }
        }
        return passed;
    }

}
