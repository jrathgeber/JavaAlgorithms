package Algorithms.Array;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Shuffle {

    // More intuitive random
    private static Random random;

    /*
     * from : https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
     *
     * Fisher-Yates - Really ??
     */

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);

            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;

        }
    }


    static void shuffleWithList(int[] arr)
    {
        List<Integer> solution = new ArrayList<>();
        for (int i = 1; i< arr.length -1; i++ ) {
            solution.add(i);
        }
        Collections.shuffle(solution);

        for (int i = 0; i < solution.size(); i++) {
            arr[i] = solution.get(i);
        }
    }



    public static void main(String args[])
    {
        int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };
        int[] solutionArray2 = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

        shuffleArray(solutionArray);
        for (int i = 0; i < solutionArray.length; i++)
        {
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println();

        shuffleWithList(solutionArray2);
        for (int i = 0; i < solutionArray2.length; i++)
        {
            System.out.print(solutionArray2[i] + " ");
        }
        System.out.println();


    }

}
