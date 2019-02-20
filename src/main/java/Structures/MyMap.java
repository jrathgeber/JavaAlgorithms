package Structures;

/*
 * Hash Map from : https://dzone.com/articles/custom-hashmap-implementation-in-java
 *
*/

/*
 * Hash map entry object
 */
class Entry<K, V> {

    // Members. A key and a value
    final K key;
    V value;

    // Entry is a linked list becuase of !
    Entry<K, V> next;

    // Constructor and pointer to next. Null first one ?
    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    // Getters, equals, hashCode and toString
    public K getKey() {
        return key;
    }
    public void setValue(V value) {
        this.value = value;
    }
    public V getValue() {
        return value;
    }
    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
    public Entry<K, V> getNext() {
        return next;
    }

}


public class MyMap<K, V> {

    // Array of Entry objects is a Hash Map
    private Entry<K, V>[] buckets;

    // Initial capacity
    private static final int INITIAL_CAPACITY = 1 << 4; // 16

    // What dis ? How many r in it I think
    private int size = 0;

    public MyMap() {
        this(INITIAL_CAPACITY);
    }

    public MyMap(int capacity) {
        this.buckets = new Entry[capacity];
    }

    public void put(K key, V value) {

        Entry<K, V> entry = new Entry<>(key, value, null);

        // Bucket is Hash of key MODULUS bucket size
        int bucket = getHash(key) % getBucketSize();

        Entry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {

            // compare the keys see if key already exists
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;

                }
                existing = existing.next;
            }

            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = entry;
                size++;
            }
        }
    }

    public int getHash(Object o) {
        return (int) o.hashCode();
    }

    public int getBucketSize() {
        return 4;
    }

    /*
     *  Voila
     */
    public V get(K key) {

        // Nice !
        Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];
        while (bucket != null) {

            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }


    public static void main(String ...args) {

            MyMap<String, String> myMap = new MyMap<>();
            myMap.put("USA", "Washington DC");
            myMap.put("Nepal", "Kathmandu");
            myMap.put("India", "New Delhi");
            myMap.put("Australia", "Sydney");

            String helloMap = myMap.get("USA");

            System.out.println("I am in [" + helloMap + "]");


    }
}
