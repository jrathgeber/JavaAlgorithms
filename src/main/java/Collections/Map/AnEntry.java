/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Map;


public class AnEntry<K, V> {
    
    private AnEntry<K, V> next;
    private final K key;
    private V value;

    public AnEntry(K key, V value) {
     this.key = key;
     this.setValue(value);
    }

    public K getKey() {
     return key;
    }

    public void setValue(V value) {
     this.value = value;
    }

    public V getValue() {
     return value;
    }

    public void setNext(AnEntry<K, V> next) {
     this.next = next;
    }

    public AnEntry<K, V> getNext() {
     return next;
    } 
 
}