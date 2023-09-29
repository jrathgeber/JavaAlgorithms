package Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Reverse {

    public static void main(String... args) {

        String[] stringArray = new String[]{"A", "B", "C"};

        List<String> myList = Arrays.asList(stringArray);

        System.out.println("mylist" + myList);

        Collections.reverse(myList);

        System.out.println("mylist" + myList);

    }

}
