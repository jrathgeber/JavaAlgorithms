package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {


    public static void main (String...args) {

        HashMap<String,String> capitalCities = new HashMap <String,String> ();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");


        for (Map.Entry<String,String> entry: capitalCities.entrySet()) {
            System.out.println("Key = " + entry.getKey());
        }

        String x = capitalCities.get("USA");

        System.out.println(x);

        // Better
        for (String i : capitalCities.keySet()) {
            System.out.println("Key : " + i);
        }


        // Print values
        for (String i : capitalCities.values()) {
            System.out.println("Value : " + i);
        }




    }

}
