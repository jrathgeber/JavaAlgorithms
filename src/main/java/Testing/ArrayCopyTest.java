package Testing;

//import org.junit.Test;

public class ArrayCopyTest {

    //@Test
    //public void testCopy() {

    public static void main(String ...args) {

        for (int count = 0; count < 3; count++) {
            int size = 0x00ffffff;
            long start, end;
            Integer[] integers = new Integer[size];
            Integer[] loopCopy = new Integer[size];
            Integer[] systemCopy = new Integer[size];

            for (int i = 0; i < size; i++) {
                integers[i] = i;
            }

            start = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                loopCopy[i] = integers[i];
            }
            end = System.currentTimeMillis();
            System.out.println("for loop: " + (end - start));

            start = System.currentTimeMillis();
            System.arraycopy(integers, 0, systemCopy, 0, size);
            end = System.currentTimeMillis();
            System.out.println("System.arrayCopy: " + (end - start));
        }
    }

}
