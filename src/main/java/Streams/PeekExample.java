package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekExample {


    public static void main(String[] args) {

           List<String> strings =  Stream.of("One", "Two", "Three")
                    .filter(obj -> !obj.equals(new String("one")))
                    .peek(obj -> System.out.println("Peeked" + obj))
                    .collect(Collectors.toList());


            // Collect
            List <String> userList = Stream.of("One", "Two", "Three")
                    .filter(name -> isJason(name))
                    .peek(name -> System.out.println("Peeked" + name))
                    .collect(Collectors.toList());


            List <Integer>  intstuff = IntStream.of(1,2,3,4,55,66)
                    .boxed()
                    .skip(2)
                    .filter(i -> i > 5)
                   // .forEach(System.out::println)   TODO
                    .collect(Collectors.toList());


            IntStream stream = IntStream
                    .generate(() -> { return (int)(Math.random() * 10000); });
                stream.limit(10)
                    .forEach(System.out::println);



    }

    private static boolean isJason(String name) {
        return !name.equals("Jason");
    }


}
