package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Creating {

    public static void main(String[] args) {

        String[] stringArray = new String[]{"A", "B", "C"};

        @SuppressWarnings("unused")
        List<String> myList = Arrays.asList(stringArray);


        Cat cat = new Cat("Jason");

        if (cat.getClass().isAnnotationPresent(VeryImportnant.class)) {
            out.println("Yesy");
        } else {
            out.println("No");
        }

        for (Method method : cat.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunNow.class)){
                try {
                    RunNow rn = method.getAnnotation(RunNow.class);

                    for(int i =0; i< rn.times(); i++) {
                        method.invoke(cat);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }


       for (Field field : cat.getClass().getDeclaredFields()){
           if (field.isAnnotationPresent(ImportantString.class)){
               try {
                   Object ov = field.get(cat);

                   if (ov instanceof String stringValue){
                       System.out.println(stringValue.toUpperCase());
                   }

               } catch (IllegalAccessException e) {
                   throw new RuntimeException(e);
               }




           }


       }



    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface myAnnotation {

    }



}
