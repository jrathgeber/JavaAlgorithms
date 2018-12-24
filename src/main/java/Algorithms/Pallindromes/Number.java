package Algorithms.Pallindromes;
import java.util.ArrayList;
/*
    Leet 9. Palindrome Number

    Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

 */
public class Number {

    public static void main(String... args) {

        Number a = new Number();

        boolean test1 = a.isPalindrome(121);
        boolean expected1 = true;
        System.out.println(" Out [" + test1 + "] expected + [" + test1 + "]" );
        assert test1 == expected1 : "Error";

        boolean test2 = a.isPalindrome(1121);
        boolean expected2 = false;
        System.out.println(" Out [" + test2 + "] expected + [" + test2 + "]" );
        assert test1 == expected1 : "Error";


    }


    public boolean isPalindrome(int x) {

        int temp = x;

        boolean result = true;

        ArrayList<Integer> array = new ArrayList<Integer>();


        do{

            if(temp < 0 ) {

                array.add(temp % 10);

                temp /= -10;

            } else {

                array.add(temp % -10);

                temp /= 10;

            }

            //System.out.println("t : " + temp);

        } while  (Math.abs(temp) > 0 );

        //System.out.println(array);

        int lng = array.size()-1;


        if(x == -1) {

            return false;
        }


        for (int i = 0; i < array.size()/2; i++){

            if ( array.get(i) - array.get(lng-i) != 0) {

                result = false;

                break;

            } else {

                result =true;

            }

        }

        return result;

    }


}
