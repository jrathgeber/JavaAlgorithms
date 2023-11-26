package Algorithms.Codility;


public class zTemplate {

    public static void main(String[] args) {

        zTemplate sl = new zTemplate();
        int test1 = sl.solution(1);
        int test2 = sl.solution(1);
        int test3 = sl.solution(1);

        int dave1[] = sl.solution(new int[]{2,3,1,5});
        int dave2[] = sl.solution(new int[]{1,2,4,5,6});
        int dave3 []= sl.solution(new int[]{1,2,4,5,6});

        int expected1 = 5;
        System.out.println(" Out1 [" + test1 + "] expected + [" + expected1 + "] dave + [" + dave1 + "]" );
        assert test1 == expected1 : "Error";

        int expected2 = 0;
        System.out.println(" Out2 [" + test2 + "] expected + [" + expected2 + "] dave + [" + dave2 + "]" );
        assert test2 == expected2 : "Error";

        int expected3 = 0;
        System.out.println(" Out3 [" + test3 + "] expected + [" + expected3 + "] dave + [" + dave3 + "]" );
        assert test3 == expected3 : "Error";

    }

    public int solution(int n) {

        return n;

    }


    public int[] solution(int[] A) {

        int a[] = {1,2,4,5,11};

        return a;

    }

}
