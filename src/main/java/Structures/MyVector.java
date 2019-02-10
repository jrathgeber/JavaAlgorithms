package Structures;

/******************************************************************************
 *  Compilation:  javac MyMyVector.java
 *  Execution:    java MyMyVector
 *
 *  Implementation of a MyMyVector of real numbers.
 *
 *  This class is implemented to be immutable: once the client program
 *  initialize a MyMyVector, it cannot change any of its fields
 *  (N or data[i]) either directly or indirectly. Immutability is a
 *  very desirable feature of a data type.
 *
 *
 *  % java MyMyVector
 *  x        =  (1.0, 2.0, 3.0, 4.0)
 *  y        =  (5.0, 2.0, 4.0, 1.0)
 *  x + y    =  (6.0, 4.0, 7.0, 5.0)
 *  10x      =  (10.0, 20.0, 30.0, 40.0)
 *  |x|      =  5.477225575051661
 *  <x, y>   =  25.0
 *  |x - y|  =  5.0990195135927845
 *
 *  Note that java.util.MyMyVector is an unrelated Java library class.
 *
 *  Taken from : https://introcs.cs.princeton.edu/java/33design/MyMyVector.java.html
 *
 ******************************************************************************/

public class MyVector {

    private final int n;         // length of the MyVector
    private double[] data;       // array of MyVector's components

    // create the zero MyVector of length n
    public MyVector(int n) {
        this.n = n;
        this.data = new double[n];
    }

    // create a MyVector from an array
    public MyVector(double[] data) {
        n = data.length;

        // defensive copy so that client can't alter our copy of data[]
        this.data = new double[n];
        for (int i = 0; i < n; i++)
            this.data[i] = data[i];
    }

    // create a MyVector from either an array or a vararg list
    // this constructor uses Java's vararg syntax to support
    // a constructor that takes a variable number of arguments, such as
    // MyVector x = new MyVector(1.0, 2.0, 3.0, 4.0);
    // MyVector y = new MyVector(5.0, 2.0, 4.0, 1.0);
/*
    public MyVector(double... data) {
        n = data.length;

        // defensive copy so that client can't alter our copy of data[]
        this.data = new double[n];
        for (int i = 0; i < n; i++)
            this.data[i] = data[i];
    }
*/
    // return the length of the MyVector
    public int length() {
        return n;
    }

    // return the inner product of this MyVector a and b
    public double dot(MyVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum = sum + (this.data[i] * that.data[i]);
        return sum;
    }

    // return the Euclidean norm of this MyVector
    public double magnitude() {
        return Math.sqrt(this.dot(this));
    }

    // return the Euclidean distance between this and that
    public double distanceTo(MyVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        return this.minus(that).magnitude();
    }

    // return this + that
    public MyVector plus(MyVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        MyVector c = new MyVector(n);
        for (int i = 0; i < n; i++)
            c.data[i] = this.data[i] + that.data[i];
        return c;
    }

    // return this - that
    public MyVector minus(MyVector that) {
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        MyVector c = new MyVector(n);
        for (int i = 0; i < n; i++)
            c.data[i] = this.data[i] - that.data[i];
        return c;
    }

    // return the corresponding coordinate
    public double cartesian(int i) {
        return data[i];
    }

    // create and return a new object whose value is (this * factor)
    @Deprecated
    public MyVector times(double factor) {
        MyVector c = new MyVector(n);
        for (int i = 0; i < n; i++)
            c.data[i] = factor * data[i];
        return c;
    }

    // create and return a new object whose value is (this * factor)
    public MyVector scale(double factor) {
        MyVector c = new MyVector(n);
        for (int i = 0; i < n; i++)
            c.data[i] = factor * data[i];
        return c;
    }


    // return the corresponding unit MyVector
    public MyVector direction() {
        if (this.magnitude() == 0.0)
            throw new ArithmeticException("zero-MyVector has no direction");
        return this.scale(1.0 / this.magnitude());
    }

    // return a string representation of the MyVector
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append('(');
        for (int i = 0; i < n; i++) {
            s.append(data[i]);
            if (i < n-1) s.append(", ");
        }
        s.append(')');
        return s.toString();
    }


    // test client
    public static void main(String[] args) {
        double[] xdata = { 1.0, 2.0, 3.0, 4.0 };
        double[] ydata = { 5.0, 2.0, 4.0, 1.0 };

        MyVector x = new MyVector(xdata);
        MyVector y = new MyVector(ydata);

        System.out.println("x        =  " + x);
        System.out.println("y        =  " + y);
        System.out.println("x + y    =  " + x.plus(y));
        System.out.println("10x      =  " + x.scale(10.0));
        System.out.println("|x|      =  " + x.magnitude());
        System.out.println("<x, y>   =  " + x.dot(y));
        System.out.println("|x - y|  =  " + x.minus(y).magnitude());
    }
}

