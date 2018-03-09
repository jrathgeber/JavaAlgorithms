/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Map;


public class SimpleHashMapTestCase { 

 public static void main(String ... args) {
     
  SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
  
  map.put("duck", 7);
  map.put("goose", 42);
    
  System.out.println("duck" + map.get("duck"));
  System.out.println("goose" + map.get("goose"));
  
  //assertEquals(Integer.valueOf(7), map.get("duck"));
  //assertEquals(Integer.valueOf(42), map.get("goose"));
 
 }
 
 
 public void getSomethingThatIsntThere() {
  SimpleHashMap<Integer, String> map = new SimpleHashMap<Integer, String>();  
  //assertEquals(null, map.get(42));
 }
 
 
 public void overWriteValue() {
  
     SimpleHashMap<Integer, String> map = new SimpleHashMap<Integer, String>();
  
  map.put(42, "meh");
  //assertEquals("meh", map.get(42));
  map.put(42, "we have the technology to rebuild him");
  //assertEquals("we have the technology to rebuild him", map.get(42));
  
 }
 
 
 public void doNotOverwriteValueJustBecauseSameHashCode() {
  
        String diffButSameHash1 = "Ea";
  
        String diffButSameHash2 = "FB";
        
        //prove they really have the same hash
        //assertEquals(diffButSameHash1.hashCode(), diffButSameHash2.hashCode());
                
        SimpleHashMap<String, String> map = new SimpleHashMap<String, String>();
        
        //prove they really go into the same bucket (yes, might be overdoing it here!)
        //assertEquals(map.bucketIndexForKey(diffButSameHash1), map.bucketIndexForKey(diffButSameHash2));
                
        map.put(diffButSameHash1, "We Are All Unique");
        map.put(diffButSameHash2, "I'm Not!");
        
        //same hash but amazingly still different values!
        //assertEquals("We Are All Unique", map.get(diffButSameHash1));
        //assertEquals("I'm Not!", map.get(diffButSameHash2));
 }
}

