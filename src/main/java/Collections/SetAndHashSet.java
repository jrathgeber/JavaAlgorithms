package Collections;

import java.util.*;

public class SetAndHashSet {


    public static void main (String...args) {

        Set<String> names = new HashSet<String>();

        names.add("Jason");
        names.add("Matteo");
        names.add("Fabio");
        names.add("Luca");
        names.add("Jason");
        names.remove("Jason");

        System.out.println(names);
        System.out.println(names.contains("Jake"));

        // for each
        for (String name : names) {
            System.out.println("Hi");
        }

        // lambda
        names.forEach(System.out::println);

        // iterator
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Example using this
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);


        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);

        // TreeSet -> maintain natural order

        // Linked Treeset -> maintain order of insertion

    }

}
