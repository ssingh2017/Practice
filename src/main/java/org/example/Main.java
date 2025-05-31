package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define an array of lists
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(2);
        map.put(1,10);
        map.put(2,20);
        map.put(5,5);
        System.out.println("map 1 "+map);
        map.get(1);
        map.putLast(1,10);
//        map.remove(1);
//        map.put(1,10);
        System.out.println("map 2 "+map);

        System.out.println("output: "+fact(5));
    }

    public static int fact(int n){
        if(n==1)
            return 1;

        return n*fact(n-1);
    }
}
