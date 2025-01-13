package org.example.binarySearch.TimeMap;

import java.util.ArrayList;
import java.util.HashMap;

public class TimeMap {

    HashMap<String, ArrayList<Integer>> map;
    HashMap<Integer,String> valueMap;
    public static void main(String [] args){
        TimeMap timeMap = new TimeMap();
        timeMap.set("alice", "happy", 1);
        System.out.println(timeMap.get("alice", 1));           // return "happy"
        System.out.println(timeMap.get("alice", 2));
       // timeMap.set("aaa", "sad", 2);
        timeMap.set("alice", "sad", 3);
       // timeMap.set("alice", "sad", 10);
        System.out.println(timeMap.get("alice", 3));
       // System.out.println(timeMap.get("alice", 4));
        System.out.println("hashmap "+ timeMap.map);
        System.out.println("valueHashmap "+ timeMap.valueMap);
    }

    public TimeMap() {
        map = new HashMap<>();
        valueMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        ArrayList<Integer> list = map.containsKey(key) ? map.get(key) : new ArrayList<>();
        list.add(timestamp);
        map.put(key,list);
        valueMap.put(timestamp,value);
    }

    public String get(String key, int timestamp) {
        ArrayList<Integer> list = map.get(key);
       // System.out.println("list is "+list);
        if(list == null)
            return "";

        int middle = list.size()/2;
        int pos =0 ;
        if(list.get(middle)>=timestamp){
            //left side
            int i=0;
            while(i<=middle+1){
                if(list.get(i)<timestamp)
                    i++;
                if(list.get(i)==timestamp) {
                    System.out.println("equal "+i);
                    pos = list.get(i);
                    break;
                }
                if(list.get(i)>timestamp){
                    System.out.println("greater "+i);
                    pos = list.get(i-1);
                    break;
                }
            }
        }else{
            //right side
            int i = middle+1;
            while(i<list.size()){
                if(list.get(i)<timestamp)
                    i++;
                if(list.get(i)==timestamp) {
                    pos = i;
                    break;
                }
                if(list.get(i)>timestamp){
                    pos = i-1;
                    break;
                }
            }
        }
        System.out.println("pos "+pos);
       return valueMap.get(pos);

       //return "";
    }


}
