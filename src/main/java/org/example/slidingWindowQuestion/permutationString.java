package org.example.slidingWindowQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class permutationString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "lecabee";
        //frequencyCount(s1);
        System.out.println("Output : "+checkInclusion(s1,s2));
    }



    private static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int frequencyCount [] = new int[26];
        for(int i=0;i<s1.length();i++){
            int pos = s1.charAt(i)-'a';
            frequencyCount[pos]++;
        }
        int start =0;
        Set<Character> window = new HashSet<>();
        Character [] array = new Character[s1.length()];
            int i=0;
            while(i<s2.length()){


            int size=0;
            while(size!=s1.length()  && i<s2.length()){
                array[size]=s2.charAt(i);
                i++;
                size++;
            }
            for(Character c : array){
                System.out.print(c+" ");
            }
                System.out.println();
                if(size==s1.length()){
                    int frequencyCount2 [] = new int[26];
                    for(int j=0;j<array.length;j++){
                        int pos = array[j] -'a';
                        frequencyCount2[pos]++;
                    }
                    if(Arrays.equals(frequencyCount2,frequencyCount))
                        return true;
                    else
                        size--;
                }
            }
        return false;
    }


}
