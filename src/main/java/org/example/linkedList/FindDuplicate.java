package org.example.linkedList;

public class FindDuplicate {
    public static void main(String [] args){

        int [] nums = {1,3,4,2,2};
        //int [] nums = {3,1,3,4,2};
        System.out.println("duplicate value is "+findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int index =0;
        for(int i=0;i<nums.length;i++){

            index = Math.abs(nums[i])-1;
            System.out.println("index initial value "+index+" nums[index] "+nums[index]+" nums[i] "+nums[i] +" i "+i);
                if (nums[index] > 0)
                    nums[index] = -nums[index];
                else if(nums[index]<0)
                    return index+1;
        }
        return -1;
    }
}
