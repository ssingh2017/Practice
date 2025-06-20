package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       String s = "ADc";
        System.out.println("charx "+(char)97);
       int x = s.charAt(1)-'A';
        System.out.println("x "+x);
        char c = (char) ('A'+ x);
        System.out.println("c "+c);

        int [] arr = new int[3];
        arr[1]++;
        System.out.println("arr "+arr[1]);
    }

    public static int fact(int n){
       n=10;
       return n;
    }
}
