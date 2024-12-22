package org.example.array.hashing;

import java.util.HashMap;

public class TopKFrequentElement {
    public static void main(String [] args){
        int [] nums = new int[]{1,4,4,3,3,3};
        int k =2;
        topKFrequent(nums,k);
    }

    private static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num[] = new int[k];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i],++count);
            }else
                map.put(nums[i],1);
        }

        System.out.println(map);
    return null;
    }
}
