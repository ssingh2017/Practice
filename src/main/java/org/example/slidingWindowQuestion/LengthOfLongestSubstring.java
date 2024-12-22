package org.example.slidingWindowQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String [] args){
        System.out.println("Longest substring length "+lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Longest substring length "+lengthOfLongestSubStringUsingSet("bbbb"));
    }

    public static int lengthOfLongestSubstring(String s){
        int k = 1;
        if(s.length() == 0)
            return 0;
        int start = 0;
        for(int i=1;i<s.length();i++){
            int end = i;
            int size = end - start;

            for(int j=start;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    size = size -j-1;
                    start=j+1;
                    break;
                }
            }
            if(size+1 > k)
                k=size+1;
        }
        return k;
    }

    public static int lengthOfLongestSubStringUsingSet(String s){
        Set<Character> set = new HashSet<>();
        int start = 0;
        int size = 0 ;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                ++start;
            }
            set.add(s.charAt(i));
            size = Math.max(size,set.size());
        }
        return size;
    }
}
