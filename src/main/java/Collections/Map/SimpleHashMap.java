/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Map;


public class SimpleHashMap<K, V> {
 
 private final int DEFAULT_BUCKET_COUNT = 128;
  private final AnEntry<K, V>[] buckets;
 
 public SimpleHashMap() {
  buckets = new AnEntry[DEFAULT_BUCKET_COUNT];
 }
 
 public V get(K key) {
  throwIfKeyNull(key);
  
  AnEntry<K, V> entry = buckets[bucketIndexForKey(key)];
  while (entry != null && !key.equals(entry.getKey())) 
   entry = entry.getNext();
  return entry != null ? entry.getValue() : null;
 }
 
 public void put(K key, V value) {
  throwIfKeyNull(key);
  
  int bucketIndex = bucketIndexForKey(key);
  AnEntry<K, V> entry = buckets[bucketIndex];
  
  if (null != entry) {
   boolean done = false;
   while(!done) {
    if (key.equals(entry.getKey())) {
     entry.setValue(value);
     done = true;
    } else if (entry.getNext() == null) {
     entry.setNext(new AnEntry<>(key, value));
     done = true;
    }
    entry = entry.getNext();
   }
  } else {
   //nothing there at all; just shove the new entry in
   buckets[bucketIndex] = new AnEntry<>(key, value);
  }
 }

 /**
  * THIS SHOULDN'T ACTUALLY BE PUBLIC; IT IS SO JUST FOR CLARIFICATION UNIT TEST PURPOSES
  * 
     * @param key
     * @return 
  */
 public int bucketIndexForKey(K key) {
  int bucketIndex = key.hashCode() % buckets.length;
  return bucketIndex;
 }
 
 private void throwIfKeyNull(K key) {
  if (key == null) {
   throw new IllegalArgumentException("key may not be null");
  }
 } 
}

