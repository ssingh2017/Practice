package org.example.array.hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String args[]){
        int [] nums = new int[]{1,2,4,4};
        System.out.println("Array contains duplicate "+hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int nums[]){
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(set.size()==nums.length)
            return false;
        else
            return true;
    }

}
