package Algorithms.Misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Vt {


    static class Person {

        private String id;
        private String name;

        Person(String id, String name){

            this.id = id;
            this.name = name;

        }

    }

    private static boolean isPalindrome(String ss) {

        boolean result = true;

        int strlen = ss.length();

        for (int x=0; x<strlen/2; x++) {

            if(ss.charAt(x) - ss.charAt(strlen-x-1) != 0 ) {
                result = false;
                break;
            }

        }

        return result;

    }



    public static void main (String ...args) {

        // Map
        Person one = new Person("1", "Jason");
        Person two = new Person ("2", "lisa");

        Map<String,Person> pmap = new HashMap<String,Person>();

        pmap.put("one", one);
        pmap.put("two", one);

        boolean bb = isPalindrome("aba");
        System.out.println(bb);

        boolean bc = isPalindrome("andnae");
        System.out.println(bc);



        //Fiz, Bas, Number
        for (int x = 1; x<=100; x++) {

            if ((x % 3) == 0 && (x % 5 ==0)) {

                System.out.println("FisBas");

            } else if (x % 3 == 0 ) {

                System.out.println("Fis");

            } else if (x % 5 == 0) {

                System.out.println("Bas");

            } else {

                System.out.println(x);

            }
        }
    }
}
