package org.example.array.hashing;

public class ProductOfArrayExceptSelf {
    public static void main(String [] args){

        int [] nums = {0,0};
        int [] res = productExceptSelf(nums);
        for (int i:res)
            System.out.print(i+" ");
    }

    public static int[] productExceptSelf(int[] nums) {

        int [] res = new int[nums.length];
        int mulWithoutZero=1;
        boolean isZeroPresent = false;
        int moreThanOneZero = 0;
        for(int i : nums){
            if(i == 0) {
                isZeroPresent =true;
                moreThanOneZero++;
            }else{
                mulWithoutZero = mulWithoutZero * i;
            }
        }
        if(moreThanOneZero > 1)
            mulWithoutZero =0;
       // System.out.println("result is  "+mulWithoutZero);

        for(int i=0;i<nums.length;i++){
            if(isZeroPresent){
                res[i] =0;
                if(nums[i] == 0)
                    res[i] = mulWithoutZero;
            }else
                res[i] = mulWithoutZero/nums[i];
        }
        return res;
    }
}
