package org.example.binarySearch;

public class FindMinInRotatedArray {
    public static void main(String args[]){
        int nums [] = new int[]{2,3,4,5,1};
        System.out.println("Minimum value is "+findMin(nums));
       // System.out.println("value "+nums[4]);
    }

    public static int findMin(int [] nums){
        int l = nums.length;
        int m = (0+l-1)/2;
        if(nums[0]>nums[l-1]){
            if(nums[0]>nums[m]){
                int min = nums[m];
                for(int i=m;i>0;i--){
                    if(nums[i]<=min) {
                        min = nums[i];
                    }
                }
                return min;
            }else{
                int min = nums[m+1];
                for(int i=m+1;i<l;i++){
                    if(nums[i]<=min)
                        min = nums[i];
                }
                return min;
            }
        }else{
            return nums[0];
        }
    }
}
