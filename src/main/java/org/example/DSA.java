package org.example;

import java.util.*;

public class DSA {
    public static void main(String [] ars){
        Set<Character> set = new HashSet<>();
        String s1 = "abc";
        String s2 = "bca";
        int f [] = new int[26];
        int b [] = new int[26];

        for(int i=0;i<s1.length();i++){
            int pos = s1.charAt(i)-97;
            f[pos]++;
            System.out.print(f[pos]+" ");
        }
        System.out.println();

        for(int i=0;i<f.length;i++)
            System.out.print(f[i]+" ");

        for(int i=0;i<s2.length();i++){
            int pos = s2.charAt(i)-'a';
            b[pos]++;
        }
        System.out.println();
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");

        if(Arrays.equals(f,b))
            System.out.println("true");
    }
}
