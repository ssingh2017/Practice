package org.example.slidingWindowQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Longest Substring Without Repeating Characters

public class LengthOfLongestSubstring {
    public static void main(String [] args){
        System.out.println("Longest substring length "+lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Longest substring length "+lengthOfLongestSubStringUsingSet("abcabcbb"));
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

    // neetcode solution.
    public static int lengthOfLongestSubStringUsingSet(String inputString){
        Set<Character> set = new HashSet<>();
        int startingIndexOfWindow = 0;
        int maxSizeWithoutRepetition = 0 ;
        for(int i=0;i<inputString.length();i++){
            while(set.contains(inputString.charAt(i))){
                set.remove(inputString.charAt(startingIndexOfWindow));
                ++startingIndexOfWindow;
            }
            set.add(inputString.charAt(i));
            maxSizeWithoutRepetition = Math.max(maxSizeWithoutRepetition,set.size());
        }
        return maxSizeWithoutRepetition;
    }
}
