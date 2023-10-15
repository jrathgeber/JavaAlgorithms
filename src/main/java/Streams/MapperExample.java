package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapperExample {


    public static void main(String[] args) {


        List<String> names = Arrays.asList("Jason", "Matteo", "Luca", "Fabio") ;


        // Now with Lambda
        names.stream().filter(name -> !name.equals("JasonR")).forEach(name ->System.out.println(name));


        // Verbose Predicate
        names.stream()
                .filter(name -> isJason(name))
                .map(new Function<String, Object>() {
                    @Override
                    public User apply(String name) {
                        User user = new User(name);
                        return user;
                    }
                })
               // .forEach(System.out::println);
                ;

        // Nice and tight
        names.stream()
                .filter(name -> isJason(name))
                .map(name -> new User(name))
                .forEach(System.out::println);

        // Collect
        List <User> userList = names.stream()
                .filter(name -> isJason(name))
                .map(name -> new User(name))
                .collect(Collectors.toList());



    }

    private static boolean isJason(String name) {
        return !name.equals("Jason");
    }


    static class User {
        private String name;
        private Integer age = 30;

        public User(String name) {
            this.name = name;
            //this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "name : " + name + " age " + age;
        }
    }


}
