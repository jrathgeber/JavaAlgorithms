package Annotations;

@VeryImportnant
public class Cat {


        @ImportantString
        public String name;
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

        @RunNow(times = 3)
        public void meow() {System.out.println("Meow!");}

        public void eat() {System.out.println("Meow!");}


}
