package Algorithms.Codility;

/*

A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

        Count the minimal number of jumps that the small frog must perform to reach its target.

        Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

        For example, given:

        X = 10
        Y = 85
        D = 30
        the function should return 3, because the frog will be positioned as follows:

        after the first jump, at position 10 + 30 = 40
        after the second jump, at position 10 + 30 + 30 = 70
        after the third jump, at position 10 + 30 + 30 + 30 = 100
        Write an efficient algorithm for the following assumptions:

        X, Y and D are integers within the range [1..1,000,000,000];
        X ≤ Y.
*/


public class FrogJmp {

    public static void main(String[] args) {

        FrogJmp sl = new FrogJmp();
        int test1 = sl.solution(10, 85, 30);
        int test2 = sl.solution(10, 85, 30);
        int test3 = sl.solution(10, 85, 30);

        int dave1 = sl.solution_dave(10, 85, 30);
        int dave2 = sl.solution_dave(10, 85, 30);
        int dave3 = sl.solution_dave(10, 85, 30);

        int expected1 = 3;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 3;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 3;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }

    public int solution(int X, int Y, int D) {

        int ans =  (int)Math.ceil((Y - X) / D) ;
        System.out.println(" double [" + ans + "]");
        return ans;

    }

    public int solution_dave(int X, int Y, int D) {

        int distance = Y - X;
        int jumps = (int)Math.ceil(distance / D);

        return jumps;
    }

}
