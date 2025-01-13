package org.example.linkedList;

import java.util.LinkedHashMap;

public class LRUCache {
    LinkedHashMap<Integer,Integer> map;
    int capacity ;
    public static void main(String [] args){
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 10);  // cache: {1=10}
        System.out.println( lRUCache.get(1));      // return 10
        lRUCache.put(2, 20);  // cache: {1=10, 2=20}
        lRUCache.put(3, 30);  // cache: {2=20, 3=30}, key=1 was evicted
        System.out.println( lRUCache.get(2));         // returns 20
        System.out.println( lRUCache.get(1));        // return -1 (not found)
    }

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.get(key)==null)
            return -1;
        int value = map.get(key);
        map.putLast(key,value);
        return value;
    }

    public void put(int key, int value) {
        if(map.size()>=capacity){
            map.remove(map.firstEntry().getKey());
        }
        map.put(key,value);
    }
}
