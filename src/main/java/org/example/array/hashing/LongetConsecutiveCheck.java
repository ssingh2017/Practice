package org.example.array.hashing;

import java.util.*;

public class LongetConsecutiveCheck {
    public static void main(String [] args){
    //int nums [] = {9,1,4,7,3,-1,0,5,8,-1,6};
    int nums [] ={4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
    //int nums [] ={2,20,4,10,3,4,5};
        // System.out.println("result "+ longestConsecutive(nums));
        System.out.println("result "+ longestConsecutiveSecondWay(nums));
    }

    public static int longestConsecutive(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i,0);
        }
        System.out.println(map);
        if(nums.length ==0)
            return 0;

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        int length=1;
        int maxLength =1;
        for(int x=1;x<list.size();x++){
            if(list.get(x-1).equals(list.get(x)-1)){
                ++length;
                System.out.println("len - "+length+" value - "+list.get(x));
            }else{
                if(length>maxLength)
                    maxLength = length;

                length=1;
            }
            if(length>maxLength)
                maxLength = length;
            //System.out.print(list.get(x-1)+" ");
        }
        return maxLength;
    }

    //Time complexity : to add element to set - O(n) ,
    //Average time - O(n)
        public static int longestConsecutiveSecondWay(int [] nums){
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        //int counter =1;
        int maxCounter = 0;
        System.out.println(set);
        for(Integer element : set){
            int counter =1;
            if(!set.contains(element-1)){
                while(set.contains(element+counter))
                    counter++;
            }
            if(counter>maxCounter)
                maxCounter =counter;
        }


        return maxCounter;
    }
}
