package Algorithms.Recursion;

public class PowX {

    // Recursive log n i hear
    public static double myPowX(double x, int n) {
        if(n == 0 || x == 1.0) return 1.0;

        if(Math.abs(x) != 1 && n == Integer.MIN_VALUE) return 0.0;

        if(n < 0) {
            n = -n;
            x = 1/x;
        }

        return (n % 2) == 0 ? myPowX(x*x, n/2) : x * myPowX(x*x, n/2);
    }

    // Needed Help
    public static double pX(double x, int n) {

        if(n == 0 || x == 1.0) return 1.0;

        return x*pX( x, n-1);

    }

    // Stack Overflow
    public static int pow( int a, int n) {
        if ( n == 0 ) {
            return 1;
        }
        return ( a * pow(a,n-1));
    }


    // My Solution Leet Code
    public static double myPow(double x, int n) {

        if(n == 0 || x == 1.0 ) return 1.0;
        if(x == -1.0 && n == Integer.MIN_VALUE) return 1.0;
        if(Math.abs(x) != 1.0 && n == Integer.MIN_VALUE) return 0.0;

        double ans = x;

        for(int i=1; i < Math.abs(n); i++){
            ans = ans * x;
        }

        if (n>0) {
            return ans;
        } else {
            return 1/ans;
        }
    }

    public static void main (String ... args) {

        double ans1 = myPowX(2, 10);

        double ans2 = myPow (2, 10);

        double ans3 = pX (2, 10);

        double ans4 = pow (2, 10);

        System.out.println("PowX " + ans1 + " " + ans2 + " " + ans3 + " " + ans4);

    }

}
