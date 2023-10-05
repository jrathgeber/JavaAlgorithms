package Algorithms.Recursion;

public class Fibonacci_memoization {


    private static long[] fibonacciCache;

    public static void main (String...args){

        int n = 50;

        fibonacciCache = new long[n + 1];

        for (int i=0; i<=n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    private static long fibonacci(int n) {

        if (n<=1){
            return n;
        }

        if(fibonacciCache[n] !=0) {

            return fibonacciCache[n];

        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return (nthFibonacciNumber);

    }


}
