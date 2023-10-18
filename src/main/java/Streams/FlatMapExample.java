package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<User> names = Arrays.asList(

                new User("Jason", 50, Arrays.asList("1")),
                new User("Matteo", 50, Arrays.asList("2")),
                new User("Luca", 50, Arrays.asList("2")),
                new User("Fabio", 50, Arrays.asList("4"))
        ) ;

        Optional<String> stringOptional = names.stream()
                        .map( user ->  user.getPhoneNumbers().stream())
                        .flatMap((Function<? super Stream<String>, ? extends Stream<? extends String>>) stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("4")))
                        .findAny();

        stringOptional.ifPresent(System.out::println);

        System.out.println("Functional Style");

    }

    private static boolean isJason(String name) {
        return !name.equals("Jason");
    }


    static class User {

        private String name;
        private Integer age = 30;
        private List<String> phoneNumbers;

        public User(String name, Integer age, List<String> phoneNumbers) {
            this.name = name;
            this.age = age;
            this.phoneNumbers = phoneNumbers;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
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
