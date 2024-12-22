package org.example;

import java.util.Hashtable;

public class DSA {
    public static void main(String [] ars){
        int a[] = new int[]{2,4,1,4,3,4};
        int counter =0;
        Hashtable<Integer,Integer> h = new Hashtable<>();
        for(int i : a){
            if(h.containsKey(i)){
                int count = h.get(i);
                h.put(i,++count);
            }else
                h.put(i,1);
        }

        System.out.println(h);
    }
}
