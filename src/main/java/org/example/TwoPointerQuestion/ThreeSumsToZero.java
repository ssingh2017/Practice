package org.example.TwoPointerQuestion;

import java.util.*;

public class ThreeSumsToZero {
    public static void main(String [] args){
    int [] nums = {-2,0,1,1,2};
        System.out.println("Output "+ threeSum(nums));
    //[[-1,-1,2],[-1,0,1]]
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        Arrays.sort(nums);  // nlogn
        for(int i=0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            int x = nums[i];
            while(end>start){
                int y = nums[start];
                int z = nums[end];
               // System.out.println("x:"+x+" y:"+y+" z:"+z);
                if(y+z < -(x)){
                    start ++;
                }if(y+z > -(x)){
                    end --;
                }if(y+z == -x){
                    List<Integer> list = new ArrayList<>();
                    list.add(x);
                    list.add(y);
                    list.add(z);
                    if(!listOfLists.contains(list))
                        listOfLists.add(list);
                   start++;
                   end--;
                }
            }
        }
        return listOfLists;
    }
}
