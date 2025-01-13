package org.example.binarySearch.TimeMap;

import java.util.HashMap;

public class TimeMapO_NTime {

    HashMap<String,String> map;
    public static void main(String [] args){
        TimeMapO_NTime timeMap = new TimeMapO_NTime();
        timeMap.set("alice", "happy", 1);
        System.out.println(timeMap.get("alice", 1));           // return "happy"
        timeMap.set("aaa", "sad", 2);
        timeMap.set("alice", "sad", 3);
        System.out.println(timeMap.get("alice", 3));
        System.out.println(timeMap.get("alice", 4));
        System.out.println("hashmap "+ timeMap.map);
    }

    public TimeMapO_NTime() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.put(timestamp+":"+key,value);
    }

    public String get(String key, int timestamp) {

        String mapKey = timestamp+":"+key;
        String value = map.get(mapKey);
        while(value==null && timestamp>0){// if key not present then it is linear search.
            timestamp--;
            mapKey = timestamp+":"+key;
            value = map.get(mapKey);
        }

        return value!=null ? value : "";
    }
}
