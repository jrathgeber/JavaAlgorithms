package Streams;

import java.util.Optional;

public class OptionalTutorial {

    public static void main(String[] args) {

        Optional<Cat> optionalCat = findCatByName("Fred");

        if(optionalCat.isPresent()) {
            System.out.println(optionalCat.get().getAge());
        } else {
            System.out.println(0);
        }

        Cat myCat = optionalCat.orElse(new Cat("UNKNOWN"));

        int myCatAge =  optionalCat.map(Cat::getAge).orElse(0);

    }


    private static Optional<Cat> findCatByName (String name) {

        Cat cat = new Cat(name);
        return Optional.ofNullable(cat);

    }


    static class Cat {
        private String name;
        private Integer age = 30;

        public Cat(String name) {
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
