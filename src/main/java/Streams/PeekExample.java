package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekExample {


    public static void main(String[] args) {

           // Peek Example
           List<String> strings =  Stream.of("One", "Two", "Three")
                    .filter(obj -> !obj.equals(new String("one")))
                    .peek(obj -> System.out.println("Peeked" + obj))
                    .collect(Collectors.toList());


            // Peek Example 2
            List <String> userList = Stream.of("One", "Two", "Three")
                    .filter(name -> isJason(name))
                    .peek(name -> System.out.println("Peeked" + name))
                    .collect(Collectors.toList());

            // Integer
            List <Integer>  intstuff = IntStream.of(1,2,3,4,55,66)
                    .boxed()
                    .skip(2)
                    .filter(i -> i > 5)
                   // .forEach(System.out::println)   TODO
                    .peek(name -> System.out.println("Integer " + name))
                    .collect(Collectors.toList());

            // Integer 2
            IntStream intstuff2 = IntStream.of(1,2,3,4,55,66)
                    .skip(2)
                    .filter(i -> i > 5)
                    .peek(name -> System.out.println("Integer " + name));



            // Classy
            IntStream stream = IntStream
                    .generate(() -> { return (int)(Math.random() * 10000); });
                stream.limit(10)
                    .forEach(System.out::println);



    }

    private static boolean isJason(String name) {
        return !name.equals("Jason");
    }


}
