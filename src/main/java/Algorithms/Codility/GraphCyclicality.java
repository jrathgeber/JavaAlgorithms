package Algorithms.Codility;

import java.util.HashSet;

public class GraphCyclicality {

    public boolean solution(int[] A, int[] B) {

        boolean sol = true;

        HashSet<Integer> from = new HashSet<>();

        for (int i = 0 ; i < A.length; i++) {
            from.add(i);
        }

        for ( int to : B) {

            if (!from.contains(to)) {

                sol = false;

            }
        }

        return true;

    }

}
