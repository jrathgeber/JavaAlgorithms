package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {


    public static void main (String...args) {

        HashMap<String,String> test = new HashMap <String,String> ();

        test.put ("hi", "ho");
        test.put ("we", "got");

        for (Map.Entry<String,String> entry: test.entrySet()) {
            System.out.println("Key = " + entry.getKey());
        }

    }

}
