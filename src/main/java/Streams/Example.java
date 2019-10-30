package Streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


/*
    Mostly from  ::  https://www.baeldung.com/java-8-streams
*/


// Class
class Product {

    int id;
    String type;
    double price;

    Product(int id, String type) {
        this.id = id;
        this.type = type;
        //this.price = price;
    }

    double getPrice(){
        return 100;
    }

    static String getName(int id){
        return "Product";
    }

}


public class Example {

    private static long counter;

    private static void wasCalled() {
        counter++;
    }

    // Main
    public static void main(String ...args) {

        Example bd = new Example();
        bd.testIt();

    }


    // Dont return a null stream but an empty one!
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    // The Methods
    private void testIt() {


        // 1. Warm up
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        // 2. Lets do more -> Stream Creation
        Stream<String> streamEmpty = Stream.empty();

        System.out.println("My stream is [" + streamEmpty + "]");

        // Referencing : Arays.stream very nice
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        // Stream Builder
        // When builder is used the desired type should be additionally specified in the right part of the statement, otherwise the build() method will create an instance of the Stream<Object>:
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        // Generated
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

        // Iterate one
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

        // Stream of primities
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        // Stream of String
        IntStream streamOfChars = "abc".chars();

        // Stream of file
        Path path = Paths.get("C:\\file.txt");
        try {
            Stream<String> streamOfStrings = Files.lines(path);
            Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
        } catch (IOException ex) {

        }


        // 3 Referencing
        Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny();

        // Illegal State ?  // Cant re-use a stream
        // Optional<String> firstElement = stream.findFirst();

        List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b")).collect(Collectors.toList());
        Optional<String> anyElement1 = elements.stream().findAny();
        Optional<String> firstElement1 = elements.stream().findFirst();


        // 4. Stream Pipeline
        // To perform a sequence of operations over the elements of the data source and aggregate their results, three parts are needed – the source, intermediate operation(s) and a terminal operation.
        Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1);
        //Stream<String> twiceModifiedStream = stream.skip(1).map(element -> element.substring(0, 3));

        List<String> list9 = Arrays.asList("abc1", "abc2", "abc3");
        long size = list9.stream().skip(1).map(element -> element.substring(0, 3)).sorted().count();



        // 5. Lazy Invocation
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        //counter;
        Stream<String> stream9 = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });

        Optional<String> streamx = list.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();


        // 6 Order of Execution
        long sizex = list.stream().map(element -> {
            wasCalled();
            return element.substring(0, 3);
        }).skip(2).count();

        long size2 = list.stream().skip(2).map(element -> {
            wasCalled();
            return element.substring(0, 3);
        }).count();

        //7. Stream Reduction
        OptionalInt reducedOne = IntStream.range(1, 4).reduce((a, b) -> a + b);
        System.out.println("OptionalInt" + reducedOne);

        int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println("OptionalInt" + reducedTwoParams);

        // Reduce
        int reducedParams = Stream.of(1, 2, 3)
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    System.out.println(("combiner was called"));
                    return a + b;
                });

        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    System.out.println(("combiner was called"));
                    return a + b;
                });


        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        // Converting a stream to the Collection (Collection, List or Set):
        // List<String> collectorCollection = productList.stream().map(Product::getName).collect(Collectors.toList());
        // String listToString = productList.stream().map(Product::getName).collect(Collectors.joining(", ", "[", "]"));
        // Bad return type

        // Paralelle Streams
        Stream<Product> streamOfCollection = productList.parallelStream();
        boolean isParallel = streamOfCollection.isParallel();
        boolean bigPrice = streamOfCollection
                .map(product -> product.getPrice() * 12)
                .anyMatch(price -> price > 200);


        IntStream intStreamParallel = IntStream.range(1, 150).parallel();
        boolean isParallel1 = intStreamParallel.isParallel();

        IntStream intStreamSequential = intStreamParallel.sequential();
        boolean isParallel2 = intStreamSequential.isParallel();


}




}
