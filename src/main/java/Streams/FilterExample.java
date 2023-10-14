package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterExample {


    public static void main(String[] args) {


        List<String> names = Arrays.asList("Jason", "Matteo", "Luca", "Fabio") ;

        // The old way
        // imperitive style
        for (String name : names) {
            // blah
        }

        // Full functional Predicate style
        names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.equals("Jason");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });


        // Now with Lambda
        names.stream().filter(name -> !name.equals("JasonR")).forEach(name ->System.out.println(name));


        // Method references
        names.stream().filter(name -> isJason(name)).forEach(System.out::println);


    }

    private static boolean isJason(String name) {
        return !name.equals("Jason");
    }

    

}
