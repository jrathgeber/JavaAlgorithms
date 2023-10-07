package Algorithms.Recursion;

// from https://www.youtube.com/watch?v=k-7jJP7QFEM

// Base case

// exit stratgey


public class RecursionTutorial
{

    public static void main (String...args) {

        sayHi(10);

    }


    private static void sayHi(int count) {

        System.out.println("Hi");

        if(count <= 1) {
            return;
        }

        sayHi(count -1);

    }


}
