package org.example.binarySearch;

public class SearchInRotatedArray {
    public static void main(String args[]){
        int nums [] = new int[]{1};
        System.out.println("present at index "+ search(nums,1));
        // System.out.println("value "+nums[4]);
    }

    public static int search(int [] nums,int target) {

        int middle = nums.length / 2;
        int deflectionPoint = 0;

        if (nums[0] > nums[nums.length - 1]){
            if (nums[0] > nums[middle]) {
                //left side is deflection
                for (int i = 0; i < middle; i++) {
                    if (nums[i] > nums[i + 1]) {
                        deflectionPoint = i;
                        break;
                    }
                }
            } else{
                //right side is deflection
                for (int i = middle; i < nums.length; i++) {
                    if (nums[i] > nums[i + 1]) {
                        deflectionPoint = i;
                        break;
                    }
                }
            }
        }else  // array not rotated
            binarySearch(nums, 0, nums.length - 1, target);

        //System.out.println("deflectionPoint "+deflectionPoint);
        // 2 sorted array
        // 0 - deflectionPoint
        // deflectionPoint+1  -  nums.length;

        if(binarySearch(nums,0,deflectionPoint,target)!=-1)
            return binarySearch(nums,0,deflectionPoint,target);
        else
            return binarySearch(nums,deflectionPoint+1,nums.length-1,target);
    }

    public static int binarySearch(int [] nums,int start , int end,int target){
        while(start<=end) {
            int middle = (start + end) / 2;
           // System.out.println("middle " + middle + " st " + start + " end " + end);
            if (target == nums[middle])
                return middle;
            if (target < nums[middle])
                return binarySearch(nums, start, middle - 1, target);

            return binarySearch(nums, middle + 1, end, target);
        }
            return -1;
    }
}
