package org.example.array.hashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String [] args){
        int nums [] =new int[]{3,4,5,6};
        int target = 11;
        int num [] = twoSum(nums,target);
        for(int i : num){
            System.out.print(i +" ");
        }

    }

    public static int[] twoSum(int[] nums, int target){
        int [] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
           if(map.containsKey(diff)){
              int pos =  map.get(diff);
              res[0] = pos;
              res[1] = i;
           }
            map.put(nums[i],i);
        }
        return res;
    }
}
